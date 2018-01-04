package com.palarran.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.palarran.coderswag.Model.Category
import com.palarran.coderswag.R
import com.palarran.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	lateinit var adapter: ArrayAdapter<Category>

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		//adapter with all data (context, where the data is going, where data is coming from)
		adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, DataService.categories)

		//tell listView who/where it needs to listen to
		categoryListView.adapter = adapter
	}
}
