package com.palarran.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.palarran.coderswag.Adapters.CategoryAdapter
import com.palarran.coderswag.R
import com.palarran.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	lateinit var adapter: CategoryAdapter //this is the custom adapter created in CategoryAdapter.kt

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		//adapter with all data (context, where data is coming from)
		adapter = CategoryAdapter(this, DataService.categories)

		//tell listView who/where it needs to listen to
		categoryListView.adapter = adapter
	}
}
