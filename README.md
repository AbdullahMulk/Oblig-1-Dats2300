# Obligatorisk Oppgave 1 i DATS2300 - Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastruktorer.
Oppgaven er levert av følgende studenter:
* s123456, s123456@oslomet.no
* ...

## Arbeidsfordeling
I oppgaven har vi hatt følgende arbeidsfordeling:
* s123456 har hatt hovedansvar for oppgave 1, 3, og 5.
* s612345 har hatt hovedansvar for oppgave 2, 4, og 6.
* s561234 har hatt hjulpet til med oppgave 2, 4, 5, og hatt hovedansvar for 7.
* s456123 har hatt hovedansvar for oppgave 8, og 9.
* Vi har gjort oppgave 10 felles.

## Oppgavebeskrivelser
### Oppgave 0

I oppgave 0 gikk jeg frem ved å lage metoden `gruppeMedlemmer()`.
Jeg brukte `return` for å returnere antall personer som er med i gruppen.
Siden jeg er én person i gruppen, returnerer metoden tallet `1`.

### Oppgave 1

I oppgave 1 gikk jeg frem ved å sammenligne tallene som står ved siden av hverandre i tabellen.
Hvis tallet til venstre var større enn tallet til høyre, byttet jeg plass på dem.
Jeg brukte en midlertidig variabel for å kunne gjøre byttet.
På denne måten blir det største tallet flyttet til slutten av tabellen.
Til slutt returnerte jeg det siste tallet som den største verdien.
Jeg laget også `ombyttinger()` for å telle hvor mange ganger det ble gjort et bytte.

### Oppgave 2

I oppgave 2 gikk jeg frem ved å utnytte at tabellen allerede var sortert.
Jeg sammenlignet hvert tall med tallet som kom etter det.
Hvis tallene var forskjellige, økte jeg telleren for antall ulike verdier.
Jeg sjekket også underveis om tabellen faktisk var sortert stigende.
Hvis tabellen ikke var sortert, kastet jeg en `IllegalStateException`.
For en tom tabell returnerte jeg `0`.

### Oppgave 3

I oppgave 3 gikk jeg frem ved å sjekke hvert element mot elementene som kom før det.
For hvert tall undersøkte jeg om det samme tallet allerede hadde blitt funnet.
Hvis tallet allerede fantes, gjorde jeg ingenting med telleren.
Hvis tallet ikke hadde blitt funnet tidligere, økte jeg antall unike verdier.
På denne måten kunne jeg finne antall ulike verdier uten å sortere tabellen.
Jeg brukte også en variabel som fortalte om verdien allerede var funnet.

### Oppgave 4

I oppgave 4 gikk jeg frem ved å bruke quicksort for å sortere tabellen.
Først valgte jeg et pivot-element som brukes til å dele tabellen.
Jeg flyttet mindre eller like verdier til venstre for pivoten og større verdier til høyre.
Etterpå brukte jeg quicksort på delene som lå på hver side av pivoten.
Dette ble gjort rekursivt helt til delene var ferdig sortert.
Jeg brukte også egne metoder for å dele opp tabellen og bytte plass på elementer.

### Oppgave 5

I oppgave 5 gikk jeg først frem ved å dele tabellen inn i oddetall og partall.
Jeg brukte én indeks fra venstre og én fra høyre for å finne tall som stod på feil side.
Når jeg fant et partall på venstre side og et oddetall på høyre side, byttet jeg dem.
Etter at oddetallene og partallene var delt, brukte jeg `sorter()` på begge delene.
Dermed fikk jeg sorterte oddetall først og sorterte partall etterpå.

### Oppgave 6

I oppgave 6 gikk jeg frem ved å lagre det siste tegnet i en egen variabel.
Deretter flyttet jeg alle de andre tegnene én plass mot høyre.
Til slutt satte jeg det lagrede tegnet inn på første plass i tabellen.
På denne måten blir tabellen rotert ett steg mot høyre.
Jeg sjekket også om tabellen var `null` eller hadde ett eller ingen elementer, slik at metoden ikke skulle gi feil.

### Oppgave 8

I oppgave 8 gikk jeg frem ved å bruke en `StringBuilder` for å bygge opp resultatet.
For to strenger tok jeg først ett tegn fra hver streng og la dem etter hverandre.
Hvis den ene strengen var lengre, la jeg resten av den til på slutten.
For flere strenger brukte jeg en dobbel for-løkke.
Den ytterste løkken går gjennom tegnposisjonene, mens den innerste går gjennom alle strengene.
Jeg sjekket om hver streng hadde et tegn på den aktuelle posisjonen før jeg la det til i resultatet.
