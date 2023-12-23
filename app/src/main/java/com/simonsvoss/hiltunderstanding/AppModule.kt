package com.simonsvoss.hiltunderstanding

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
// Hilt Module:
// Bindings for types that cannot be constructor-injected
// such as interfaces or classes that are not contained in your project.
@InstallIn(SingletonComponent::class)
// Components:
// SingletonComponent	     -> Application
// ActivityRetainedComponent -> N/A
// ViewModelComponent	     -> ViewModel
// ActivityComponent	     -> Activity
// FragmentComponent	     -> Fragment
// ViewComponent	         -> View
// ViewWithFragmentComponent -> View annotated with @WithFragmentBindings
// ServiceComponent	         -> Service
object AppModule {
    // In Kotlin, modules that only contain @Provides functions can be object classes.
    // This way, providers get optimized and almost in-lined in generated code.

    @Provides
    // We can annotate a function with @Provides in Hilt modules to tell Hilt
    // how to provide types that cannot be constructor injected.
    @Singleton
    // Provide the same database instance
    fun provideClass1Instance(): Class1 = Class1()

    @Provides
    // The function body of a function that is annotated with @Provides
    // will be executed every time Hilt needs to provide an instance of that type.
    // This way, Interface1 is injectable not Interface1Impl
    fun provideInterface1Instance(): Interface1 = Interface1Impl()
    // By binds:
    // abstract class AppModule2 { ....
    //      @Binds
    //      abstract fun bindInterface1Instance(impl: Interface1Impl): Interface1
    // class Interface1Impl @Inject constructor() : Interface1
}
