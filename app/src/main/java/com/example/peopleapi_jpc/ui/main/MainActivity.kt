package com.example.peopleapi_jpc.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.peopleapi_jpc.ui.ViewModel.PeopleViewModel
import com.example.peopleapi_jpc.ui.nav.NavHostScreen
//import com.example.peopleapi_jpc.ui.nav.NavHostScreen
import com.example.peopleapi_jpc.ui.screens.peopleMainScreen
import com.example.peopleapi_jpc.ui.theme.PeopleAPIJPCTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PeopleAPIJPCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    val viewModels: PeopleViewModel = viewModel()
                    val navController = rememberNavController()
//                    NavHostScreen(navController = navController, peopleViewModel = viewModel())

                    NavHostScreen(navController = navController, peopleViewModel = viewModel())
                }
            }
        }
    }
}

