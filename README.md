# Teleport Design

A Kotlin Multiplatform design system library for Android and iOS applications.

## Installation

Add the GitHub Packages repository and dependency to your project:

```kotlin
// settings.gradle.kts
dependencyResolutionManagement {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/RoyalTaxi/teleport-design")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("GITHUB_ACTOR")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

// build.gradle.kts
dependencies {
    implementation("uz.teleport:design:1.0.0")
}
```

## Usage

### Theme Setup

Wrap your app content with `Theme`:

```kotlin
@Composable
fun App() {
    Theme {
        // Your content
    }
}
```

### Accessing Design Tokens

Use the `System` object to access colors and typography:

```kotlin
@Composable
fun MyComponent() {
    Text(
        text = "Hello",
        color = System.color.textDark,
        style = System.type.body
    )
}
```

### Color System

The library provides a carefully curated color palette:

| Category | Token | Hex | Description |
|----------|-------|-----|-------------|
| **Brand** | `brandGreen` | `#00B956` | Primary brand color |
| | `brandYellow` | `#F8B84E` | Secondary brand accent |
| **Text** | `textLight` | `#FFFFFF` | Light text on dark backgrounds |
| | `textDark` | `#1A1A1A` | Dark text on light backgrounds |
| | `textDisable` | `#B0B0B0` | Disabled/muted text |
| **UI** | `uiSurface` | `#FFFFFF` | Main background surface |
| | `uiSurfaceSubtle` | `#F6F6F6` | Subtle background variation |
| | `uiDark` | `#1A1A1A` | Dark UI elements |
| | `uiIconMuted` | `#A0AAA1` | Muted icon color |
| | `uiBorder` | `#E0E0E0` | Border and divider color |

Usage example:

```kotlin
Box(
    modifier = Modifier
        .background(System.color.uiSurface)
        .border(1.dp, System.color.uiBorder)
) {
    Text(
        text = "Welcome",
        color = System.color.textDark
    )
}
```

### Typography System

Built on the **Inter** font family with the following scale:

| Style | Size | Weight | Usage |
|-------|------|--------|-------|
| `display` | 32sp | Bold | Hero text, large headlines |
| `h1` | 24sp | Bold | Primary headings |
| `h2` | 20sp | Semi-Bold | Secondary headings |
| `body` | 16sp | Regular | Body text, paragraphs |
| `bodySemiBold` | 16sp | Semi-Bold | Emphasized body text |
| `button` | 14sp | Semi-Bold | Button labels |
| `caption` | 12sp | Medium | Captions, labels |
| `small` | 10sp | Regular | Fine print, timestamps |

Usage example:

```kotlin
Column {
    Text(
        text = "Welcome Back",
        style = System.type.h1
    )
    Text(
        text = "Please sign in to continue",
        style = System.type.body
    )
    Button(onClick = { }) {
        Text(
            text = "Sign In",
            style = System.type.button
        )
    }
}
```

## Custom Themes

For advanced customization, use `TeleportCustomTheme` with custom color and typography schemes:

```kotlin
val customColors = light(
    brandGreen = Color(0xFF00C853),
    textDark = Color(0xFF212121)
)

TeleportCustomTheme(
    colorScheme = customColors,
    typography = rememberTypeScheme()
) {
    // Content with custom colors
}
```

## Platform Support

| Platform | Status |
|----------|--------|
| Android | Supported |
| iOS (Arm64) | Supported |
| iOS (x64) | Supported |
| iOS Simulator | Supported |
| JVM | Supported |

## Requirements

- Kotlin 2.0+
- Android minSdk 24
- Compose Multiplatform

## License

Copyright 2024 Teleport. All rights reserved.