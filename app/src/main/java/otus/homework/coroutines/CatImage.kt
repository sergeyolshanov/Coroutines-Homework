package otus.homework.coroutines

import com.google.gson.annotations.SerializedName

data class CatImage(
    @field:SerializedName("image")
    val image: String,
)