# strongDM SDK for Java

This is the official [strongDM](https://www.strongdm.com/) SDK for the Java programming language.

## Installation

Gradle:

```gradle
repositories {
    maven {
        url  "https://dl.bintray.com/strongdm/strongdm-sdk-java" 
    }   
}

dependencies {
    compile "io.github.strongdm:strongdm-sdk-java:${strongdm.version}"
	...
```

## Authentication

If you don't already have them you will need to generate a set of API keys, instructions are here: [API Credentials](https://www.strongdm.com/docs/admin-guide/api-credentials/)

Add the keys as environment variables; the SDK will need to access these keys for every request.
```bash
$ export SDM_API_ACCESS_KEY=<YOUR ACCESS KEY>
$ export SDM_API_SECRET_KEY=<YOUR SECRET KEY>
```

## List Users
The following code lists all registered users:

```java
try {
	client = new Client(System.getenv("SDM_API_ACCESS_KEY"),System.getenv("SDM_API_SECRET_KEY"));
	Iterable<Account> resp = client.accounts().list("");
	for (Account n : resp) {
		if (n instanceof User) {
			User u = (User)n;
			System.out.println(u.getEmail());
		}
	}
} catch (Exception e) {
	e.printStackTrace();
}
```

## Useful Links

* Documentation:  [javadoc](https://strongdm.github.io/strongdm-sdk-java-docs/)
* Examples: [GitHub - strongdm/strongdm-sdk-java-examples](https://github.com/strongdm/strongdm-sdk-java-examples)

## License

[Apache 2](https://github.com/strongdm/strongdm-sdk-java/blob/master/LICENSE)

## Contributing 

Currently, we are not accepting pull requests directly to this repository, but our users are some of the most resourceful and ambitious folks out there. So, if you have something to contribute, find a bug, or just want to give us some feedback, please email <support@strongdm.com>.
