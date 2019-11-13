package com.deepak.daggerexample.car

import android.util.Log
import com.deepak.daggerexample.MainActivity
import com.deepak.daggerexample.dagger.PerActivity
import javax.inject.Inject


@PerActivity
class Car @Inject constructor(var driver: Driver,var engine: Engine, var wheels: Wheels){

    fun drive(){
        engine.start()
        Log.d(MainActivity.TAG,"This Car " + this+ " is driving here. \nThe Driver Object:" + driver + " \nHis name is:" + driver.name)
    }

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }
}