# Challenge E2E con Serenity - Cucumber

## 1. Prerrequisitos
- Gradle: 7.6.1
- Java: 17
- Serenity: 4.0.15
- IntelliJ IDEA: 2023.2.5
- Windows 10/11

## 2. Instalación de dependencias
1. Para la instalación de las dependencias del proyecto debemos abrirlo en nuestro IDE IntelliJ Idea.
2. Abrimos el archivo build.gradle.
3. Nos aparecerá un botón en la esquina superior derecha de la ventana para instalar las dependencias del proyecto.

   ![Screenshot 2023-11-30 121040](https://github.com/dbchango/ntt-challenge-serenity-E2E/assets/49067691/32db3d07-d9a5-4895-8f2b-615a78e17ab5)

5. Estas dependencias se instalarán automáticamente

  
## 3. Instrucciones para ejecurar las pruebas
1. Abrir el proyecto desde el IDE IntelliJ IDEA.
2. Instalar las dependencias del proyecto especificadas en el archivo "build.gradle".
3. Para ejecutar el proyecto solo abriremos el script "src\test\java\starter\runners\CucumberTestSuite.java" y los ejecutaremos.

   ![image](https://github.com/dbchango/ntt-challenge-serenity-E2E/assets/49067691/01ade333-ebd5-45b4-8cb1-5ae618de5423)

5. La prueba se ejecutará y podremos revisar el reporte de la ejecución en la dirección "\target\site\serenity\index.html".

   ![image](https://github.com/dbchango/ntt-challenge-serenity-E2E/assets/49067691/db0e1499-9aab-480b-8418-2a30617bfd38)

## 4. Información adicional
Referencias: 
- https://serenity-bdd.github.io/docs/tutorials/cucumber-screenplay
- https://github.com/serenity-bdd/serenity-cucumber-starter/tree/screenplay
