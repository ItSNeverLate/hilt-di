package com.simonsvoss.hiltunderstanding

import javax.inject.Inject

class Interface1Impl @Inject constructor() : Interface1 {
    init {
        println("DEBUG: ${javaClass.simpleName}.init()")
    }
}
