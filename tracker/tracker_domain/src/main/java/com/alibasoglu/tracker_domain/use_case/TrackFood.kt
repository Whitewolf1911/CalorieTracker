package com.alibasoglu.tracker_domain.use_case

import com.alibasoglu.tracker_domain.model.MealType
import com.alibasoglu.tracker_domain.model.TrackableFood
import com.alibasoglu.tracker_domain.model.TrackedFood
import com.alibasoglu.tracker_domain.repository.TrackerRepository
import java.time.LocalDate
import kotlin.math.roundToInt

class TrackFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(
        food: TrackableFood,
        amount: Int,
        mealType: MealType,
        date: LocalDate
    ) {
        repository.insertTrackedFood(
            TrackedFood(
                name = "",
                carbs = ((food.carbsPer100g / 100f) * amount).roundToInt(),
                protein = ((food.proteinsPer100g / 100f) * amount).roundToInt(),
                fat = ((food.fatsPer100g / 100f) * amount).roundToInt(),
                imageUrl = food.imageUrl,
                mealType = mealType,
                amount = amount,
                date = date,
                calories = ((food.caloriesPer100g / 100f) * amount).roundToInt()
            )
        )
    }
}
