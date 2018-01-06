package com.palarran.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.palarran.coderswag.Model.Category
import com.palarran.coderswag.R


class CategoryRecycleAdapter(val context: Context, val categories: List<Category>,
							 val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecycleAdapter.Holder>(){

	//Binding prepares child view to hold data that corresponds with is position in the adapter.
	// Which is passed in from the inner class Holder below
	override fun onBindViewHolder(holder: Holder?, position: Int) {
		holder?.bindCategory(categories[position], context)
	}


	//inflates view for the first time if an existing view does not already exist.
	override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
		val view = LayoutInflater.from(context)
				.inflate(R.layout.category_list_item, parent, false)

		return Holder(view, itemClick)
	}

	//sets items postion from recyclerView
	override fun getItemCount(): Int {
		return categories.count()
	}

	inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder
	(itemView) {

		//Reference to UI elements
		val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
		val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

		//binds the references above to the data
		fun bindCategory(category: Category, context: Context) {
			val resourceId = context.resources.getIdentifier(category.image, "drawable",
					context.packageName)

			categoryImage?.setImageResource(resourceId)
			categoryName?.text = category.title
			itemView.setOnClickListener { itemClick(category) }
		}
	}
}