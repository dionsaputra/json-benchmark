package com.ds.jsonparser

import android.content.Context
import androidx.annotation.RawRes
import java.io.*

fun getRawString(context: Context, @RawRes id: Int): String {
    val inputStream: InputStream = context.resources.openRawResource(id)
    val writer: Writer = StringWriter()
    val buffer = CharArray(1024)
    inputStream.use { stream ->
        val reader: Reader = BufferedReader(InputStreamReader(stream, "UTF-8"))
        var n: Int
        while (reader.read(buffer).also { n = it } != -1) {
            writer.write(buffer, 0, n)
        }
    }
    return writer.toString()
}