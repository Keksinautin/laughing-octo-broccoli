
## build
```bash
./gradlew assembleDebug
```

## build results
```bash
ls -alh app/build/outputs/apk/debug
```

## install
```bash
./gradlew installDebug
```

## start
```bash
adb shell am start -n com.johnev.lob/.MainActivity
```

## tests
```bash
./gradlew testDebugUnitTest lintDebug
```