package kr.co.nbw.composemovieapp.features.dialogs

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.navigation.fragment.navArgs
import dagger.hilt.android.AndroidEntryPoint
import kr.co.nbw.composemovieapp.BaseDialogFragment
import kr.co.nbw.composemovieapp.R
import kr.co.nbw.composemovieapp.ui.components.dialog.DialogPopup
import kr.co.nbw.composemovieapp.ui.components.dialog.Rating
import kr.co.nbw.composemovieapp.ui.models.buttons.LeadingIconData
import kr.co.nbw.composemovieapp.ui.models.dialog.DialogButton
import kr.co.nbw.composemovieapp.ui.theme.ComposeMovieAppTheme
import kr.co.nbw.composemovieapp.ui.theme.color.ColorSet

@AndroidEntryPoint
class RatingDialogFragment : BaseDialogFragment() {

    private val args: RatingDialogFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        dialog?.apply {
            isCancelable = true
            setCanceledOnTouchOutside(true)
            window?.setBackgroundDrawable(ColorDrawable(requireContext().getColor(android.R.color.transparent)))
        }

        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                ComposeMovieAppTheme(
                    myColors = ColorSet.Red,
//                    themeState = themeViewModel.themeState.collectAsState()
                ) {
                    DialogPopup.Rating(
                        movieName = args.movieName,
                        rating = args.rating,
                        buttons = listOf(
                            DialogButton.Primary(
                                title = getString(R.string.submit),
                                leadingIconData = LeadingIconData(
                                    iconDrawable = R.drawable.ic_send,
                                    iconContentDescription = R.string.submit
                                )
                            ) {
                                dismiss()
                            },
                            DialogButton.Secondary(getString(R.string.cancel)) {
                                dismiss()
                            }
                        )
                    )
                }
            }
        }
    }
}