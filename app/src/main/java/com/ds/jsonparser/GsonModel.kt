package com.ds.jsonparser

import android.content.Context
import androidx.annotation.RawRes
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken


data class GsonModel(
    @SerializedName("id") val id: Int,
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String,
    @SerializedName("email") val email: String,
    @SerializedName("genre") val genre: String,
    @SerializedName("ip_addresss") val ipAddress: String
) {

    companion object {
        fun from(context: Context, @RawRes id: Int): List<GsonModel> {
            val modelListType = object : TypeToken<ArrayList<GsonModel>>() {}.type
            return Gson().fromJson(getRawString(context, id), modelListType)
        }
    }
}