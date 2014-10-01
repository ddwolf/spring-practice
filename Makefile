ALL:
	reset
	mvn package
	sudo cp target/my-app.war /var/lib/tomcat6/webapps/
	sudo rm /var/lib/tomcat6/webapps/my-app/ -r -f
	sudo echo "" > /var/log/tomcat6/catalina.out
	sudo /etc/init.d/tomcat6 restart
	tail -f /var/log/tomcat6/cat*.out
