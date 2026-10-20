package com.a2z.scan.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

data class PdfTool(val name: String, val description: String, val icon: ImageVector)

@Composable
fun PdfToolsScreen(onBack: () -> Unit) {
    val tools = listOf(
        PdfTool("Merge PDF", "Combine multiple files into one", Icons.Default.Merge),
        PdfTool("Split PDF", "Extract pages into separate files", Icons.Default.CallSplit),
        PdfTool("Compress PDF", "Reduce file size without losing quality", Icons.Default.Compress),
        PdfTool("Image to PDF", "Convert JPG/PNG to PDF format", Icons.Default.Image),
        PdfTool("PDF to Text", "Extract text from PDF documents", Icons.Default.Description)
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text("PDF Tools", fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    TextButton(onClick = onBack) { Text("Back") }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(tools) { tool ->
                OutlinedCard(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable { /* Trigger tool logic */ },
                    onClick = { /* Trigger tool logic */ }
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = tool.icon,
                            contentDescription = tool.name,
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(28.dp)
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Text(text = tool.name, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                            Text(text = tool.description, fontSize = 13.sp, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f))
                        }
                    }
                }
            }
        }
    }
}
