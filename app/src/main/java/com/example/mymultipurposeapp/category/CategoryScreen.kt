import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material3.*
import com.example.mymultipurposeapp.navigation.Screen

@Composable
fun CategoryScreen(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        Button(onClick = {navController.navigate(Screen.StudyCategory.route)}){
            Text("공부")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            // 아직 구현은 안 했지만, 소설 카테고리로 이동할 예정
            // navController.navigate(Screen.NovelCategory.route)
        }){
            Text("소설")
        }
    }
}