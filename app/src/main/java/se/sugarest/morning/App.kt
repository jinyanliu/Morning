package se.sugarest.morning

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        component = buildComponent()
    }

    private fun buildComponent(): AppComponent {
        return DaggerAppComponent.builder().build()
    }

    companion object {
        lateinit var component: AppComponent
            private set
    }
}