package com.simonsvoss.hiltunderstanding

import javax.inject.Inject

class ConstructorBinding @Inject constructor() {
    init {
        println("DEBUG: ${javaClass.simpleName}.init()")
    }
}
