# Web-API-Automationtest

Berisi automation test berbasis web dan api dengan berbagai macam skenario.

Tools yang digunakan :
- Rest Assured
- Selenium
- Cucumber
- Gradle
- Github Action

Tujuan : 
Melakukan automation test web https://www.demoblaze.com/index.html menggunakan selenium dan api https://dummyapi.io/ menggunakan rest assured dan keduanya menggunakan cucumber library.

Cara Running :
Web
1. Melalui gradlew :
   - All skenario : ./gradlew cucumber
   - Per tags : ./gradlew cucumber -Ptags=“@nama-tags” 
2. Melalui Runner Test :
   - All skenario : buka file WebRunner yang terdapat pada com.finarizky.runner.web.WebRunner
   - Per page : buka file runner per pagenya yang terdapat pada com.finarizky.runner.web.'nama file'
API
1. Melalui gradlew :
   - All skenario : ./gradlew cucumber 
   - Per tags : ./gradlew cucumber -Ptags=“@nama-tags” 
2. Melalui Runner Test :
   - All skenario : bisa via file APIRunner yang terdapat pada com.finarizky.runner.api.APIRunner
   - Per page : buka file runner per pagenya yang terdapat pada com.finarizky.runner.api.'nama file'
