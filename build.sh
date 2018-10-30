#!/usr/bin/env bash

gradlew shadowJar && \
    docker build -t hohonuuli/demo-chunk-server . && \
    docker push hohonuuli/demo-chunk-server