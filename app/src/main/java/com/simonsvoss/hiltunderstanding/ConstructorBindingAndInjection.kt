package com.simonsvoss.hiltunderstanding

import javax.inject.Inject

class ConstructorBindingAndInjection @Inject constructor(instance: ConstructorBinding) {
    init {
        println("DEBUG: ${javaClass.simpleName}.init() constructorInjectedInstance ${instance.toMemAddress()}")
    }
}
