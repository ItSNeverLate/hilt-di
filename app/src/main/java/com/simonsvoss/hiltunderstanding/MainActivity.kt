package com.simonsvoss.hiltunderstanding

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.simonsvoss.hiltunderstanding.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var constructorBindingInstance: ConstructorBinding

    @Inject
    lateinit var singletonConstructorBindingInstance: SingletonConstructorBinding

    @Inject
    lateinit var constructorBindingAndInjectionInstance: ConstructorBindingAndInjection

    @Inject
    lateinit var singletonConstructorBindingAndInjectionInstance: SingletonConstructorBindingAndInjection

    @Inject
    lateinit var class1Instance1: Class1

    @Inject
    lateinit var class1Instance2: Class1

    @Inject
    lateinit var interface1ImplInstance1: Interface1

    @Inject
    lateinit var interface1ImplInstance2: Interface1

    @Inject
    lateinit var interface2ImplInstance: Interface2Impl

    init {
        println("DEBUG: MainActivity.init()")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        println("DEBUG: MainActivity.onCreate()")
        super.onCreate(savedInstanceState)

        println("DEBUG: Constructor Binding Instance: ${constructorBindingInstance.toMemAddress()}")
        println("DEBUG: Constructor Binding Instance (Singleton): ${singletonConstructorBindingInstance.toMemAddress()}")

        println("DEBUG: Constructor Binding And Injection Instance: ${constructorBindingAndInjectionInstance.toMemAddress()}")
        println("DEBUG: Constructor Binding And Injection Instance (Singleton): ${singletonConstructorBindingAndInjectionInstance.toMemAddress()}")

        println("DEBUG: Class1 Instance 1 (Singleton Provider): ${class1Instance1.toMemAddress()}")
        println("DEBUG: Class1 Instance 2 (Singleton Provider): ${class1Instance2.toMemAddress()}")

        println("DEBUG: Interface1Impl Instance 1 by Interface1 (Provider): ${interface1ImplInstance1.toMemAddress()}")
        println("DEBUG: Interface1Impl Instance 2 by Interface1 (Provider): ${interface1ImplInstance2.toMemAddress()}")
        println("DEBUG: @Inject lateinit var interface1ImplInstance3: Interface1Impl -> cannot be provided without an @Inject constructor or an @Provides-annotated method.")

        println("DEBUG: Interface2Impl Instance by Interface2 (Constructor): ${interface2ImplInstance.toMemAddress()}")
        println("DEBUG: @Inject lateinit var interface2ImplInstance: Interface2 -> cannot be provided without an @Provides-annotated method.")

        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}
