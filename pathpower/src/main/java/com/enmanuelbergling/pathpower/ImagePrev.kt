package com.enmanuelbergling.pathpower

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ImagePreview(modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        ElevatedCard(shape = MaterialTheme.shapes.medium) {
            Image(
                painterResource(R.drawable.cheese),
                contentDescription = "photo",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .height(230.dp)
                    .clip(shape = MaterialTheme.shapes.medium),
            )
        }
        Text("Say cheese 🧀".uppercase(), style = MaterialTheme.typography.titleLarge)
    }
}