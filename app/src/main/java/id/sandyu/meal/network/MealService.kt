package id.sandyu.meal.network

import retrofit2.http.GET
import retrofit2.http.Query

interface MealService {
    @GET("filter.php")
    fun requestHomeMeals(
        @Query("a") area: String
    ) : Call<MealResponse>
}