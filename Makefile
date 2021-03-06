default: init

init:
	@git config --local user.name hkloudou
	@git config --local user.email hkloudou@gmail.com
	@git config --local user.signingkey 575A0CADC23D0A96
	@git config --local commit.gpgsign true
	@git config --local autotag.sign true
git:
	make protoc
	make mod
	
	-git autotag -commit 'fix proto struct' -t -f -p
mod:
	go build ./...
doc:
	rm -rf docs
	/usr/local/lib/ruby/gems/2.6.0/gems/gluegun-0.1.2/gluegun generate readme/docs.yml
	/usr/local/lib/ruby/gems/2.6.0/gems/gluegun-0.1.2/gluegun generate readme/docs_cn.yml
	@docker run --rm -it -v ${PWD}/docs/:/var/www/ -p 80:80 svenbrnn/alpine-lighttpd2:latest
protoc:
	@echo "golang SDK buiding..."
	@protoc -I=webfontproto/ webfontproto/webfont.proto --go_out=plugins=grpc:sdk/golang/webfontsdk
	@echo "golang SDK buiding..."
	@python -m grpc_tools.protoc -Iwebfontproto/ --python_out=sdk/python --grpc_python_out=sdk/python webfontproto/webfont.proto
	@echo "nodejs SDK buiding..."
	@cd webfontproto &&  grpc_tools_node_protoc --js_out=import_style=commonjs,binary:../sdk/node/lib/ --grpc_out=../sdk/node/lib/ --plugin=protoc-gen-grpc=`which grpc_tools_node_protoc_plugin` webfont.proto
	@echo "ruby SDK building..."
	@#gem install grpc gem install grpc-tools
	@/usr/local/lib/ruby/gems/2.6.0/bin/grpc_tools_ruby_protoc -I webfontproto/ --ruby_out=sdk/ruby/ --grpc_out=sdk/ruby/ webfontproto/webfont.proto
	@echo "java sdk building"
	@rm sdk/java/src/main/proto/* && cp webfontproto/webfont.proto sdk/java/src/main/proto/
	@cd sdk/java && ./gradlew installDist