package com.example.consumirapi

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ConsumirApi(postList: List<PostModel>) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFb5e48c))
    ) {
        Card(
            modifier = Modifier
                .padding(12.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
        ) {
            LazyColumn {
                items(postList) { post ->
                    PostItem(post = post)
                    Spacer(modifier = Modifier.height(8.dp)) // Espacio entre elementos
                }
            }
        }
    }
}

@Composable
fun PostItem(post: PostModel) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "Title: ${post.title}")
        Text(text = "Body: ${post.body}")
        // Agrega más campos según tus necesidades
    }
}
