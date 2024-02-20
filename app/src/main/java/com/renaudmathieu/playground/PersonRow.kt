package com.renaudmathieu.playground

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun PersonRow(
    modifier: Modifier = Modifier,
    person: Person,
) {
    var isChecked by remember { mutableStateOf(false) }
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        PersonDetails(person = person)
        ToggleButton(
            checked = isChecked,
            onCheckedChange = { isChecked = !isChecked }
        )
    }
}


@Composable
fun PersonDetails(
    modifier: Modifier = Modifier,
    person: Person
) {
    Column(
        modifier = modifier,
    ) {
        PersonDetailsName(person)
        PersonDetailsBirthday(person)
    }

}

@Composable
private fun PersonDetailsBirthday(person: Person) {
    Text(
        //text = localDateFormat.format(person.birthDate),
        text = "a",
        style = MaterialTheme.typography.bodyMedium
    )
}

@Composable
private fun PersonDetailsName(person: Person) {
    Text(
        text = "${person.givenName} ${person.familyName}",
        style = MaterialTheme.typography.titleMedium
    )
}