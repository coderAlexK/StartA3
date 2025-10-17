@file:OptIn(ExperimentalStdlibApi::class)

package com.akozlov.starta3

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp


@Composable
fun RememberScreen(counterValue: Int, onCounterClick: () -> Unit ) {
    val evenOdd = remember { EvenOdd() }
    Text(text = "Clicks: $counterValue  ${evenOdd.check(counterValue)}"
        , modifier = Modifier.clickable(onClick = onCounterClick), fontSize = 30.sp)

    Log.d(TAG, "counterValue - $counterValue  evenOdd's hash - ${evenOdd.hashCode().toHexString()}")

}

class EvenOdd () {
    fun check (number: Int): String {
       return if(number%2 == 0) "even" else "odd"
    }
}