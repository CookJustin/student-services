FROM tomcat:9.0.24
VOLUME /tmp
COPY target/student-services-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/docker-springboot.war
EXPOSE 8086
ENTRYPOINT [ "sh", "-c", "java -Dspring.profiles.active=docker -Djava.security.egd=file:/dev/./urandom -jar /usr/local/tomcat/webapps/docker-springboot.war" ]