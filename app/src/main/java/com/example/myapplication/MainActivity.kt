package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ListLayout()
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListLayout() {
    val androidIconList = mutableListOf(
        Item(R.drawable.ic_android_black_24dp, "Ada Lovelace"),
        Item(R.drawable.ic_android_black_24dp, "Mary Kenneth"),
        Item(R.drawable.ic_android_black_24dp, "Grace Hopper"),
        Item(R.drawable.ic_android_black_24dp, "Carol Shaw"),
        Item(R.drawable.ic_android_black_24dp, "Hedy Lamarr"),
        Item(R.drawable.ic_android_black_24dp, "Cláudia Marquesani"),
        Item(R.drawable.ic_android_black_24dp, "Camila Achutti"),
        Item(R.drawable.ic_android_black_24dp, "Akari Ueda"),
        Item(R.drawable.ic_android_black_24dp, "Yara Mascarenhas"),
        Item(R.drawable.ic_android_black_24dp, "Loiane Groner")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp, end = 16.dp, top = 16.dp)
    ) {
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        )
        {
            items(androidIconList) { image ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    backgroundColor = Color(0xFFEBF7FE),
                    elevation = 4.dp,
                    shape = RoundedCornerShape(size = 12.dp)
                ) {
                    Column(
                        Modifier.fillMaxWidth()
                    ) {
                        Image(
                            painter = painterResource(id = image.image),
                            contentDescription = "Avatar icon",
                            modifier = Modifier
                                .size(100.dp)
                                .padding(start = 16.dp)
                        )
                        Text(
                            text = image.name,
                            fontSize = 24.sp,
                            modifier = Modifier.padding(start = 16.dp)
                        )
                    }
                }
            }
        }

//        LazyColumn {
//            items(androidIconList) { image ->
//                Card(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .wrapContentHeight(),
//                    backgroundColor = Color(0xFFEBF7FE),
//                    elevation = 4.dp,
//                    shape = RoundedCornerShape(size = 12.dp)
//                ) {
//                    Row(
//                        Modifier.fillMaxWidth(),
//                        verticalAlignment = Alignment.CenterVertically
//                    ) {
//                        Image(
//                            painter = painterResource(id = image.image),
//                            contentDescription = "Avatar icon",
//                            modifier = Modifier
//                                .size(100.dp)
//                                .padding(start = 16.dp)
//                        )
//                        Text(
//                            text = image.name,
//                            fontSize = 24.sp,
//                            modifier = Modifier.padding(start = 16.dp)
//                        )
//                    }
//                }
//                Spacer(modifier = Modifier.height(8.dp))
//            }
//        }
    }
}


