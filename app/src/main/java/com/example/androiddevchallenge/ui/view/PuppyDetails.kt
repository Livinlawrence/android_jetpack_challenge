package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.integerArrayResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.Utils.getPuppy
import com.example.androiddevchallenge.model.Puppy
import com.example.androiddevchallenge.ui.theme.purple500


@Composable
fun puppyDetails(pos:Int) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text ="Puppy adoption app") }
            )
        },
        content = {
            buildPuppyDetails(getPuppy(pos))
        }
    )
}

@Composable
fun buildPuppyDetails(puppy: Puppy) {
    MaterialTheme {
        val typography = MaterialTheme.typography
        Column(
            modifier = Modifier.padding(16.dp).verticalScroll(rememberScrollState())
        ) {
            Image(
                painter = painterResource(puppy.photo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.FillWidth
            )
            Spacer(Modifier.height(20.dp))

            Text(puppy.breed,
                style = typography.h4)
            Spacer(Modifier.height(5.dp))
            Text(puppy.description, textAlign = TextAlign.Left,
                style = TextStyle(
                    fontSize = 20.sp, color = Color.DarkGray,fontFamily = FontFamily.Default,lineHeight = 30.sp
                ),)
        }
    }
}

