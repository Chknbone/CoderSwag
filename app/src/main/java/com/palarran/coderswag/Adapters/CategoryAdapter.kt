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

class CategoryAdapter(val context: Context, val categories: List<Category>) : BaseAdapter() {

	override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
		val categoryView: View
		val holder: ViewHolder

		if (convertView == null) { //checks to see if this is the first time loaded
			//LayoutInflater takes an XML object and turns in into a view that can be used code
			//So category_list_view is the xml object being inflated and added to val categoryView
			categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)

			holder = ViewHolder() //initialize Holder with ViewHolder function

			//create UI elements base on IDs found in category_list_items.xml(categoryImage &
			// categoryName) and drop them into Holder which calls ViewHolder()
			holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
			holder.categoryName = categoryView.findViewById(R.id.categoryName)

			categoryView.tag = holder //setting unique value from categoryView to Holder
		} else {
			holder = convertView.tag as ViewHolder
			categoryView = convertView
		}

		val category = categories[position]
		//converting image name(from res drawable) to a resourceId
		val resourceId = context.resources.getIdentifier(category.image, "drawable", context
				.packageName)
		holder.categoryImage?.setImageResource(resourceId)
		holder.categoryName?.text = category.title

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

	//holds an instance of only Views that can be seen on the devices screen. Saves on system
	// resources.
	private class ViewHolder {
		var categoryImage: ImageView? = null
		var categoryName: TextView? = null
	}
}