//package com.hajni.codelab1.ui.theme.screen
//
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import com.hajni.codelab1.ui.theme.CodeLab1Theme
//
//@Composable
//fun OnboardingScreen(
//    onContinueClicked: () -> Unit,
//    modifier: Modifier = Modifier
//) {
//    // TODO: This state should be hoisted
//
//    Column(
//        modifier = modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text("Welcome to the Basics Codelab!")
//        Button(
//            modifier = Modifier.padding(vertical = 24.dp),
//            onClick = { onContinueClicked }
//        ) {
//            Text("Continue")
//        }
//    }
//}
//
//@Preview(showBackground = true, widthDp = 320, heightDp = 320)
//@Composable
//fun OnboardingPreview() {
//    CodeLab1Theme {
//        OnboardingScreen(onContinueClicked = {})
//    }
//}
