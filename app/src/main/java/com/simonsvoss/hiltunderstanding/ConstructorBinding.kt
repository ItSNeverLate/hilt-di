package com.simonsvoss.hiltunderstanding

import javax.inject.Inject

// @Provides
// fun provideConstructorBinding(): ConstructorBinding = ConstructorBinding()
// OR
class ConstructorBinding @Inject constructor() {
    init {
        println("DEBUG: ${javaClass.simpleName}.init()")
    }
}
