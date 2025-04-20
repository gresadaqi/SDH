# Projekt Enkriptimi në Java – SDH

Ky projekt përmban implementimin e tre algoritmave klasikë të enkriptimit duke përdorur gjuhën Java:

- Homophonic Substitution Cipher
-  Rail Fence Cipher
-  Morse Code Cipher

---
# Udhëzime për ekzekutim

Për të ekzekutuar programin në mënyrë të saktë, ndiq këto hapa:

1. Hap projektin në GitHub Desktop dhe klono repository-n në kompjuterin tënd lokal përmes File > Clone repository duke futur linkun e GitHub-it:
   https://github.com/gresadaqi/SDH-Grupi5.git

2. Hap IntelliJ IDEA dhe nga menyja zgjidh File > Open, pastaj selekto folderin e projektit që ke klonuar.

3. Navigo te klasa Main.java që ndodhet në paketën ciphers.

4. Kliko me të djathtën mbi Main.java dhe zgjidh Run 'Main'.

5. Në terminalin poshtë do të shfaqen rezultatet e ekzekutimit për secilin algoritëm (tekst origjinal, i koduar dhe i dekriptuar), të strukturuara në këtë formë:

--------------------------------------
[Emri i Algoritmit]
Teksti Origjinal   : [teksti hyrës]
Teksti i Koduar    : [teksti i enkriptuar]
Teksti i Dekoduar  : [teksti i dekriptuar]
--------------------------------------

---

### Homophonic Substitution Cipher

Ky projekt përmban një implementim të algoritmit Homophonic Substitution Cipher. Programi është ndërtuar në Java dhe demonstrohet përmes klasave të veçanta për enkriptim dhe dekriptim.
### Përshkrim:
Ky algoritëm përdor një hartë zëvendësimi ku secila shkronjë mund të përfaqësohet me disa kode numerike. Në kohën e kodimit, një nga këto kode zgjidhet rastësisht për secilën shkronjë, duke rritur sigurinë dhe duke shmangur analizën e frekuencës.

### Si funksionon Homophonic Substitution Cipher?

Homophonic Substitution Cipher është një algoritëm enkriptimi ku secila shkronjë mund të përfaqësohet nga më shumë se një kod numerik i paracaktuar. Qëllimi është të rritet siguria duke bërë më të vështirë analizën e frekuencës.

### Hapat e funksionimit:

1. **Krijimi i hartës së zëvendësimit:**
    - Për çdo shkronjë (p.sh. `A`, `B`, `C`...), caktohet një listë me kode të ndryshme numerike.
    - Shembull:
      ```
      A → ["12", "34"]
      E → ["87", "09"]
      L → ["20", "22"]
      ```

2. **Enkriptimi (encode):**
    - Teksti lexon çdo shkronjë dhe zëvendësohet me një kod të rastësishëm nga lista përkatëse.
    - Për çdo enkriptim, mund të prodhohet rezultat i ndryshëm për të njëjtin tekst.
    - Shembull:
      ```
      Teksti: HELLO
      Rezultat: 11 87 22 20 32
      ```

3. **Dekriptimi (decode):**
    - Krijohet një hartë e anasjelltë ku çdo kod lidhet me shkronjën përkatëse.
    - Mesazhi i koduar ndahet me `split(" ")`, dhe rikthehet në tekst origjinal.
    - Shembull:
      ```
      Kodi: 13 09 22 20 30
      Teksti: HELLO
      ```

### Pse është i sigurt?

- Në cipher të thjeshtë, një shkronjë ka vetëm një zëvendësim (lehtë e dallueshme).
- Në Homophonic, një shkronjë ka shumë kode → shpërndarja është më e rastësishme.
- Vështirësohet analizimi i frekuencës nga sulmuesit.

---

##  Rail Fence Cipher 

Ky projekt përmban një implementim të Rail Fence Cipher, një algoritëm klasik i enkriptimit 
që përdor transpozicion për të koduar tekstin. Programi është ndërtuar në Java dhe mund 
të ekzekutohet përmes IntelliJ IDEA.




### Përshkrimi i algoritmit Rail Fence Cipher

Rail Fence Cipher është një metodë e thjeshtë për të koduar një mesazh duke ndryshuar renditjen e shkronjave pa i zëvendësuar ato. Kjo teknikë bazohet në një model zigzag për të shpërndarë shkronjat në disa rreshta, të cilët përfaqësojnë (rails), dhe më pas lexon ato rreshta në një rend të caktuar për të krijuar mesazhin e koduar.

### Si funksionon enkriptimi:

Marrim tekstin që duam ta kodojmë dhe zgjedhim një numër rreshtash (key), që tregon sa "hekurudha" do të kemi.

Shkronjat e tekstit vendosen një nga një në rreshta sipas një modeli zigzag (fillon nga lart, zbret poshtë, pastaj ngjitet lart, dhe kështu me radhë).

Pasi të gjitha shkronjat janë vendosur, lexohen rresht për rresht dhe bashkohen në një varg të vetëm për të formuar mesazhin e koduar.

### Shembull: Enkriptim dhe Dekriptim me Rail Fence Cipher
Le të marrim këtë shembull për të kuptuar më mirë funksionimin e algoritmit.

Teksti origjinal: <span style="color:cyan">HELLO WORLD</span>

Numri i rreshtave (key): 3

<u>***Enkriptimi***</u>

Në model zigzag me 3 rreshta, shkronjat vendosen kështu:

```
H . . . O . . . R . .
. E . L . W . L . D .
. . L . . . O . . . .
```
Lexojmë rresht për rresht:

```
Rreshti 1: H O R  
Rreshti 2: E L W L D  
Rreshti 3: L O  
```
Mesazhi i enkriptuar: <span style="color:cyan">HORELWLDLO </span>

<u>***Dekriptimi***</u>

Nga teksti i koduar HORELWLDLO dhe duke ditur çelësin 3, mund të rikrijojmë zigzagun për të vendosur shkronjat në pozicionin e duhur dhe ta rikthejmë tekstin origjinal:

Teksti i dekriptuar: <span style="color:orange">HELLO WORLD  </span>

---

## Morse Code Cipher 

Ky projekt ofron një implementim të thjeshtë në Java për enkriptimin e tekstit në Kodin Morse. 
Është një shembull shumë i mirë për të kuptuar si funksionojnë hartat (maps) në Java dhe si mund të realizohet një teknikë e thjeshtë enkriptimi.



### Pershkrimi i algorimit te Kodit te Morse

Enkripton shkronjat (A-Z), numrat (0-9) dhe hapësirat (' ') në Kodin Morse.
Karakteret e panjohura zëvendësohen me simbolin ?.
Lehtësisht i zgjerueshëm për dekriptim dhe ndërfaqe grafike.

### Shembull i Ekzekutimit:

<u>***Enkriptimi***</u>

Input:
Shkruaj tekstin që dëshiron ta enkriptosh në Morse Code:

<span style="color:cyan">Hello World 123</span>


Output:
Teksti i enkriptuar në Morse Code:

<span style="color:cyan">.... . .-.. .-.. --- / .-- --- .-. .-.. -.. / .---- ..--- ...--</span>


<u>***Dekriptimi***</u>

Input nga përdoruesi:

<span style="color:cyan">-- --- .-. ... . -.-. --- -.. .</span>


Teksti i dekriptuar nga Morse Code:

<span style="color:cyan">MORSECODE</span> 

---

##  Git Ignore

Projekti përfshin një `.gitignore` të konfiguruar për projekte Java dhe IntelliJ IDEA, duke shmangur ngarkimin e fajllave :
*.class
*.iml
.idea/
out/



