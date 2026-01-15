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

Wrap your app content with `TeleportTheme`:

```kotlin
@Composable
fun App() {
    Theme {
        // Your content
    }
}
```

With custom dark mode handling:

### Accessing Design Tokens

Use the `System` object to access colors and fonts:

```kotlin
@Composable
fun MyComponent() {
    Text(
        text = "Submit",
        style = System.type.button,
        color = System.color.textDark
    )
}
```

### Color System

Available color categories:
- **BrandGreen**
- **BrandYellow**
- **TextLight**
- **TextDark**
- **TextDisable**
- **UiSurface**
- **UiIconMuted**
- **UiBorder**
- **UiDark**
- **UiSurfaceSubtle**

### Font System

Typography scale:
- **display**
- **h1**
- **h2**
- **body**
- **bodySemiBold**
- **button**
- **caption**
- **small**

## License

Copyright 2026 Teleport. All rights reserved.
