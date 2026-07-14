# Commit

Turn your coding time into screen time.

**Commit** is an Android app that helps you manage daily device usage by rewarding screen time based
on your coding activity from [WakaTime](https://wakatime.com). Code for 4 hours at a 50% reward
rate, and you earn 2 hours of unlocked device usage. No coding, no screen time.

Built with **Jetpack Compose** and **Material 3**, designed to feel calm, minimal, and native —
closer to Digital Wellbeing than a typical productivity app.

<!-- TODO Add screenshots here once available:
<p align="center">
  <img src="docs/screenshots/onboarding.png" width="250" />
  <img src="docs/screenshots/dashboard.png" width="250" />
  <img src="docs/screenshots/settings.png" width="250" />
</p>
-->

## How it works

1. Connect your WakaTime account with a personal API key.
2. Set a reward percentage — how many minutes of device time you earn per minute of coding.
3. Commit tracks your coding activity for the day and unlocks device usage as you go.
4. Optionally roll over unused screen time to the next day.

```
4h 32m coded today
      × 50% reward rate
      ────────────────
   2h 16m device time earned
```

## Features

- **WakaTime integration** — syncs your daily coding time via your personal API key
- **Configurable reward rate** — 0–100%, set your own coding-to-screen-time ratio
- **Time rollover** — optionally carry unused screen time into the next day
- **Allowed apps list** — choose which apps stay usable while your allowance holds
- **Dynamic Color** — adopts Material You theming on Android 12+, with a fixed fallback palette
  otherwise
- **Light and dark themes**
- **No accounts, no tracking, no ads** — your WakaTime API key stays on-device

## Screens

- **Welcome / Setup** — connect your WakaTime API key, set your reward percentage, and choose
  whether unused time rolls over
- **Dashboard** — today's coding time, allowed device time, remaining balance, allowed apps, and a
  manual sync button
- **Settings** — manage your API key, reward rate, rollover preference, and app info

## Tech stack

- [Kotlin](https://kotlinlang.org/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [Material 3](https://m3.material.io/) (with Dynamic Color support)
- [WakaTime API](https://wakatime.com/developers)

## Getting started

### Prerequisites

- Android Studio (latest stable)
- A [WakaTime](https://wakatime.com) account and personal API
  key ([find yours here](https://wakatime.com/settings/api-key))
- Android device or emulator running API 26+

### Setup

```bash
git clone https://github.com/hazyio/commit.git
cd commit
```

Open the project in Android Studio and let Gradle sync. Run on a device or emulator — no build-time
secrets or `.env` files required, since the WakaTime API key is entered by the user at runtime
during onboarding, not baked into the build.

## Contributing

Contributions are welcome — see [CONTRIBUTING.md](CONTRIBUTING.md) for setup details, coding
conventions, and how to submit a pull request.

## Privacy

Commit only communicates with the WakaTime API using the key you provide. No usage data, coding
stats, or device information is sent anywhere else. Your API key is stored locally on your device.

## License

Commit is open source, licensed under the [MIT License](LICENSE) — free to use, modify, and
distribute.

## Acknowledgments

- [WakaTime](https://wakatime.com) for the coding-activity API this app is built around. Commit is
  an independent, unofficial client and is not affiliated with or endorsed by WakaTime.
