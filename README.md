# Toast

# Toasty-Android
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=16)

<a href="https://www.linkedin.com/in/estiak-sourav/">
    <img src="https://img.shields.io/badge/Support-Recommed%2FEndorse%20me%20on%20Linkedin-yellow?style=for-the-badge&logo=linkedin" alt="Recommend me on LinkedIn" /></a>

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	implementation 'com.github.estiak-sourav:toast:1.0.1'
}
```
## Usage

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

To display an default Toast:

``` java
Toasty.defaults(this, "Defaults")
```
To display a success Toast:

``` java
Toasty.success(this, "Success"));
```
To display a warning Toast:

``` java
Toasty.warning(this, "warning"));
```
To display the error Toast:

``` java
Toasty.error(this, "error"));
```
To display an info Toast:

``` java
Toasty.info(this, "info"));
```
To display the confusing Toast:

``` java
Toasty.confusing(this, "confusing"));
```
You can set toast duration, you can pass value of toast length otherwise perform default "Toasty.LENGTH_SHORT".
``` java
Toasty.success(this, "Success", Toasty.LENGTH_LONG));
```

## Screenshots


<img src="https://github.com/estiak-sourav/Toast/blob/master/Screenshot_2022-06-30-15-19-06-01_0eb14638b4ec4e571b0be58593eea3a6.jpg">


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/estiak-sourav/Toast/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

### Contact - Let's become friend
- [Github](https://github.com/estiak-sourav/)
- [Linkedin](https://www.linkedin.com/in/estiak-sourav/)

<p>
Don't forget to star ⭐ the repo it motivates me to share more open source
</p>

## Donation
 If you want so knock me <a href="https://www.linkedin.com/in/estiak-sourav/">
    <img src="https://img.shields.io/badge/Support-Linkedin-yellow?style=for-the-badge&logo=linkedin" /></a>


```
Copyright 2022 Estiak Ahmed

It's free, you use or customize but not sale any where.
