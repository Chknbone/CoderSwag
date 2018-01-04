package com.palarran.coderswag.Services

import com.palarran.coderswag.Model.Category
import com.palarran.coderswag.Model.Product

/**
 *App name:
 *Created by CB on 1/4/2018.
 *
 */
object DataService {

	val categories = listOf(
			Category("SHIRTS", "shirtimage"),
			Category("HOODIES", "hoodieimage"),
			Category("HATS", "hatimage"),
			Category("DIGITAL", "digitalgoodsimage")
	)

	val hats = listOf(
			Product(title = "Devslopes Graphic Beanie", price = "$18", image = "hat1"),
			Product(title = "Devslopes Hat Black", price = "$20", image = "hat2"),
			Product(title = "Devslopes Hat White", price = "$19", image = "hat3"),
			Product(title = "Devslopes Hat Snapback", price = "$24", image = "hat4")
	)

	val hoodies = listOf(
			Product(title = "Devslopes Hoodie Grey", price = "$32", image = "hoodie1"),
			Product(title = "Devslopes Hoodie Red", price = "$30", image = "hoodie2"),
			Product(title = "Devslopes Gray Hoodie", price = "$33", image = "hoodie3"),
			Product(title = "Devslopes Black Hoodie", price = "$38", image = "hoodie4")
	)

	val shirts = listOf(
			Product(title = "Devslopes Shirts Black", price = "$22", image = "shirt1"),
			Product(title = "Devslopes Badge Light Gray", price = "$20", image = "shirt2"),
			Product(title = "Devslopes Logo Shirt Red", price = "$23", image = "shirt3"),
			Product(title = "Devslopes Hustle", price = "$28", image = "shirt4"),
			Product(title = "Kickflip Studios", price = "$25", image = "shirt5")
	)
}