# Kamino
Wrapper for Amino API on Kotlin

### Usage

1. Put kamino.jar file to «your module»/libs
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

### Login by email
```kotlin
val amino = Amino()
runBlocking {
    amino.loginByEmail("email", "password")
}
```
### Or
```kotlin
val amino = Amino("email", "password")
runBlocking {
    amino.loginByEmail()
}
```
### Login by phone number
```kotlin
val amino = Amino()
runBlocking {
    amino.loginByPhoneNumber("phone number", "password")
}
```
### Or
```kotlin
val amino = Amino("phone code", "phone number", "password")
runBlocking {
    amino.loginByPhoneNumber()
}
```
### Login by secret
```kotlin
val amino = Amino()
runBlocking {
    amino.loginBySecret("secret")
}
```
### Or
```kotlin
val amino = Amino("secret")
runBlocking {
    amino.loginBySecret()
}
```
### Automatically detect the login method 
```kotlin
val amino = Amino("email", "password")
runBlocking {
    amino.login()
}
```
### All login... methods can accept device id
```kotlin
val amino = Amino()
runBlocking {
    amino.loginByEmail("email", "password", deviceID = "device id")
}
```
### All login... methods return account information
```kotlin
val amino = Amino()
runBlocking {
    val info = amino.loginByEmail("email", "password")
    println("Nickname: ${info.userProfile.nickname}"}
}
```
