package com.simonsvoss.hiltunderstanding

import javax.inject.Inject
import javax.inject.Singleton

// @Singleton
// @Provides
// fun provideSingletonConstructorBinding(): SingletonConstructorBinding = SingletonConstructorBinding()
// OR
@Singleton
class SingletonConstructorBinding @Inject constructor() {
    init {
        println("DEBUG: ${javaClass.simpleName}.init()")
    }
}
