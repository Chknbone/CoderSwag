package com.palarran.coderswag.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.palarran.coderswag.Model.Product
import com.palarran.coderswag.R
import com.palarran.coderswag.Utilities.EXTRA_PRODUCT_DETAIL
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_product_detail)

		val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT_DETAIL)
		val resourceId = resources.getIdentifier(product.image, "drawable", packageName)
		productDetailImage.setImageResource(resourceId)
		productNameText.text = product.title
		productDetailPrice.text = product.price
	}
}
