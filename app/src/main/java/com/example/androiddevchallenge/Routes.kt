package com.example.androiddevchallenge

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.Routes.PuppyDetail
import com.example.androiddevchallenge.Routes.PuppyHome
import com.example.androiddevchallenge.model.Puppy

object Routes {
    const val PuppyHome = "puppyHome"
    const val PuppyDetail = "puppyDetail"

    object PuppyArgs {
        const val POSITION = "pos"
    }
}

class Actions(navController: NavHostController) {
    val showPuppyDetails: (Int) -> Unit = { pos ->
        navController.navigate("$PuppyDetail/$pos")
    }
}
