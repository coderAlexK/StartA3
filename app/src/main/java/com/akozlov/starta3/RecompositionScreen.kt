package com.akozlov.starta3


import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.State


@Composable
fun RecompositionScreen(counter: State<Int>, onCounterClick:() -> Unit) {
    Log.d(TAG, "RecompositionScreen")
    ClickCounter(counter, onCounterClick = onCounterClick)

}

@Composable
fun ClickCounter(counter: State<Int>, onCounterClick: () -> Unit) {
    val counterValue = counter.value
    Log.d(TAG, "ClickCounter - $counterValue")
    Column(modifier = Modifier.padding(top = 50.dp)){
        Text(text = "Clicks: $counterValue", Modifier.clickable(onClick = onCounterClick))

    }
}