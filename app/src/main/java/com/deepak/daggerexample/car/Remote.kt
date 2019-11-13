package com.deepak.daggerexample.car

import android.util.Log
import com.deepak.daggerexample.MainActivity
import dagger.Module
import javax.inject.Inject

@Module
class Remote @Inject constructor(){

    fun setListener(car: Car) {
        Log.d(MainActivity.TAG,"\nEnabling remote for car :"+car)
    }
}