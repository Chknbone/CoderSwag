package com.palarran.coderswag.Controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.palarran.coderswag.Adapters.ProductsAdapter
import com.palarran.coderswag.R
import com.palarran.coderswag.Services.DataService
import com.palarran.coderswag.Utilities.EXTRA_CATEGORY
import com.palarran.coderswag.Utilities.EXTRA_PRODUCT_DETAIL
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {


	lateinit var adapter : ProductsAdapter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_products)



//		//returns the category type/option that was clicked on in the MainActivity
//		adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) { category ->
//			val productIntent = Intent(this, ProductsActivity::class.java)
//			productIntent.putExtra(EXTRA_CATEGORY, category.title)
//			startActivity(productIntent)
//		}
		val categoryType =  intent.getStringExtra(EXTRA_CATEGORY)
		adapter = ProductsAdapter(this, DataService.getProducts(categoryType)) { product ->
			val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
			productDetailIntent.putExtra(EXTRA_PRODUCT_DETAIL, product)
			startActivity(productDetailIntent)
		}

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
