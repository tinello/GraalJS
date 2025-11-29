# GraalJS


## Require

 - Java 23
 - Maven 3.9


Generate package
```
mvn clean package
```

Run
```
java -XX:+EnableJVMCI -Dpolyglotimpl.DisableMultiReleaseCheck=true -jar ./target/graaljs-1.0.0.jar Pepe
```