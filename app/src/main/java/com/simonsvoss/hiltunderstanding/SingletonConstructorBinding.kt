package com.simonsvoss.hiltunderstanding

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SingletonConstructorBinding @Inject constructor() {
    init {
        println("DEBUG: ${javaClass.simpleName}.init()")
    }
}
