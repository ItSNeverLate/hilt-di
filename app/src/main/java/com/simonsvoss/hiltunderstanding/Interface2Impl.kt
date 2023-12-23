package com.simonsvoss.hiltunderstanding

import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

// This way, Interface2Impl is injectable not Interface2
@Singleton
class Interface2Impl @Inject constructor() : Interface2 {
    init {
        println("DEBUG: ${javaClass.simpleName}.init()")
    }
}
