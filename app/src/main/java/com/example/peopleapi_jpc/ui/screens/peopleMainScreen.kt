package com.example.peopleapi_jpc.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter
import com.example.peopleapi_jpc.domain.items.PeopleItems
import com.example.peopleapi_jpc.ui.ViewModel.PeopleViewModel

@Composable
fun peopleMainScreen( peopleViewModel: PeopleViewModel, navController: NavController) {
    val people = peopleViewModel.people.observeAsState(listOf()).value
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Games", fontWeight = FontWeight.Bold)
                }
            )
        }
    ) {
        LazyColumn{
            items(people) {people ->
                PeopleCard(people = people)
            }
        }
    }
}
@Composable
fun PeopleCard(people: PeopleItems) {
    Card(
        elevation = 7.dp,
        shape = RoundedCornerShape(7.dp),
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 7.dp, bottom = 7.dp, start = 14.dp, end = 14.dp)

    ) {
        Image(
            painter = rememberImagePainter(people?.avatar.toString()),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        )
        Row{


            Column(modifier = Modifier
                .padding(10.dp)
                .align(Alignment.CenterVertically)) {
                Text(text = people?.first_name,
                    fontWeight = FontWeight.Bold)
                Text(text = people?.email,
                    fontWeight = FontWeight.Bold)
            }
        }
    }
}