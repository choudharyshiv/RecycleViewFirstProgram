package com.zopsmart.test2

import FlowerAdapter
import FlowerData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zopsmart.test2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var recyclerView : RecyclerView
    lateinit var  globalFlowerList : ArrayList<FlowerData>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        recyclerView = findViewById(R.id.recyclerview)
        //set layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)

        //init the flower list
        globalFlowerList = initFlowersList()

        //call adapter and pass the list
        var flowerAdapter = FlowerAdapter(this , globalFlowerList)
        //set adapter to the recycler view
        recyclerView.adapter = flowerAdapter


    }

    private fun initFlowersList() : ArrayList<FlowerData>{
        var flowerData1  = FlowerData(R.drawable.flower1 , "Rose")
        var flowerData2  = FlowerData(R.drawable.flower2 , "Lily")
        var flowerData3 = FlowerData(R.drawable.flower3, "Lotus")
        var flowerData4  = FlowerData(R.drawable.flower , "Sun Flower")
        var flowerData5 = FlowerData(R.drawable.flowers , "Marigold")

        var flowerList = ArrayList<FlowerData>()
        flowerList.add(flowerData1)
        flowerList.add(flowerData2)
        flowerList.add(flowerData3)
        flowerList.add(flowerData4)
        flowerList.add(flowerData5)


        return flowerList
    }


}