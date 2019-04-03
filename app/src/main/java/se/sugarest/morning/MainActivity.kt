package se.sugarest.morning

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addFragment(TeamMemberNamesFragment())
    }

    private fun addFragment(fragment: Fragment, addToBackStack: Boolean = false) {
        val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            .add(android.R.id.content, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        if (addToBackStack)
            fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
