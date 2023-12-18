
Verilen diziyi Binary Search Tree (BST) aşamalarıyla oluşturalım:

Başlangıçta, ağacın kökü boştur (null).
Dizinin ilk elemanını kök olarak belirle: root = 7.
5, root'un solundadır: root.left = 5.
1, root'un solundadır: root.left.left = 1.
8, root'un sağındadır: root.right = 8.
3, root'un solundadır ve 5'in sağındadır: root.left.right = 3.
6, root'un solundadır ve 5'in sağındadır: root.left.right.right = 6.
0, root'un solundadır, 1'in solundadır: root.left.left.left = 0.
9, root'un sağındadır: root.right.right = 9.
4, root'un solundadır ve 3'ün sağındadır: root.left.right.left = 4.
2, root'un solundadır ve 1'in sağındadır: root.left.left.right = 2.
Bu aşamalar sonucunda oluşturulan Binary Search Tree aşağıdaki gibidir:

markdown
Copy code
      7
     / \
    5   8
   / \   \
  1   6   9
 / \
0   3
   / \
  2   4