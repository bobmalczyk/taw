1. Wprowadzenie przedmiotów
     Adres zasobu http://localhost:8080/api/courses
     Metoda: POST
     Nagłówki: Content-Type: application/json

[1] {
"Nazwa": "Metodologie obiektowe",
"ECTS": 2,
"Sala": 216,
"Egzamin": "tak"
}

[2] {
"Nazwa": "Testowanie oprogramowania",
"ECTS": 1,
"Sala": 216,
"Egzamin": "nie"
}

[3] {
"Nazwa": "Technologie i aplikacje webowe",
"ECTS": 3,
"Sala": 208,
"Egzamin": "nie"
}

[4] {
"Nazwa": "Zarządzanie projektem informatycznym",
"ECTS": 2,
"Sala": 216,
"Egzamin": "nie"
}

[5] {
"Nazwa": "Zaawansowane technologie bazodanowe",
"ECTS": 3,
"Sala": 208,
"Egzamin": "nie"
}

[6] {
"Nazwa": "Technologie komponentowe i sieciowe",
"ECTS": 2,
"Sala": 208,
"Egzamin": "tak"
}

Odpowiedź: 200 OK
Body: Brak 

2. Pobranie wszystkich przedmiotów
     Metoda: GET
     Adres zasobu:  http://localhost:8080/api/courses
     Odpowiedź: 200 OK
     Body:

[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 2,
"nazwa": "Testowanie oprogramowania",
"ects": 1,
"sala": 216,
"egzamin": "nie"
},
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ects": 2,
"sala": 216,
"egzamin": "nie"
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 6,
"nazwa": "Technologie komponentowe i sieciowe",
"ects": 2,
"sala": 208,
"egzamin": "tak"
}
]

3. Pobranie przedmiotów, które mają egzamin
     Metoda: GET
     Adres zasobu: http://localhost:8080/api/courses?egzamin=tak
     Odpowiedź: 200 OK
     Body:
[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 6,
"nazwa": "Technologie komponentowe i sieciowe",
"ects": 2,
"sala": 208,
"egzamin": "tak"
}
]

4. Pobranie przedmiotów, które odbywają sie w sali 216
     Metoda: GET
     Adres zasobu: http://localhost:8080/api/courses?sala=216
     Odpowiedź: 200 OK
     Body:
[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 2,
"nazwa": "Testowanie oprogramowania",
"ects": 1,
"sala": 216,
"egzamin": "nie"
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ects": 2,
"sala": 216,
"egzamin": "nie"
}
]

5. Pobranie przedmiotów, które nie maja egzaminu i odbywają sie w sali 208
     Metoda: GET
     Adres zasobu: http://localhost:8080/api/courses?sala=208&egzamin=nie
     Odpowiedź: 200 OK
     Body:
[
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
}
]


6. Pobranie przedmiotu o identyfikatorze 3
     Metoda: GET
     Adres zasobu: http://localhost:8080/api/courses/3
     Odpowiedź: 200 OK
     Body:
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
}

7. Pobranie przedmiotu o identyfikatorze 15
     Metoda: GET
     Adres zasobu: http://localhost:8080/api/courses/15
     Odpowiedź: 404 Not Found
     Body:



8. Usuniecie przedmiotu o identyfikatorze 2
     Metoda: DELETE
     Adres zasobu: http://localhost:8080/api/courses/2
     Odpowiedź: 204 No Content
     Body:


9. Pobranie wszystkich przedmiotów
     Metoda: GET
     Adres zasobu: http://localhost:8080/api/courses
     Odpowiedź: 200 OK
     Body:

[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ects": 2,
"sala": 216,
"egzamin": "tak"
},
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ects": 2,
"sala": 216,
"egzamin": "nie"
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ects": 3,
"sala": 208,
"egzamin": "nie"
},
{
"id": 6,
"nazwa": "Technologie komponentowe i sieciowe",
"ects": 2,
"sala": 208,
"egzamin": "tak"
}
]

10. Usunięcie wszystkich przedmiotów
      Metoda: DELETE
      Adres zasobu: http://localhost:8080/api/courses
      Odpowiedź: 200 OK
      Body:


11. Pobranie wszystkich przemdiotów
      Metoda: GET
      Adres zasobu: http://localhost:8080/api/courses
      Odpowiedź: 200 OK
      Body:
        []

