package com.plcoding.tracker_data.mapper

import com.alibasoglu.tracker_domain.model.TrackableFood
import com.plcoding.tracker_data.remote.dto.Product
import kotlin.math.roundToInt

fun Product.toTrackableFood(): TrackableFood? {
    val carbsPer100g = nutriments.carbohydrates100g.roundToInt()
    val proteinPer100g = nutriments.proteins100g.roundToInt()
    val fatPer100g = nutriments.fat100g.roundToInt()
    val caloriesPer100g = nutriments.energyKcal100g.roundToInt()
    return TrackableFood(
        name = productName ?: return null,
        imageUrl = imageFrontThumbUrl,
        caloriesPer100g = caloriesPer100g,
        carbsPer100g = carbsPer100g,
        proteinsPer100g = proteinPer100g,
        fatsPer100g = fatPer100g
    )
}
