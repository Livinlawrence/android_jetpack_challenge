package com.example.androiddevchallenge

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringArrayResource
import com.example.androiddevchallenge.model.Puppy

object Utils {
    val images = arrayListOf(
        R.drawable.puppyone,
        R.drawable.puppytwo,
        R.drawable.puppythree,
        R.drawable.puppyfour,
        R.drawable.puppyfive,
        R.drawable.puppysix,
        R.drawable.puppyseven,
        R.drawable.puppyeight,
        R.drawable.puppynine,
    )

    @Composable
    fun getPuppies(): MutableList<Puppy> {
        var puppies: MutableList<Puppy> = mutableListOf()
        val puppyBreed = stringArrayResource(R.array.breed)
        val puppyDesc = stringArrayResource(R.array.desc)
        for (i in puppyBreed.indices) {
            puppies.add(Puppy(puppyBreed[i], images[i], puppyDesc[i]))
        }
        return puppies
    }

    @Composable
    fun getPuppy(pos:Int): Puppy {
        val puppyBreed = stringArrayResource(R.array.breed)
        val puppyDesc = stringArrayResource(R.array.desc)
        return Puppy(puppyBreed[pos], images[pos], puppyDesc[pos])
    }
}