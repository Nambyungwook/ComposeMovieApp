package kr.co.nbw.composemovieapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import kr.co.nbw.composemovieapp.features.common.viewmodel.ThemeViewModel

open class BaseFragment : Fragment() {
    protected val themeViewModel: ThemeViewModel by activityViewModels()
}