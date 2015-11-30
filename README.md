Bruker guide:

Start med å legge til mysql-connector-java-5.1.37 bin.jar

Gjør følgende: høyrekligg på SLIT prosjektet ---> properties --> velg så libraries og klikk på add Add JAR/Folder og velg riktig fil.

Kjør databasescript for å opprette databasen (slitDB) deretter kan du trykk gå inn i netbeans og trykke Run på prosjektet SLIT.


Registrering av bruker:
Velg først rolle og fyll ut feltene for å opprette bruker. Foreleser/Hjelpelærer vil gi en annen visning en student, lag gjerne en av hver.


Litt generelt om brukerhistoriene:
Hjem: visning skal kunne redigeres av foreleser/hjelpelærer der studenten skal kunne se dagens beskjeder, nye opplastede dokumenter og varslinger på innleveringer.

Moduler: I hoved vinduet her skal foreleser kunne legge inn generell info om kur og lagre tekst på lagre knappen.
Publisering av modul gjøres ved at foreleser trykker seg inn på modul nr og fyller ut tekst boksene og deretter publiserer modul. Disse blir ikke synlige for studenten før lærer har publiser modul.
Statistikk: Siden er en visning fra en view i databasen som lister alle brukerne som har godkjent minst 1 modul.
Statusrapport: Her skal studenten fylle ut statusrapport for å slippe ekstern blogg og heller gi foreleser en bedre oversikt over hvordan studenten ligger an i faget. Studenten fyller ut tekstboksene og sender inn statusrapport.
Brukerliste: foreleser skal kunne velge student fra listen og trykke på vis profil knappen for å få oversikt over valgt students arbeid, her skal foreleser kunne gi sensur og se på filer som studenten har lastet opp.
Møte: Her skal foreleser kunne publisere møtetidspunkter som studenter kan booke.