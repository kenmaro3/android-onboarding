package com.example.onboarding.util

import androidx.annotation.DrawableRes
import com.example.onboarding.R

sealed class OnBoardingPage(
    @DrawableRes
    val image: Int,
    val title: String,
    val description: String
){
    object First: OnBoardingPage(
        image = R.drawable.page1,
        title = "Meeting",
        description = "Lorem ipsum dolor sit amet, "
    )

    object Second: OnBoardingPage(
        image = R.drawable.page2,
        title = "Coordination",
        description = "Lorem ipsum dolor sit amet, "
    )

    object Third: OnBoardingPage(
        image = R.drawable.page3,
        title = "Dialogue",
        description = "Lorem ipsum dolor sit amet, "
    )
}