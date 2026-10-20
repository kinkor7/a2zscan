# How to Build a2zscan Android App

This project is a lightweight, professional replication of the OKEN Scanner, branded for A2Z International.

## Step 1: Project Setup
1. Open **Android Studio**.
2. Create a new project: **Empty Compose Activity**.
3. **Project Details**:
   - Name: `a2zscan`
   - Package Name: `com.a2z.scan`
   - Language: **Kotlin**
   - Minimum SDK: **26 (Android 8.0)**

## Step 2: Import Source Code
Replace the generated files in your project with the provided source files in the `/Users/ag700/Downloads/RE/a2zscan` folder:
- `AndroidManifest.xml`
- `build.gradle.kts` (App level)
- `MainActivity.kt`
- `ui/Theme.kt`
- `ui/ScanDashboard.kt`
- `ui/PdfToolsScreen.kt`

## Step 3: Recommended Libraries for Full Implementation
To make the placeholders functional, add these to your `build.gradle.kts`:
- **For PDF Rendering**: `implementation("com.github.barteksc:AndroidPdfViewer:2.8.2")`
- **For OCR**: `implementation("com.google.mlkit:text-recognition:16.0.0")`
- **For PDF Generation**: `implementation("com.itextpdf:itext7-core:7.2.0")`

## Step 4: Optimization for Release
The provided `build.gradle.kts` already includes:
- `isMinifyEnabled = true`: Removes unused code (R8).
- `isShrinkResources = true`: Removes unused assets.

## Feature Mapping (OKEN Scanner $\rightarrow$ a2zscan)
- **Smart Scan** $\rightarrow$ Native Camera interface with ML Kit.
- **PDF Tools** $\rightarrow$ A unified tool hub for Merge/Split/Compress.
- **OCR Extract** $\rightarrow$ Image-to-text conversion bridge.
- **File Manager** $\rightarrow$ Integrated Local Storage manager.
