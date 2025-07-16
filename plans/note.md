# 1. hét
> - példakódok, ebből a példakódból ... kimenet lesz
> - olyan tesztet akarok ami azt teszteli, hogy ...
> - már meglévő tesztgenerálókat nézni -> páldákat írni
> - mi az amit máshogy csinálnék, összehasonlítása a módzsereknek, mennyire van kiforrva a terület, ez miért jobb mint az eddigiek
> - adott keretrendszerre fókuszálás, nem teljes java
> - minél kevésbé kell feldolgozni a nyelvet annál jobb
> - lefedettság alapú generálás

# 2. hét
> - a köztes adatstruktúrából azonnal tesztgenerálás
> - xy függvényt ezekkel a tesztekkel tudom tesztelni, konkrétum
> - a példakódokra megírni a nyelvet
> - random függvényre milyen teszteket írnék (éles projektből, open source-ból) pl kimenet kellene

# 3. hét
> - élesebb kód is legyen majd később, hogyan működik majd azzal (komplexebb kóddal, felhős)
> - meglévő generálókból inspirálódni, hogyan működnek
> - meghatározni, mit dolgoz majd fel a nyelv nagy vonalakban

# 4. hét
> - bemeneti paraméterek meghatározása

# 5. hét
> - példakódot írni, hogy fog majd kinézni a unit test (élessel jobb lenne majd, több is legyen)
> - mockolás
> - methodoknak bemenet és kiemnet elég?

# 6. hét
> - átmenet az input output között
> - mit érdemes mockolni
> - ezután el lehet kezdeni a nyelvtant írni és utána továbbmenni

> # 7. hét
> - tesztek milyen paraméterekkel fognak futni? (+mit várunk el) -> tesztleíró sablon alapján legyen a tesztgenerálás
> - open source kódokat nézni, más generálós kódokat, hoyg működnek
> - mockolás

> # 11. hét
> - interface-en keresztül kapok egy service a-t, van egy éles megvalósítás / van mock megvalósítása (ezt lehetne helyette használni) + configurálni a nyelvben
> - helyettesítőt megadni
> - before bővítése, paraméterezhetőség

# Jegyzetek

> Vizsgálni majd
> - bemenet megfelelő típusú
> - meg lett-e adva minden szükséges paraméter
> - figyelmeztés arra ha egy függvénynek nem lett teszteset gyártva/nem lett sehol se meghívva

Test Method Generation:
Detect methods that call these dependencies and verify they were invoked with the right arguments.

https://medium.com/@keployio/in-the-world-of-java-unit-testing-junit-stands-out-as-one-of-the-most-widely-used-frameworks-30a46e28a71a
https://semaphore.io/community/tutorials/stubbing-and-mocking-with-mockito-2-and-junit

> ### Framework. JUnit 5 (Jupiter)
> - https://www.vogella.com/tutorials/JUnit/article.html
> - https://csharptutorial.hu/docs/hellovilag-hellocsharp/12-modern-alkalmazasfejlesztes/teszt-keretrendszerek/

> ### Test Generators
> - https://stackoverflow.com/questions/14143680/java-junit-test-generators
> - https://squaretest.com/
> - https://arxiv.org/html/2408.07846v2
> - https://mingwei-liu.github.io/assets/pdf/FSE24_chatTester_cameraReady.pdf
> - https://arxiv.org/abs/2009.05617
> - https://zencoder.ai/blog/how-unit-test-generation-works
> - https://github.com/javaparser/javaparser
> - How I should write JUnit tests: https://www.freecodecamp.org/news/java-unit-testing/#:~:text=Do%27s%20and%20Don%27ts%20of%20Unit%20Testing
> - Mocking!!!!

> ### Javaból adatkinyerés:
> - AST generálás (Maven dep.)

> ### C# kinyerés:
> - Roslyn (Java kódból nehézkes használni)
> - IKVM.NET (Javaból elméletlileg hívható, nem stabil)
> - CodeConverter (használható Javaból)