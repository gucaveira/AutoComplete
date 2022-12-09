package com.dominando.android.autocomplete

import java.util.Locale
import java.util.regex.Pattern

fun String.removeAccents(): String {
    val replaces = arrayOf("a", "e", "i", "o", "u", "c")

    val patterns = arrayOf(
        Pattern.compile("[âãáàä]", Pattern.CASE_INSENSITIVE),
        Pattern.compile("[éèêë]", Pattern.CASE_INSENSITIVE),
        Pattern.compile("[íìîï]", Pattern.CASE_INSENSITIVE),
        Pattern.compile("[óòôõö]", Pattern.CASE_INSENSITIVE),
        Pattern.compile("[úùûü]", Pattern.CASE_INSENSITIVE),
        Pattern.compile("[ç]", Pattern.CASE_INSENSITIVE)
    )
    var result = this

    patterns.forEachIndexed { index, value ->
        val matcher = value.matcher(result)
        result = matcher.replaceAll(replaces[index])
    }

    return result.lowercase(Locale.getDefault())
}