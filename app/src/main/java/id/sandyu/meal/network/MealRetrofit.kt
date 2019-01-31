package id.sandyu.meal.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MealRetrofit {
    private val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

    private fun init(): Retrofit = Retrofit.Builder().baseUrl(BASE_URL)
        .addCallAdapterFactory(GsonConverterFactory.create())
        .build()

    fun instance() MealService = init().create(MealService::class.java)
}