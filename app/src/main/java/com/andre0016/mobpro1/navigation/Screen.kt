package com.andre0016.mobpro1.navigation

import com.andre0016.mobpro1.ui.screen.KEY_ID_KONTAK

sealed class Screen (val route: String) {
    data object Home: Screen("mainScreen")
    data object FormBaru: Screen("detailScreen")
    data object FormUbah: Screen("detailScreen/{$KEY_ID_KONTAK}") {
        fun withId(id: Long) = "detailScreen/$id"
    }

}