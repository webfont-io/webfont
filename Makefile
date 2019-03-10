default: init

init:
	@git config --local user.name hkloudou
	@git config --local user.email hkloudou@gmail.com
	@git config --local user.signingkey 575A0CADC23D0A96
	@git config --local commit.gpgsign true
	@git config --local autotag.sign true
git:
	git autotag -commit '重构SDK' -tag=true -push=true
tag:
	@ make mod
	- git add . && git commit -S -m 'auto tag'
	- git tag -a -f -m -s latest
	- git autotag && git push origin master -f --tags
	@echo "current version:`git describe`"
mod:
	go build ./...
doc:
	rm -rf docs
	/usr/local/lib/ruby/gems/2.6.0/gems/gluegun-0.1.2/gluegun generate readme/docs.yml
	/usr/local/lib/ruby/gems/2.6.0/gems/gluegun-0.1.2/gluegun generate readme/docs_cn.yml
	@docker run --rm -it -v ${PWD}/docs/:/var/www/ -p 80:80 svenbrnn/alpine-lighttpd2:latest
protoc:
	protoc -I=webfontproto/ webfontproto/webfont.proto --go_out=plugins=grpc:sdk/golang/webfontsdk
	protoc -I=webfontproto/ --python_out=sdk/python/webfontsdk webfontproto/webfont.proto