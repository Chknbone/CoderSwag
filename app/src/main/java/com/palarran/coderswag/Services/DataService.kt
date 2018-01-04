package com.palarran.coderswag.Services

import com.palarran.coderswag.Model.Category
import com.palarran.coderswag.Model.Product


object DataService {

	val categories = listOf(
			Category("SHIRTS", "shirtimage"),
			Category("HOODIES", "hoodieimage"),
			Category("HATS", "hatimage"),
			Category("DIGITAL", "digitalgoodsimage")
	)

	val hats = listOf(
			Product("Devslopes Graphic Beanie", "$18", "hat1"),
			Product("Devslopes Hat Black", "$20", "hat2"),
			Product("Devslopes Hat White", "$19", "hat3"),
			Product("Devslopes Hat Snapback", "$24", "hat4")
	)

	val hoodies = listOf(
			Product("Devslopes Hoodie Grey", "$32", "hoodie1"),
			Product("Devslopes Hoodie Red", "$30", "hoodie2"),
			Product("Devslopes Gray Hoodie", "$33", "hoodie3"),
			Product("Devslopes Black Hoodie", "$38", "hoodie4")
	)

	val shirts = listOf(
			Product("Devslopes Shirts Black", "$22", "shirt1"),
			Product("Devslopes Badge Light Gray", "$20", "shirt2"),
			Product("Devslopes Logo Shirt Red", "$23", "shirt3"),
			Product("Devslopes Hustle", "$28", "shirt4"),
			Product("Kickflip Studios", "$25", "shirt5")
	)
}