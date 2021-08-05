
# Kotlin or Java

## Things you should know before reading

### Kotlin is Java

- Only **Kotlin-JVM** is in the scope
- Kotlin is not a replacement of Java, it's **better Java**
- Kotlin has the same package way (jar), same build tool (Gradle), same dependencies (Spring/Jackson etc.), same IDE as Java and runs on JVM
- **Kotlin won't change the way how you build and ship your Java project. It's just a language level improvement**


## Why Kotlin

### Pros

- Less verbose than Java
- Complete interoperability with Java
- Statically compiled
- Null Safety
```kotlin
Java:
public Integer nullSafe(String str) {  
    if (str != null) {  
        return str.length();  
  }  
    if (Optional.of(str).isPresent()) {  
        return str.length();  
  }  
    return 0;  
}

Kotlin:
fun nullSafe(str: String?): Int? {  
    return str?.length  
}
```
- Data class & Immutability `val` - This also reduces the needs of **builders**.
```kotlin
Java: hashCode/Equals/toString needs to be overridden
public class Person {  
    private String name;  
  
 public String getName() {  
        return name;  
  }  
  
    public void setName(String name) {  
        this.name = name;  
  }
}

Or you can use lombok, but still annotations are required
Kotlin:
data class Person(val name: String)
```
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html)
- Extension functions to wrap/fix broken APIs
- Easily understood by Java developers in comparison to some of the other JVM languages like Scala or Clojure.
- Good conventions (all classes closed by default)
- Good collections support (filtering, transforming, etc)
- **gradle.kts**, no groovy anymore
- Invariant Arrays
- File and String support
```kotlin
Java: 
public void strConcat(String str) {  
    System.out.println("This is a str: " + str);  
}
Kotlin:
fun strConcat(str: String) {  
    println("This is a str $str")
    val str: String = inputStream.bufferedReader().use { it.readText() }
}
```
- The Kotlin standard libraries can provide enough to omit utility libraries (e.g. guava, apache utils)
- `method names that allow spaces for test readability`
```kotlin
Java: 
@Test
public void test1With2With3With4(){   
}
@Test
Kotlin:
fun `test 1 with 2 with 3 with 4`() {  
}
```
- Good tooling: JetBrains IntelliJ, Gradle, Spring, Mockk etc., and more world if Kotlin-Native become a thing in future.
- Good backing and support (JetBrains)
- Reduces some of the low level cermony when dealing with Input and Output streams:
  `val str: String = inputStream.bufferedReader().use { it.readText() }`
- Fully compatible with Junit 5
- [Kdoc](https://kotlinlang.org/docs/kotlin-doc.html) supports markdown fo more readable documentation
- Kotlin has its own libs/frameworks except Java libs/frameworks, there is a potential Kotlin-Native can be leveraged in future
- Potential to improve general developer job satisfaction "Kotlin is the most loved programming language with a satisfaction average of 9.1 out of 10. https://www.jrebel.com/blog/java-development-tools-usage-stats
- Using Kotlin could be interpreted as technical maturity and may help in attracting new talent

### Cons

- Requirement to open classes: https://kotlinlang.org/docs/reference/compiler-plugins.html
- Some learning curve for **Java-only** devs.
- Frameworks breaking Kotlin immutability (proxies via Spring/Hibernate)


### JetBrains comparison

- https://kotlinlang.org/docs/comparison-to-java.html

## Summary

- Small improvements make a language robust and better, Jetbrains knows what are the pains of being a Java developer
