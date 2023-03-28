package com.example.peopleapi_jpc.ui.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.peopleapi_jpc.ui.ViewModel.PeopleViewModel
import com.example.peopleapi_jpc.ui.screens.peopleMainScreen
import com.example.peopleapi_jpc.util.Constant.Companion.KEY_PEOPLE_ID
import com.example.peopleapi_jpc.util.Constant.Screens.HOME_SCREEN

sealed class Screens(val route: String) {
    object home: Screens(route = HOME_SCREEN)
}

@Composable
fun NavHostScreen(navController: NavHostController,peopleViewModel: PeopleViewModel) {
    NavHost(navController = navController, startDestination = Screens.home.route){
        composable(route = Screens.home.route){
            peopleMainScreen(peopleViewModel = peopleViewModel, navController = navController)
        }
    }
}