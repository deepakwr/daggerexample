package com.deepak.daggerexample.dagger

import com.deepak.daggerexample.MainActivity
import com.deepak.daggerexample.car.Car
import dagger.BindsInstance
import dagger.Subcomponent
import javax.inject.Named

@PerActivity
@Subcomponent(/*dependencies = [AppComponent::class],*/modules = arrayOf( WheelsModule::class,PetrolEngineModule::class))//DieselEngineModule::class))//
interface ActivityComponent {

    fun getCar(): Car

    fun inject(activity: MainActivity)

//    @dagger.Subcomponent.Builder    //      --Examples--
//    interface Builder{
//
//        fun horsePower(@BindsInstance @Named("horse power") horsePower:Int):Builder
//
//
//        fun engineCapacity(@BindsInstance @Named("engine capacity") engineCapacity:Int):Builder
//
////        fun appComponent(appComponent: AppComponent):Builder
//
//        fun build():ActivityComponent
//
//    }

    @Subcomponent.Factory
    interface Factory{

        fun create(@BindsInstance @Named("horse power") horsePower:Int,@BindsInstance  @Named("engine capacity") engineCapacity:Int):ActivityComponent

    }
}