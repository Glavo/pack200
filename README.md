# Pack200

Here is the pack200 extracted from JDK 13. It is compatible with Java 8 and supports (JPMS) Java Platform Module System.
You just need to use `org.glavo.pack200.Pack200` instead of `java.util.jar.Pack200`.

It is published to Maven central. You can add dependencies on it in this way:

Maven:
```xml
<dependency>
  <groupId>org.glavo</groupId>
  <artifactId>pack200</artifactId>
  <version>0.3.0</version>
</dependency>
```

Gradle:
```kotlin
dependencies {
  implementation("org.glavo:pack200:0.3.0")
}
```


Compared with the pack200 implementation in JDK 13, the native implementation has been deleted, 
leaving only the pure java implementation, so you may notice some performance degradation.