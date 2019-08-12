package com.example.lol.rv

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var avatar = (R.drawable.acupcake)
        var avatar2 = (R.drawable.aicecreamsandwich)
        var avatar3 = (R.drawable.ajellybean)
        var avatar4 = (R.drawable.ahoneycomb)
        var avatar5 = (R.drawable.agingerbread)
        var avatar6 = (R.drawable.afroyo)
        var avatar7 = (R.drawable.aeclair)
        var avatar8 = (R.drawable.adonut)


        var list = mutableListOf<Android>()
        list.add(Android("Cupcake", "1.5", avatar))
        list.add(Android("Donut", "1.6", avatar8))
        list.add(Android("Eclair", "2.0", avatar7 ))
        list.add(Android("Froyo", "2.2", avatar6 ))
        list.add(Android("Gingerbread", "2.3", avatar5))
        list.add(Android("Honeycomb", "3.0", avatar4))
        list.add(Android("Ice Cream Sandwich", "4.0", avatar3))
        list.add(Android("Jelly Bean", "4.1 to 4.3.1", avatar2))




        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(list)

        rvList.adapter = viewAdapter
        rvList.layoutManager = viewManager

    }
}
