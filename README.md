# M223: Punchclock
Dies ist eine Beispielapplikation für das Modul M223.

## Loslegen
Folgende Schritte befolgen um loszulegen:
1. Sicherstellen, dass JDK 12 installiert und in der Umgebungsvariable `path` definiert ist.
1. Ins Verzeichnis der Applikation wechseln und über die Kommandozeile mit `./gradlew bootRun` oder `./gradlew.bat bootRun` starten
1. Unittest mit `./gradlew test` oder `./gradlew.bat test` ausführen.
1. Ein ausführbares JAR kann mit `./gradlew bootJar` oder `./gradlew.bat bootJar` erstellt werden.

Folgende Dienste stehen während der Ausführung im Profil `dev` zur Verfügung:
- REST-Schnittstelle der Applikation: http://localhost:8081
- Dashboard der H2 Datenbank: http://localhost:8081/h2-console


## Was das Programm machen soll

Der User soll sich einloggen können
Der User soll Einträge in der Punchclock erstellen, anpassen und löschen können
Der User soll seinen Parkplatz und sein Nummernschild abspeichern können
Der User kann angeben in welcher Abteilung er ist.
Der User muss sich mit seinen eigenen Angaben registrieren könne.
Der User muss sich mit seinen Registrierten Angaben sich einloggen können.
Der User kann neue Entries für die punchclock erfassen.
Der User kann die bereits existierende Entries bearbeiten können.
Der User kann die bereits existierende Entries löschen.
Der User bekommt eine Liste der Entries. 
Der User kann seine Abteilung angeben.
Der User kann seine Parknummer angeben
Der User kann seine Autonummer angeben.


## Programm starten

