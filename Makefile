ALL:
	mvn package
	sudo cp target/my-app.war /var/lib/tomcat6/webapps/
	sudo /etc/init.d/tomcat6 restart
