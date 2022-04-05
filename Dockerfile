FROM gradle:jdk10
VOLUME /app
WORKDIR /app
COPY --chown=gradle:1000 . .
ENTRYPOINT ["/bin/bash", "-c"]