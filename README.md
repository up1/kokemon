# kokémon

This project shows how to implement MVP in Android. Is basically [this](https://github.com/matoelorriaga/pokemon) project, but using Kotlin.

```groovy
// Android Support Library
compile 'com.android.support:appcompat-v7:25.2.0'
compile 'com.android.support:design:25.2.0'
compile 'com.android.support:cardview-v7:25.2.0'
compile 'com.android.support:recyclerview-v7:25.2.0'
compile 'com.android.support:support-v4:25.2.0'
compile 'com.android.support:support-annotations:25.2.0'

// Kotlin Standard Library
compile "org.jetbrains.kotlin:kotlin-stdlib:1.1.0"

// Dagger 2
compile 'com.google.dagger:dagger:2.9'
annotationProcessor 'com.google.dagger:dagger-compiler:2.9'

// Gson
compile 'com.google.code.gson:gson:2.8.0'

// OkHttp
compile 'com.squareup.okhttp3:okhttp:3.6.0'
compile 'com.squareup.okhttp3:logging-interceptor:3.6.0'

// Retrofit
compile 'com.squareup.retrofit2:retrofit:2.1.0'
compile 'com.squareup.retrofit2:converter-gson:2.1.0'
compile 'com.squareup.retrofit2:adapter-rxjava:2.1.0'

// Picasso
compile 'com.squareup.picasso:picasso:2.5.2'

// RxJava & RxAndroid
compile 'io.reactivex:rxjava:1.1.6'
compile 'io.reactivex:rxandroid:1.2.1'

// JUnit
testCompile 'junit:junit:4.12'

// Mockito
testCompile 'org.mockito:mockito-core:1.10.19'

// Hamcrest
testCompile 'org.hamcrest:hamcrest-junit:2.0.0.0'

// Kotlin Test Support
testCompile "org.jetbrains.kotlin:kotlin-test:1.1.0"
testCompile "org.jetbrains.kotlin:kotlin-test-junit:1.1.0"

// Espresso
androidTestCompile 'com.android.support.test.espresso:espresso-core:2.2.2'

// RESTMock
androidTestCompile 'com.github.andrzejchm.RESTMock:android:0.2.0'
```
