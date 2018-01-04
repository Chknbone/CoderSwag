package com.palarran.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.palarran.coderswag.Model.Category
import com.palarran.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

	val context = context
	val categories = categories

	override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
		val categoryView: View

		//LayoutInflater takes an XML object and turns in into a view that can be used code
		//So category_list_view is the xml object being inflated and added to val categoryView
		categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
		//create UI elements base on IDs found in category_list_items.xml(categoryImage &
		// categoryName)
		val categoryImage : ImageView = categoryView.findViewById(R.id.categoryImage)
		val categoryName : TextView = categoryView.findViewById(R.id.categoryName)

		val category = categories[position]

		categoryName.text = category.title

		//converting image name(from res drawable) to a resourceId
		val resourceId = context.resources.getIdentifier(category.image, "drawable", context
				.packageName)
		categoryImage.setImageResource(resourceId)

		return categoryView
	}

	//returns item that getView gets position comes from getView
	override fun getItem(position: Int): Any {
		return categories[position]
	}

	override fun getItemId(position: Int): Long {
		return 0
	}

	//returns the number of rows to display(3) in the listView
	override fun getCount(): Int {
		return categories.count()
	}
}