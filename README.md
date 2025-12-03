# Aidukan Android App

Voice Assistant for Kirana Stores

## 📥 Download APK

**The automated builds are having issues. Here's how to build manually:**

### Option 1: Build Locally (Recommended)

1. **Clone this repository:**
   ```bash
   git clone https://github.com/rahulgoswami962006-dotcom/aidukan-simple-apk.git
   cd aidukan-simple-apk
   ```

2. **Open in Android Studio:**
   - Open Android Studio
   - Click "Open an Existing Project"
   - Select the `aidukan-simple-apk` folder
   - Wait for Gradle sync (2-3 minutes)

3. **Build APK:**
   - Click **Build** → **Build Bundle(s) / APK(s)** → **Build APK(s)**
   - Wait 2-3 minutes
   - APK will be in: `app/build/outputs/apk/debug/app-debug.apk`

4. **Install on Phone:**
   - Copy APK to phone
   - Open and install
   - Done! 🎉

### Option 2: Use Original Project

The original project with full features is here:
https://github.com/rahulgoswami962006-dotcom/aidukan-android-native

Follow the same build steps above.

## 🛠️ Project Structure

```
aidukan-simple-apk/
├── app/
│   ├── build.gradle
│   └── src/
│       └── main/
│           ├── AndroidManifest.xml
│           └── java/com/aidukan/app/
│               └── MainActivity.kt
├── build.gradle
├── settings.gradle
└── gradle.properties
```

## ✨ Features

- Simple, clean interface
- Kotlin-based
- AndroidX libraries
- Minimal dependencies

## 📱 Requirements

- Android 7.0 (API 24) or higher
- ~5 MB storage space

## 🔧 Development

Built with:
- Kotlin 1.9.20
- Android Gradle Plugin 8.2.0
- AndroidX Core 1.12.0
- AppCompat 1.6.1

---

**Need help?** Open an issue on GitHub!
