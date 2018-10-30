# demo-chunk-server

Very simple server that responds with `Transfer-encoding: chunked` data. Created to work on the answer to a [StackOverflow](https://stackoverflow.com/questions/52669764/how-do-you-read-and-print-a-chunked-http-response-using-java-net-http-as-chunks/53057925#53057925) question.

It's published as a docker container. To run:

```
docker run -p 8080:8080 hohonuuli/demo-chunk-server
```

Then point your browser or HTTP tool at <http://localhost:8080/chunk/10>. The `10` in the URL represents the number of chunks that the server will respond with.