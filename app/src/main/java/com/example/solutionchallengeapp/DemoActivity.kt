package com.example.solutionchallengeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class DemoActivity : AppCompatActivity() {
    private val IntroSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlide(
                "Welcome to Solution Challenge App",
                "This app is designed to help you find solutions to the problems you face in your daily life.",
                R.drawable.demo1
            ),
            IntroSlide(
                "Find Solutions",
                "You can find solutions to your problems by searching for them in the search bar.",
                R.drawable.demo2
            ),
            IntroSlide(
                "Post Your Problems",
                "You can post your problems and let others help you find a solution.",
                R.drawable.demo3
            )
        )
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        val introSliderViewPager = findViewById<ViewPager2>(R.id.introSliderViewPager)
        introSliderViewPager.adapter = IntroSliderAdapter

    }
}