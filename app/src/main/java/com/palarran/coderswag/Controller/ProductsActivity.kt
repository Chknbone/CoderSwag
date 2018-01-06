package com.palarran.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.palarran.coderswag.R
import com.palarran.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_products)

		val categoryType =  intent.getStringExtra(EXTRA_CATEGORY)
	}
}
