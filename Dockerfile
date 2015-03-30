FROM fortruce/lein

EXPOSE 80

ADD . .

RUN lein uberjar

ENTRYPOINT ["java", "-jar", "target/hello-world-standalone.jar"]
