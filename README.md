# Kamino
Wrapper for Amino API on Kotlin

### Usage

1. Put .jar file to «your module»/libs
2. Add dependencies
## Groovy Gradle
```groovy
implementation 'org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3'
implementation 'io.ktor:ktor-client-cio:2.0.1'
implementation 'io.ktor:ktor-client-core:2.0.1'
```
## Kotlin Gradle
```kotlin
implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
implementation("io.ktor:ktor-client-cio:2.0.1")
implementation("io.ktor:ktor-client-core:2.0.1")
```
3. Add kotlinx.serialization plugin
## Groovy Gradle
```groovy
plugins {
    id 'org.jetbrains.kotlin.plugin.serialization' version '1.6.21'
}
```
## Kotlin Gradle
```kotlin
plugins {
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.21"
}
```
4. Add main dependency
## Groovy Gradle
```groovy
implementation files('libs/kamino.jar')
```
## Kotlin Gradle
```kotlin
implementation(files("libs/kamino.jar"))
```
5. Import the Amino class and start using it

