# Raport: Java RMI Kalkulator

## Pogląd ogólny
Celem tego projektu było stworzenie aplikacji kalkulatora przy użyciu języka Java i RMI (Remote Method Invocation). Kalkulator obsługuje podstawowe operacje arytmetyczne, takie jak dodawanie, odejmowanie, mnożenie i dzielenie. Projekt miał na celu implementację architektury klient-serwer, gdzie serwer udostępnia funkcje kalkulatora, a klienci mogą zdalnie łączyć się z serwerem i wykonywać operacje arytmetyczne.

## Główne funkcjonalności i zalety
Oprogramowanie kalkulatora składa się z następujących komponentów:

- Interfejs kalkulatora: Definiuje Interfejs dla operacji kalkulatora, w tym dodawanie, odejmowanie, mnożenie i dzielenie. Interfejs rozszerza interfejs Remote umożliwiający zdalne wywoływanie metod.

- Serwer kalkulatora: Implementuje interfejs kalkulatora i zapewnia funkcjonalność po stronie serwera. Obsługuje operacje arytmetyczne żądane przez klientów.

- Klient kalkulatora: Łączy się z serwerem kalkulatora i zdalnie wykonuje operacje arytmetyczne. Klient komunikuje się z serwerem, wysyła żądania i odbiera wyniki.

- Logowanie: Do logowania działań w serwerze użyto biblioteki SLF4J (Simple Logging Facade for Java).

## Problemy które zostały rozwiązane
Podczas tworzenia oprogramowania rozwiązano następujące problemy:

- Zdalne wywoływanie metod: Implementacja RMI umożliwiła serwerowi kalkulatora udostępnienie swojej funkcjonalności dla zdalnych klientów. RMI obsługuje złożoności komunikacji zdalnej, w tym serializację parametrów i aktywację zdalnych obiektów.

- Komunikacja klient-serwer: Ustanowiono architekturę klient-serwer, umożliwiającą zdalne połączenie klientów z serwerem i wykonywanie operacji arytmetycznych.

- Integracja logowania: Do kodu serwera zostało włączone logowanie z wykorzystaniem biblioteki SLF4J, co umożliwiło śledzenie połączeń klientów i żądań.

## Problemty napotkane podczas budowania aplikacji
Podczas procesu tworzenia oprogramowania napotkano następujące problemy:

- Poprawne zależności: Zapewnienie poprawnej konfiguracji zależności (takich jak SLF4J) w pliku budowania Gradle, aby umożliwić funkcjonalność logowania.

## Korzyści oraz plany na przyszłość
Rozwinięte oprogramowanie kalkulatora zapewnia następujące korzyści:

- Zdalny dostęp: Klienci mogą zdalnie wykonywać operacje arytmetyczne, co umożliwia dostęp do kalkulatora z różnych miejsc i systemów.

- Skalowalność: Architektura klient-serwer umożliwia równoczesne łączenie się wielu klientów, zapewniając skalowalność obsługi licznych żądań.

Możliwe ulepszenia dla oprogramowania kalkulatora mogą obejmować:

- Doskonalenie obsługi błędów: Implementacja lepszych mechanizmów obsługi błędów, takich jak obsługa dzielenia przez zero lub nieprawidłowego wejścia.

- Interfejs użytkownika: Opracowanie graficznego interfejsu użytkownika (GUI) dla aplikacji po stronie klienta w celu poprawy interakcji i doświadczenia użytkownika z kalkulatorem.

- Dodatkowe operacje: Rozszerzenie funkcjonalności kalkulatora w celu obsługi bardziej zaawansowanych operacji matematycznych lub obliczeń naukowych.

## Podsumowanie
Rozwinięte oprogramowanie kalkulatora z powodzeniem implementuje podstawowe operacje arytmetyczne przy użyciu RMI w języku Java. Zapewnia architekturę klient-serwer, umożliwiającą zdalny dostęp do funkcjonalności kalkulatora. Oprogramowanie stanowi solidną podstawę do dalszych ulepszeń wspomianych we wcześniejszym rozdziale.

### Autorzy

- Kacper Gruszczynski (156031)
- Bartosz Wojciechowski (miejsce_na_reklame)

