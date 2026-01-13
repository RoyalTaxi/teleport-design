# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.0] – 2026-01-13

### Added
- Initial stable release
- The `presentation/design` part was extracted into a separate **teleport-design** library
- Color system:
    - `Color.kt`
    - `ColorScheme.kt`
- Typography system:
    - `Type.kt`
    - `TypeScheme.kt`
- Theme configuration:
    - `Theme.kt`
    - `System.kt`
- The design layer was made independent and ready for reuse

### Changed
- All UI theme and design dependencies in the application are managed through the **teleport-design** library
- The design structure was refactored to align with a modular architecture

### Removed
- Old design/theme implementations inside the app module were removed
