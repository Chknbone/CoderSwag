package com.palarran.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.palarran.coderswag.Adapters.CategoryRecycleAdapter
import com.palarran.coderswag.R
import com.palarran.coderswag.Services.DataService
import com.palarran.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	lateinit var adapter: CategoryRecycleAdapter //custom adapter CategoryRecycleAdapter.kt

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		//adapter with all data (context, where data is coming from)
		adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
			val productIntent = Intent(this, ProductsActivity::class.java)
			productIntent.putExtra(EXTRA_CATEGORY, category.title)
			startActivity(productIntent)
		}

		//tell listView who/where it needs to listen to
		categoryListView.adapter = adapter

		val layoutManager = LinearLayoutManager(this)
		categoryListView.layoutManager = layoutManager
		categoryListView.setHasFixedSize(true)
	}
}
