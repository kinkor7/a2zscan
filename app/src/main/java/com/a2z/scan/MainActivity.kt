package com.a2z.scan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.navigation.compose.*
import com.a2z.scan.ui.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            A2ZScanTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "dashboard") {
                    composable("dashboard") {
                        ScanDashboard { route -> navController.navigate(route) }
                    }
                    composable("pdf_tools") {
                        PdfToolsScreen { navController.popBackStack() }
                    }
                    composable("scan") {
                        Text("Camera Scanning Interface... (Integrating CameraX)")
                    }
                    composable("ocr") {
                        Text("OCR Extraction Interface... (Integrating ML Kit)")
                    }
                    composable("files") {
                        Text("Document Manager... (Integrating Storage Access Framework)")
                    }
                    composable("settings") {
                        Text("App Settings...")
                    }
                }
            }
        }
    }
}
