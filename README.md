<h3 align="center">Estamos <i>reescribiendo</i> gran parte del código para ofrecer una <a href="https://newpipe.net/blog/pinned/announcement/newpipe-0.27.6-rewrite-team-states/#the-refactor">versión moderna y estable de NewPipe</a>. ¡Descarga las compilaciones nightly <a href="https://github.com/TeamNewPipe/NewPipe-refactor-nightly/releases">aquí</a>!</h3>
<h4 align="center">Trabaja en la rama <code>refactor</code> si quieres contribuir con <i>nuevas funcionalidades</i>. La rama estable está en modo mantenimiento y solo recibirá correcciones de errores.</h4>

<p align="center"><a href="https://newpipe.net"><img src="assets/new_pipe_icon_5.png" width="150"></a></p>
<h2 align="center"><b>NewPipe</b></h2>
<p align="center">Un frontend libre y ligero para Android, diseñado para ofrecer streaming sin dependencia de servicios propietarios.</p>

<p align="center"><a href="https://f-droid.org/packages/org.schabi.newpipe/"><img src="https://fdroid.gitlab.io/artwork/badge/get-it-on-en.svg" alt="Get it on F-Droid" width="206"/></a></p>

<p align="center">
<a href="https://github.com/TeamNewPipe/NewPipe/releases" alt="GitHub NewPipe releases"><img src="https://img.shields.io/github/release/TeamNewPipe/NewPipe.svg" /></a>
<a href="https://github.com/TeamNewPipe/NewPipe-nightly/releases" alt="GitHub NewPipe nightly releases"><img src="https://img.shields.io/github/release/TeamNewPipe/NewPipe-nightly.svg?labelColor=purple&label=dev%20nightly" /></a>
<a href="https://github.com/TeamNewPipe/NewPipe-refactor-nightly/releases" alt="GitHub NewPipe refactor nightly releases"><img src="https://img.shields.io/github/release/TeamNewPipe/NewPipe-refactor-nightly.svg?labelColor=purple&label=refactor%20nightly" /></a>
<a href="https://www.gnu.org/licenses/gpl-3.0" alt="License: GPLv3"><img src="https://img.shields.io/badge/License-GPL%20v3-blue.svg" /></a>
<a href="https://github.com/TeamNewPipe/NewPipe/actions" alt="Build Status"><img src="https://github.com/TeamNewPipe/NewPipe/actions/workflows/ci.yml/badge.svg?branch=dev&event=push" /></a>
<a href="https://hosted.weblate.org/engage/newpipe/" alt="Translation Status"><img src="https://hosted.weblate.org/widgets/newpipe/-/svg-badge.svg" /></a>
</p>

<p align="center">
<a href="https://web.libera.chat/#newpipe" alt="IRC channel: #newpipe"><img src="https://img.shields.io/badge/IRC%20chat-%23newpipe-brightgreen.svg" /></a>
<a href="https://matrix.to/#/#newpipe:matrix.newpipe-ev.de" alt="Matrix channel: #newpipe"><img src="https://img.shields.io/badge/Matrix%20chat-%23newpipe-blue" /></a>
</p>

<hr>

## Descripción general

NewPipe es una aplicación Android libre y de código abierto que ofrece una interfaz de streaming centrada en la privacidad. Funciona sin necesidad de una cuenta de usuario y evita dependencias propietarias como Google Play Services.

Esta rama está enfocada en la reestructuración del código. Para nuevas funcionalidades usa la rama <code>refactor</code>. La rama estable está en mantenimiento y recibe únicamente correcciones de errores.

## Enlaces rápidos

- [Sitio web](https://newpipe.net)
- [Blog](https://newpipe.net/blog/)
- [Preguntas frecuentes](https://newpipe.net/FAQ/)
- [Documentación](https://teamnewpipe.github.io/documentation/)
- [Guía de contribución](.github/CONTRIBUTING.md)

## Capturas

[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/00.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/00.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/01.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/01.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/02.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/02.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/03.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/03.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/04.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/04.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/05.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/05.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/06.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/06.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/07.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/07.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/08.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/08.png)
<br/><br/>
[<img src="fastlane/metadata/android/en-US/images/tenInchScreenshots/09.png" width="405" />](fastlane/metadata/android/en-US/images/tenInchScreenshots/09.png)
[<img src="fastlane/metadata/android/en-US/images/tenInchScreenshots/10.png" width="405" />](fastlane/metadata/android/en-US/images/tenInchScreenshots/10.png)

## Servicios compatibles

NewPipe soporta actualmente las siguientes plataformas:

- YouTube y YouTube Music
- PeerTube y todas sus instancias
- Bandcamp
- SoundCloud
- media.ccc.de

Si quieres añadir un nuevo servicio, contáctanos antes de comenzar. Nuestra [documentación](https://teamnewpipe.github.io/documentation/) explica cómo ampliar la aplicación y el [NewPipe Extractor](https://github.com/TeamNewPipe/NewPipeExtractor).

## Funcionalidades

- Ver vídeos en resoluciones de hasta 4K
- Reproducir solo audio en segundo plano
- Modo ventana flotante / Picture-in-Picture en dispositivos compatibles
- Ver retransmisiones en directo
- Activar subtítulos y closed captions
- Buscar vídeos, audio, canales, listas de reproducción y álbumes
- Navegar el contenido dentro de canales
- Suscribirse a canales sin iniciar sesión
- Recibir notificaciones de nuevos vídeos de canales suscritos
- Organizar canales en grupos para facilitar la navegación
- Ver y buscar el historial de reproducción
- Crear y gestionar listas de reproducción locales
- Descargar vídeos, audio y subtítulos
- Abrir contenido directamente en Kodi
- Ver o bloquear contenido con restricción de edad

## Instalación y actualizaciones

Métodos recomendados para instalar NewPipe:

1. Añade el repositorio de NewPipe a F-Droid e instala desde allí.
2. Descarga el APK desde [GitHub Releases](https://github.com/TeamNewPipe/NewPipe/releases) y verifica la firma.
3. Instala desde actualizaciones de F-Droid (más lento, porque F-Droid recompila y firma los paquetes).
4. Compila un APK de depuración localmente (más rápido para desarrollo, pero más complejo).
5. Usa un APK específico de un PR al probar una función o corrección de errores de este repositorio.

Los métodos 1 y 2 usan la misma clave de firma y son compatibles entre sí. Las actualizaciones desde F-Droid no son compatibles con APKs instalados por los métodos 1 o 2. Los APK de depuración están firmados con una clave diferente y no se pueden actualizar con builds firmados de producción.

### Cambio seguro de fuente

1. Haz copia de seguridad de tus datos en Ajustes > Copia de seguridad y restauración > Exportar base de datos.
2. Desinstala NewPipe.
3. Instala el APK desde la nueva fuente.
4. Restaura tus datos en Ajustes > Copia de seguridad y restauración > Importar base de datos.

> **Nota:** Solo restaura bases de datos exportadas desde el mismo tipo de build de la aplicación. Importar datos desde un APK diferente puede corromper tu instalación.

### Clave de firma del APK

Usa esta huella para verificar los APK oficiales de NewPipe firmados por el proyecto:

```
CB:84:06:9B:D6:81:16:BA:FA:E5:EE:4E:E5:B0:8A:56:7A:A6:D8:98:40:4E:7C:B1:2F:9E:75:6D:F5:CF:5C:AB
```

## Contribuciones

Las contribuciones son bienvenidas en todos los niveles: informes de errores, código, traducciones, mejoras de UI, documentación y más. Consulta nuestra [guía de contribución](.github/CONTRIBUTING.md) para más información.

<a href="https://hosted.weblate.org/engage/newpipe/">
<img src="https://hosted.weblate.org/widgets/newpipe/-/287x66-grey.png" alt="Translation status" />
</a>

## Donaciones

Si te gusta NewPipe, considera donar a través de Liberapay. Las donaciones ayudan a que el proyecto siga siendo independiente y sostenible.

<table>
  <tr>
    <td><a href="https://liberapay.com/TeamNewPipe/"><img src="https://upload.wikimedia.org/wikipedia/commons/2/27/Liberapay_logo_v2_white-on-yellow.svg" alt="Liberapay" width="80px" /></a></td>
    <td><a href="https://liberapay.com/TeamNewPipe/"><img src="assets/liberapay_qr_code.png" alt="Visit NewPipe at liberapay.com" width="100px" /></a></td>
    <td><a href="https://liberapay.com/TeamNewPipe/donate"><img src="assets/liberapay_donate_button.svg" alt="Donate via Liberapay" height="35px" /></a></td>
  </tr>
</table>

## Política de privacidad

NewPipe protege tu privacidad y no recopila datos sin tu consentimiento. Detalles sobre informes de fallos y otros envíos opcionales están disponibles en la política de privacidad: [https://newpipe.net/legal/privacy/](https://newpipe.net/legal/privacy/).

## Licencia

[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

NewPipe es software libre. Puedes usarlo, estudiarlo, compartirlo y mejorarlo bajo los términos de la [Licencia Pública General GNU](https://www.gnu.org/licenses/gpl.html), versión 3 o posterior.
