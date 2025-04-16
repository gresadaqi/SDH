# SDH
### Homophonic Substitution Cipher

**Përshkrim:**

Homophonic Substitution Cipher është një teknikë e kodimit ku secila shkronjë mund të zëvendësohet me një nga disa simbole të ndryshme të paracaktuara. Qëllimi i kësaj metode është të shmangë analizën e frekuencës, duke bërë që të njëjtën shkronjë ta përfaqësojmë me disa zëvendësime të mundshme, në mënyrë të rastësishme.

Kjo rrit sigurinë e enkriptimit, sidomos kur përdoret për tekste më të gjata, pasi frekuenca e shkronjave nuk është e drejtpërdrejtë.

**Udhëzime për ekzekutim:**

1. Hap projektin në IntelliJ IDEA.
2. Navigo te klasa `Main.java` e cila ndodhet brenda paketës `ciphers`.
3. Ekzekuto programin duke e klikuar me të djathtën mbi fajllin dhe duke zgjedhur `Run 'Main'`.
4. Rezultati do të shfaqet në terminalin poshtë, ku do të shihen teksti origjinal dhe teksti i koduar.

**Shembull rezultati:**

```
Teksti origjinal: HELLO
Teksti i koduar (Homophonic): 11 09 20 22 30
```

*Vlera e koduar ndryshon në çdo ekzekutim për shkak të zgjedhjes rastësore të simboleve nga lista.*




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








