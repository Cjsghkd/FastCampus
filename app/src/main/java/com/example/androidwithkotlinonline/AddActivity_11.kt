package com.example.androidwithkotlinonline

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class AddActivity_11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add11)

        var carList = mutableListOf<Car>()
        for (i in 0..10) {
            carList.add(Car("" + i + "번째 자동차", "" + i + "번째 엔진"))
//            "" + int => 문자
        }

        val container = findViewById<LinearLayout>(R.id.container)
        val inflater = LayoutInflater.from(this)
        carList.forEach {
            val carItemView = inflater.inflate(R.layout.car_item, null)
            val carImage = carItemView.findViewById<ImageView>(R.id.carImage)
            val nthCar = carItemView.findViewById<TextView>(R.id.nthCar)
            val nthEngine = carItemView.findViewById<TextView>(R.id.nthEngine)

            carImage.setImageDrawable(resources.getDrawable(R.drawable.blue_backgroud, this.theme))
            nthCar.text = it.nthCar
            nthEngine.text = it.nthEngine

            container.addView(carItemView)
        }



    }
}


class Car(val nthCar : String, val nthEngine : String) {

}