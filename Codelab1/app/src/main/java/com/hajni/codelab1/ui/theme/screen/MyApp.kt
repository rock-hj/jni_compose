//package com.hajni.codelab1.ui.theme.screen
//
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Surface
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.saveable.rememberSaveable
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.hajni.codelab1.Greetings
//import com.hajni.codelab1.ui.theme.CodeLab1Theme
//
//
//@Preview(showBackground = true)
//@Composable
//fun MyAppPreview() {
//    CodeLab1Theme {
//        MyApp(Modifier.fillMaxSize())
//    }
//}
//
//@Composable
//fun MyApp(
//    modifier: Modifier = Modifier,
//) {
//
//    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }
//
//    Surface(modifier) {
//        if (shouldShowOnboarding) {
//            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false })
//        } else {
//            Greetings()
//        }
//    }
//}
