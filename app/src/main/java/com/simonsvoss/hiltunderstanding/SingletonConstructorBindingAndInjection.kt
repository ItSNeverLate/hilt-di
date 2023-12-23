package com.simonsvoss.hiltunderstanding

import javax.inject.Inject

class SingletonConstructorBindingAndInjection @Inject constructor(instance: SingletonConstructorBinding) {
    init {
        println("DEBUG: ${javaClass.simpleName}.init() constructorInjectedInstance ${instance.toMemAddress()}")
    }
}
