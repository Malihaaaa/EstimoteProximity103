package dtu.engtech.estimoteproximity103

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun StaffCard(
    staff: Staff,
    modifier: Modifier = Modifier
) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        //Image(
            //painter = painterResource((R.drawable.dtu_logo)),
           // contentDescription = "Staff profile picture",
        // modifier = Modifier
               // .size(50.dp)
       // )
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = staff?.id ?: ""
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = staff?.navn ?: ""
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = staff?.lokation ?: "",
                modifier = Modifier.padding(all = 4.dp),
                style = MaterialTheme.typography.body2
            )

        }
    }
}