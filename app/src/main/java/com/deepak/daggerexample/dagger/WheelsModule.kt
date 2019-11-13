package com.deepak.daggerexample.dagger

import com.deepak.daggerexample.car.Rims
import com.deepak.daggerexample.car.Tires
import com.deepak.daggerexample.car.Wheels
import dagger.Module
import dagger.Provides


@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @Provides
    fun provideTires(): Tires {
        var tires = Tires()
        tires.inflate();
        return tires
    }

    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }
}