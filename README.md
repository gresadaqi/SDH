# Projekt Enkriptimi në Java – SDH

Ky projekt përmban implementimin e tre algoritmave klasikë të enkriptimit duke përdorur gjuhën Java:

- Homophonic Substitution Cipher
-  Rail Fence Cipher
-  Morse Code Cipher

---

## Udhëzime për ekzekutim

Për të ekzekutuar programin në mënyrë të saktë, ndiq këto hapa:

1. Hap projektin në **IntelliJ IDEA**.
2. Navigo te klasa `Main.java` që ndodhet në paketën `ciphers`.
3. Kliko me të djathtën mbi `Main.java` dhe zgjidh `Run 'Main'`.
4. Në terminalin poshtë do të shfaqen rezultatet e ekzekutimit për secilin algoritëm (tekst origjinal, i koduar dhe i dekriptuar).

---

### Homophonic Substitution Cipher

### Përshkrim:
Ky algoritëm përdor një hartë zëvendësimi ku secila shkronjë mund të përfaqësohet me disa kode numerike. Në kohën e kodimit, një nga këto kode zgjidhet rastësisht për secilën shkronjë, duke rritur sigurinë dhe duke shmangur analizën e frekuencës.

## Si funksionon Homophonic Substitution Cipher?

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

###  Rail Fence Cipher – Java Implementation

Ky projekt përmban një implementim të Rail Fence Cipher, një algoritëm klasik i enkriptimit 
që përdor transpozicion për të koduar tekstin. Programi është ndërtuar në Java dhe mund 
të ekzekutohet përmes IntelliJ IDEA.


**Pershkrim:**

**Përshkrimi i algoritmit Rail Fence Cipher**

Rail Fence Cipher është një metodë e thjeshtë për të koduar një mesazh duke ndryshuar renditjen e shkronjave pa i zëvendësuar ato. Kjo teknikë bazohet në një model zigzag për të shpërndarë shkronjat në disa rreshta, të cilët përfaqësojnë (rails), dhe më pas lexon ato rreshta në një rend të caktuar për të krijuar mesazhin e koduar.

🔸Si funksionon kodimi (encryptimi):
Marrim tekstin që duam ta kodojmë dhe zgjedhim një numër rreshtash (key), që tregon sa "hekurudha" do të kemi.

Shkronjat e tekstit vendosen një nga një në rreshta sipas një modeli zigzag (fillon nga lart, zbret poshtë, pastaj ngjitet lart, dhe kështu me radhë).

Pasi të gjitha shkronjat janë vendosur, lexohen rresht për rresht dhe bashkohen në një varg të vetëm për të formuar mesazhin e koduar.

### Morse Code Cipher - Java implemenation

Ky projekt ofron një implementim të thjeshtë në Java për enkriptimin e tekstit në Kodin Morse. 
Është një shembull shumë i mirë për të kuptuar si funksionojnë hartat (maps) në Java dhe si mund të realizohet një teknikë e thjeshtë enkriptimi.

**Pershkrim:**

**Pershrkimi i algorimit te Kodit te Morse**

Enkripton shkronjat (A-Z), numrat (0-9) dhe hapësirat (' ') në Kodin Morse.
Karakteret e panjohura zëvendësohen me simbolin ?.
Lehtësisht i zgjerueshëm për dekriptim dhe ndërfaqe grafike.

Shembull i Ekzekutimit
Input:
Shkruaj tekstin që dëshiron ta enkriptosh në Morse Code:
Hello World 123

Output:
Teksti i enkriptuar në Morse Code:
.... . .-.. .-.. --- / .-- --- .-. .-.. -.. / .---- ..--- ...--





## 🧹 Git Ignore

Projekti përfshin një `.gitignore` të konfiguruar për projekte Java dhe IntelliJ IDEA, duke shmangur ngarkimin e fajllave `.class`, `.iml`, `out/`, dhe `.idea/`.




