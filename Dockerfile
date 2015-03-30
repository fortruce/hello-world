FROM fortruce/lein

EXPOSE 4321

ADD . .

RUN lein uberjar

ENTRYPOINT ["java", "-jar", "target/hello-world-standalone.jar"]
