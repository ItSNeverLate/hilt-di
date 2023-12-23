package com.simonsvoss.hiltunderstanding

import javax.inject.Inject

class Interface1Impl : Interface1 {
    init {
        println("DEBUG: ${javaClass.simpleName}.init()")
    }
}
