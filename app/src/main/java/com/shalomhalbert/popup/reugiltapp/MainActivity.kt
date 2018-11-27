package com.shalomhalbert.popup.reugiltapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Todo: Inialize RecyclerView
        var list = linkedMapOf<DataService.Boutique>()

        var handler = object: DataService.DataHandler {
            override fun onLoad(boutiques: List<DataService.Boutique>) {
                for(item in boutiques){
                    list.put(item.name, item)
                }
            }
        }

        DataService.loadData(handler)
    }
}


