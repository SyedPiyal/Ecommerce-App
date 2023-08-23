package com.piyal.ecommerceapp.util

import android.view.View
import androidx.fragment.app.Fragment
import com.piyal.ecommerceapp.R
import com.piyal.ecommerceapp.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.piyal.ecommerceapp.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.piyal.ecommerceapp.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}