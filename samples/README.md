# Running samples

Instructions for running:

1. Run `gradle init` and follow the prompts to create a Java application.

2. In the generated `build.gradle` file, add the following line to the
    `dependencies` block:
	```
    runtimeOnly "io.grpc:grpc-protobuf:1.25.0"
    runtimeOnly "io.grpc:grpc-stub:1.25.0"
    implementation "org.json:json:20190722"
	implementation name: "strongdm-sdk-<INSERT SDK VERSION HERE>"
	```

3. Pick one of the sample java files, move it into `src/main/java/<your package
   name>` and rename it to replace the existing `App.java` file in that
   directory.

4. Run `gradle run`