package network

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import data.Guest
import java.net.URL


fun getGuestList(): List<Guest> = try {
    URL("https://haven-tech-test.s3-eu-west-1.amazonaws.com/tech+test+json.json")
        .openStream()
        .bufferedReader()
        .use {
            Gson().fromJson(it.readText(), object : TypeToken<List<Guest?>?>() {}.type)
        }
} catch (e: Exception) {
    error("Error retrieving list : $e")
}