package com.example.androiddevchallenge.model

import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.example.androiddevchallenge.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Puppy(var breed:String,var photo:Int,var description:String) : Parcelable