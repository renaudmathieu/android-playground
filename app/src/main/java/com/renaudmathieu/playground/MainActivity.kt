package com.renaudmathieu.playground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.renaudmathieu.playground.ui.theme.PlaygroundTheme
import kotlinx.datetime.LocalDate
import kotlinx.datetime.format.DateTimeFormat
import kotlinx.datetime.format.FormatStringsInDatetimeFormats
import kotlinx.datetime.format.byUnicodePattern

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundTheme {
                PersonRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    person = Person(
                        givenName = "Renaud",
                        familyName = "Mathieu",
                        //birthDate = LocalDate(1987, Month.JULY, 5),
                        //riends = listOf("Copinou 1", "Copinou 2")
                    )
                )
            }

        }
    }
}

@OptIn(FormatStringsInDatetimeFormats::class)
val localDateFormat: DateTimeFormat<LocalDate> = LocalDate.Format {
    byUnicodePattern("dd/MM/yyyy")
}


