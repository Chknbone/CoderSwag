package com.palarran.coderswag.Controller

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.palarran.coderswag.Adapters.ProductsAdapter
import com.palarran.coderswag.R
import com.palarran.coderswag.Services.DataService
import com.palarran.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {


	lateinit var adapter : ProductsAdapter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_products)

		val categoryType =  intent.getStringExtra(EXTRA_CATEGORY)

		//returns the category type/option that was clicked on in the MainActivity
		adapter = ProductsAdapter(this, DataService.getProducts(categoryType))

		var spanCount = 2
		val orientation = resources.configuration.orientation
		if (orientation == Configuration.ORIENTATION_LANDSCAPE) spanCount = 3

		val screenSize = resources.configuration.screenWidthDp
		if (screenSize > 720) spanCount = 3

		//layoutManager is required when using Recyclerview
		val layoutManager = GridLayoutManager(this, 2)
		productListView.layoutManager = layoutManager
		productListView.adapter = adapter
	}
}
