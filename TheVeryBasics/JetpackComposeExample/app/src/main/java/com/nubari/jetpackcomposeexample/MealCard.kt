package com.nubari.jetpackcomposeexample

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun MealCard(
    meal: Meal,
) {
    Card(modifier = Modifier.height(250.dp)) {
        Column(modifier = Modifier.fillMaxSize()) {
            Box(
                modifier = Modifier
                    .fillMaxHeight(fraction = 0.5f)
                    .fillMaxWidth()
            ) {
                GlideImage(
                    imageModel = meal.image,
                    contentDescription = meal.name,
                    modifier = Modifier
                        .matchParentSize()
                        .clip(
                            RoundedCornerShape(
                                topStart = 5.dp,
                                topEnd = 5.dp
                            )
                        ),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),

                ) {
                Text(
                    text = meal.name,
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(

                    ) {
                        Text(text = "${meal.time} minutes", color = Color.Black)
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "${meal.ingredients} Ingredients", color = Color.Black)
                    }
                    OutlinedButton(
                        onClick = {},
                        border = BorderStroke(1.dp, Color.Green)
                    ) {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                imageVector = Icons.Outlined.PlayArrow,
                                contentDescription = null,
                                tint = Color.Green
                            )
                            Text(text = "Cook", color = Color.Green)
                        }
                    }

                }
            }
        }
    }
}