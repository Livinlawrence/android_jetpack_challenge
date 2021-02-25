package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.Routes.PuppyHome
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.view.puppyDetails
import com.example.androiddevchallenge.ui.view.puppyHome


@Composable
fun PuppyApp() {
    val navController = rememberNavController()
    val actions = remember(navController) { Actions(navController) }
    MyTheme {
        NavHost(
            navController,
            startDestination = PuppyHome
        )
        {
            composable(PuppyHome) { puppyHome(actions.showPuppyDetails) }
            composable(
                "puppyDetail/{pos}",
                arguments = listOf(navArgument(Routes.PuppyArgs.POSITION) {
                    type = NavType.IntType
                })
            ) { backStackEntry ->
                backStackEntry.arguments?.getInt(Routes.PuppyArgs.POSITION)?.let {
                    puppyDetails(
                        pos = it,
                    )
                }
            }
        }
    }
}