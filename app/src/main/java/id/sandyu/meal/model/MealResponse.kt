package id.sandyu.meal.model

import com.google.gson.annotations.SerializedName

data class MealService(
    @field:SerializedName("meals")
    val meals: List<MealsItem?>? = null
)