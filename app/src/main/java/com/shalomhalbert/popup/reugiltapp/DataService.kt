package com.shalomhalbert.popup.reugiltapp

import android.os.AsyncTask

object DataService {
    class Boutique(id: String?, name: String?, description: String?) {
        val id: String? = id
        val name: String? = name
        val description: String? = description
    }
    interface DataHandler {
        fun onLoad(boutiques: List<Boutique>)
    }
    fun loadData(handler: DataHandler) {
        object : AsyncTask<Void, Void, Void>() {
            override fun doInBackground(vararg params: Void?): Void? {
                Thread.sleep(2000)
                handler.onLoad(dirtyData())
                return null
            }
        }.execute()
    }
    private fun dirtyData(): List<Boutique> {
        val boutiques = ArrayList<Boutique>()
        boutiques.add(Boutique("123", "Welcome to Rue", "Rue boutique for new users!"))
        boutiques.add(Boutique(null, "For the Chef on Your List: Calphalon to Cuisinart", "Nothing but the finest kitchen gear"))
        boutiques.add(Boutique("234", "Pandora", "Top jewelry deals"))
        boutiques.add(Boutique("456", "All-Access Style: Week of December 14", "The best deals in town"))
        boutiques.add(Boutique("567", "The Kids' Holiday Shop", null))
        boutiques.add(Boutique("678", "Brooks Brothers", "Styles for all ages"))
        boutiques.add(Boutique("123", "For the Chef on Your List: Calphalon to Cuisinart", "The finest kitchen gear for your home"))
        boutiques.add(Boutique("789", null, "The best deals in town"))
        boutiques.add(Boutique("890", "The Kids' Holiday Shop", "The best gifts for kids to adults alike"))
        boutiques.add(Boutique("678", "Brooks", "Styles for everyone"))
        return boutiques
    }
}