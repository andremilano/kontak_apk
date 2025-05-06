package com.andre0016.mobpro1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.andre0016.mobpro1.navigation.SetupNavGraph
import com.andre0016.mobpro1.util.SettingsDataStore
import com.andre0016.mobpro1.util.getCustomColorScheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataStore = SettingsDataStore(this)
        setContent {
            val themeColor by dataStore.themeColorFlow.collectAsState("Blue")
            val isDarkTheme = isSystemInDarkTheme()

            val colorScheme = getCustomColorScheme(themeColor, isDarkTheme)

            MaterialTheme(
                colorScheme = colorScheme
            ) {
                SetupNavGraph()
            }
        }
    }
}

