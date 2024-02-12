package kr.co.nbw.composemovieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import kr.co.nbw.composemovieapp.ui.models.dialog.DialogButton
import kr.co.nbw.composemovieapp.ui.models.dialog.DialogContent
import kr.co.nbw.composemovieapp.ui.models.dialog.DialogText
import kr.co.nbw.composemovieapp.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(
            title
        ),
        dialogContent = DialogContent.Large(
            DialogText.Default(
                bodyText
            )
        ),
        buttons = buttons
    )
}