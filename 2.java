/* 
Merge Sort Aşamaları:

Verilen dizi: [16, 21, 11, 8, 12, 22]

Adım: [16, 21, 11, 8, 12, 22]
Adım: [16, 11, 21, 8, 12, 22]
Adım: [16, 11, 8, 21, 12, 22]
Adım: [16, 11, 8, 12, 21, 22]
Adım: [16, 11, 8, 12, 22, 21]
Adım: [16, 11, 8, 12, 22, 21]
Adım: [8, 11, 16, 12, 22, 21]
Adım: [8, 11, 12, 16, 22, 21]
Adım: [8, 11, 12, 21, 16, 22]
Adım: [8, 11, 12, 16, 22, 21]
Adım: [8, 11, 12, 16, 21, 22]
Dizi sıralandı.

Big-O Gösterimi:
Merge Sort'un Big-O gösterimi 

O(nlogn)'dir.

Bu algoritma, diziyi sürekli ikiye bölerek ve ardından birleştirerek sıralar. Bu nedenle logaritmik ve lineer bir karmaşıklığı vardır.
*/