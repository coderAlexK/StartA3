package com.akozlov.starta3


import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.State
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text


@Composable
fun RecompositionScreen(counter: State<Int>, onCounterClick:() -> Unit) {
    Log.d(TAG, "RecompositionScreen")
    ClickCounter(counter, onCounterClick = onCounterClick)

}

@Composable
fun ClickCounter(counter: State<Int>, onCounterClick: () -> Unit) {
    val counterValue = counter.value
    Log.d(TAG, "ClickCounter - $counterValue")

        Text(text = "Clicks: $counterValue", Modifier.clickable(onClick = onCounterClick).padding(top=50.dp), fontSize = 30.sp)

}

@Composable
fun InfoText(text: String) {
    Log.d(TAG, "InfoText")
    Text(text = text, fontSize = 30.sp)
}