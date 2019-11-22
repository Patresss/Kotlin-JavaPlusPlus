# Kotlin == Java++


## 1. Hello world

#### Java

```java
public class HelloWorldApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

```

#### Kotlin
```kotlin
fun main() {
    println("Hello World!")
}
```

## 2. Variables
### a) Declaration
#### Java
```java
    public final double PI = 3.14;
    public final double CALUCLATED_PI = calculatePi();

    public void type() {
        String stringValue = "Value";
        final String STRING_CONSTANT = "Const value";

        var value = "Value";
        final var CONSTANT = "Const value";
    }

    private double calculatePi() {
        return 3.14;
    }
```

#### Kotlin
```kotlin
const val PI = 3.14
val CALCULATED_PI = calculatePi()

fun type() {
    var stringValue: String = "Value"
    val STRING_CONSTANT: String = "Const value"

    var value = "Value"
    val CONSTANT = "Const value"

    // value = 128 <- error
}

fun calculatePi(): Double {
    return 3.14
}
```
### b) Optional

#### Java
```java
Optional.ofNullable(name)
    .map(String::toUpperCase)
    .orElse("UNKNOWN");
```

#### Kotlin
```kotlin
name?.toUpperCase ?: "UNKNOWN"
```

## 3. Function
### a) Single-expression functions

#### Java
Not implemented
```java
String changeMyName(String name) {
    return Optional.ofNullable(name).map(String::toUpperCase).orElse("UNKNOWN");
}
```

#### Kotlin
```kotlin
fun changeMyName(name: String?) = name?.toUpperCase() ?: "UNKNOWN"
```

### b) Default arguments

#### Java
Not implemented
```java

changeMyName("Patryk");
changeMyName("Patryk", "My default value");

...

String changeMyName(String name, String defaultName) {
    return Optional.ofNullable(name)
            .map(String::toUpperCase)
            .orElse(defaultName);
}

String changeMyName(String name) {
    return getMyName(name, "UNKNOWN");
}
```

#### Kotlin
```kotlin
changeMyName("Patryk")
changeMyName("Patryk", "My default value")

...

fun changeMyName(name: String?, defaultName: String = "UNKNOWN") = name?.toUpperCase() ?: defaultName
```

### c) Named arguments

#### Java
Not implemented

#### Kotlin
```kotlin
changeMyName(defaultName = "My default value", name = "Patryk")

...

fun changeMyName(name: String?, defaultName: String = "UNKNOWN") = name?.toUpperCase() ?: defaultName

```


### d) Extension function

#### Java
Not implemented
```java
StringUtil.myCapitalize("patryk");

...

class StringUtil {

    static String myCapitalize(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }
}

```

#### Kotlin
```kotlin
"patryk".myCapitalize()

...

fun String.myCapitalize() = this.substring(0, 1).toUpperCase() + this.substring(1)
```

### e) Infix notation

#### Java
Not implemented

#### Kotlin
```kotlin
val date = 2 JANUARY 2018

...

infix fun Int.JANUARY(year: Int) = Date(year - 1900, Calendar.JANUARY, this)
```

### f) Method names with spaces

#### Java
Not implemented

#### Kotlin
```kotlin
@Test
fun `Should return true if the user is active`() {
//    ...
}
```


## 3. Class
### a) Data class
#### Java
```java
public class Person {

    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

}
```

#### Kotlin
```kotlin
data class Person(val name: String, val surname: String)
```
### b) Singleton
#### Java
```java
public class SynchronizedSingleton {

    private static SynchronizedSingleton instance = null;

    private SynchronizedSingleton() {
    }

    private synchronized static void createInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton();
        }
    }

    public static SynchronizedSingleton getInstance() {
        if (instance == null) {
            createInstance();
        }
        return instance;
    }

}

```

#### Kotlin
```kotlin
object SynchronizedSingleton {

}
```

## 4. String
#### Java
```java
String string = name + " " + surname;
```

#### Kotlin
```kotlin
val string = "$name $surname"
```

## 5. Delegate
### a) Lazy
#### Java
```java
String calculatedValue = null;

...

String getCalculatedValue() {
    if (calculatedValue == null) {
        System.put.prinltn("in progress ...";)
        calculatedValue = takeFromDatabase(); 
    }
    return calculatedValue;
}
```

#### Kotlin
```kotlin
val calculatedValue: Int by lazy {
    println("in progress ...")
    takeFromDatabase()
}
```

### b) Observable
#### Java
```java
Integer observable = null;

...

void setObservable(Integer n) {
    System.out.println("Old: " + observable + " new: " + n);
    observable = n;
}
```

#### Kotlin
```kotlin
var observable: Int by observable(0) { property, oldValue, newValue ->
    println("Old: $oldValue and new: $newValue")
}
```

## 5. Range
#### Java
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

#### Kotlin
```kotlin
for (i in 1..5) {
    println(i)
}
```

## 6. When
#### Java
```java
Not implemented

```

#### Kotlin
```kotlin
fun showType(objectToCheck: Any): String {
    return when (objectToCheck) {
        0 -> "Number: zero"
        in 10..99 -> "Two digits number"
        is String -> "String: ${objectToCheck.length}" // smart casting
        else -> "Unknown type"
    }
}
```

## 7. Collection
#### Java
```java
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7);
List<Integer> evenNumbers = list.stream()
        .filter(number -> number % 2 == 0)
        .collect(Collectors.toList());
```

#### Kotlin
```kotlin
val list = listOf(1, 2, 3, 4, 5, 7)
val evenNumbers = list.filter { it % 2 == 0 }
```
