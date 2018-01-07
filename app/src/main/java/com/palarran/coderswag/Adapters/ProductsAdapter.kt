package com.palarran.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.palarran.coderswag.Model.Product
import com.palarran.coderswag.R

class ProductsAdapter(val context: Context, val products: List<Product>, val itemClick: (Product)
-> Unit) : Adapter<ProductsAdapter.ProductHolder>(){

	override fun onBindViewHolder(holder: ProductHolder?, position: Int) {
		holder?.bindProduct(products[position], context)
	}

	override fun getItemCount(): Int {
		return products.count()
	}

	override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ProductHolder {
		val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
		return ProductHolder(view, itemClick)
	}

	inner class ProductHolder(itemView: View?, itemClick: (Product) -> Unit) : RecyclerView.ViewHolder(itemView) {

		val productImage = itemView?.findViewById<ImageView>(R.id.productImage)
		val prodcutName = itemView?.findViewById<TextView>(R.id.productName)
		val productPrice = itemView?.findViewById<TextView>(R.id.productPrice)

		fun bindProduct(product: Product, context: Context) {
			val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
			productImage?.setImageResource(resourceId)
			prodcutName?.text = product.title
			productPrice?.text = product.price
			itemView.setOnClickListener { itemClick(product) }
		}
	}
}