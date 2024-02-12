package kr.co.nbw.composemovieapp.ui.components.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import kr.co.nbw.composemovieapp.ui.theme.ComposeMovieAppTheme
import kr.co.nbw.composemovieapp.ui.theme.Paddings
import kr.co.nbw.composemovieapp.ui.theme.color.ColorSet
import kr.co.nbw.composemovieapp.ui.theme.myColorScheme

@Composable
fun SecondaryBorderlessButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null,
    text: String = "",
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.myColorScheme.background,
            contentColor = MaterialTheme.myColorScheme.secondary,
            disabledContainerColor = MaterialTheme.myColorScheme.background,
            disabledContentColor = MaterialTheme.myColorScheme.disabledSecondary
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = id?.let { stringResource(id = id) } ?: text,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier.padding(Paddings.small)
            )
        }
    }
}

@Preview
@Composable
fun SecondaryBorderlessButtonPreview() {
    ComposeMovieAppTheme(myColors = ColorSet.Red) {
        SecondaryBorderlessButton(
            text = "CANCEL"
        ) {

        }
    }
}