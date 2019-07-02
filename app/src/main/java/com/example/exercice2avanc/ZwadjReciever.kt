package com.example.exercice2avanc

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Build
import android.util.Log
import android.widget.Toast

class ZwadjReciever : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {


        val actionInterested = intent?.extras?.getString("actionInterested")
        val actionNotInterested = intent?.extras?.getString("actionNotInterested")
//        Log.i("onReceive","Executing")

        if(actionInterested != null){
            val i = Intent(context, InterstedActivity::class.java)
            context?.startActivity(i)
        }

        if(actionNotInterested != null){
            val i = Intent(context, InterstedActivity::class.java)
            context?.startActivity(i)
        }

    }


}