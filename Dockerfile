FROM openjdk:8
# LABEL maintainer="THBS"
ADD target/todo-0.0.1-SNAPSHOT.jar todo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "todo-0.0.1-SNAPSHOT.jar" ]
