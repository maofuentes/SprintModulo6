package cl.revolt.final6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cl.revolt.final6.ViewModel.ProductoViewModel
import cl.revolt.final6.navigation.NavManager
import cl.revolt.final6.ui.theme.Final6Theme
import dagger.hilt.android.AndroidEntryPoint

//ayuda a compilar la totalidad de la Aplicacion
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewModel: ProductoViewModel by viewModels()
        setContent {
            Final6Theme {
                NavManager(viewModel)
            }
        }
    }
}
