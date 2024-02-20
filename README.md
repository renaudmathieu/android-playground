If your app includes many unnecessarily unstable components that Compose always recomposes,
you might observe performance issues and other problems.

This workshop details how you can increase the stability of your app to improve performance and
overall user experience.

1. var / val
2. LocalDate
3. ./gradlew clean assembleRelease -PcomposeCompilerReports=true
4. compose_compiler_config.conf + Coil screen
5. List
6. ImmutableList val friends: ImmutableList<String> = persistentListOf(),
7. Known
8. @Stable  