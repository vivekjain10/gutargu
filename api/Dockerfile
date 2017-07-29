FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD build/libs/api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
