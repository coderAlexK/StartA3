package com.akozlov.starta3

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Lifecycle

@Composable
fun RememberScreen(counterValue: Int, onCounterClick: () -> Unit ) {
    val evenOdd = EvenOdd()
    Text(text = "Clicks: $counterValue  ${evenOdd.check(counterValue)}"
        , modifier = Modifier.clickable(onClick = onCounterClick), fontSize = 30.sp)

}

class EvenOdd () {
    fun check (number: Int): String {
       return if(number%2 == 0) "even" else "odd"
    }
}