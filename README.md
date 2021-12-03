# java-oop

## Pengenalan Object Oriented Programming

- Object Oriented Programming adalah sudut pandang bahasa pemrograman yang berkonsep "objek"
- Ada banyak sudut pandang bahasa pemrograman, namun OOP adalah yang sangat populer saat ini.
- Ada beberapa istilah yang perlu dimengerti dalam OOP, yaitu: Object dan Class

## Apa itu Object?

- Object adalah data yang berisi field / properties / attribute dan method / function / behavior
- Semua data bukan primitif di Java adalah Object dari mulai Integer, Boolean, Character, String dan yang lainnya.

## Apa itu Class?

- Class adalah blueprint, prototype atau cetakan untuk membuat Object.
- Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object.
- Setiap Object selalu dibuat dari Class.
- Dan sebuah Class bisa membuar Object tanpa batas.

## Class dan Object: Car

- [Car](/src/main/resources/images/class-dan-object.png)
- [Person](/src/main/resources/images/person.png)

## Membuat Class

- Untuk membuat class, kita bisa menggunakan kata kunci class.
- Penamaan class biasanya menggunakan format CamelCase.

## Membuaat Object

- Object adalah hasil instansiasi dari sebuah class
- Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung()

## Field

- Fields / Properties / Attribute adalah data yang bisa kita sisipkan didalam Object
- Namun sebelum kita bisa memasukan data di fields, kita harus mendeklarasikan data apa saja yang dimiliki object
  tersebut di dalam deklarasi class-nya
- Membuat field sama seperti membuat variable, namum ditempatkan di block class

## Manipulasi Field

- Fields yang ada di object, bisa kita manipulasi. Tergantung final atau bukan
- Jika final, berarti kita tidak bisa mengubah data field nya, namun jika tidak, kita bisa mengubah field nya.
- Untuk memanipulasi data field, sama seperti cara pada variable.
- Untuk mengakses field, kita butuh kata kunci. (titik) setelah nama object dan diikuti nama fields nya

## Method

- Selain menambahkan field, kita juga bisa menambahkan method ke object
- Cara dengan mendeklarasikan method tersebut di dalam block class
- Sama seperti method biasanya, kita juga bisa menambahkan return value, parameter dan method overloading di method yang
  ada di dalam block class
- Untuk mengakses method tersebut, kita bisa menggunakan tanda titik (.) dan diikuti dengan nama method nya, Sama
  seperti mengakses field.

## Constructor

- Saat kita membuat Object, maka kita seperti memanggil sebuah method, karena kita menggunakan kurung()
- Di dalam class Java, kita bisa membuat constructor, constructor adalah method yang akan dipanggil saat pertama kali
  Object itu dibuat.
- Mirip seperti di method, kita bisa memberi parameter pada constructor
- Nama constructor harus sama dengan nama class, dan tidak membutuhkan kata kunci void atau return value

## Constructor Overloading

- Sama seperti di method, di constructor pun kita bisa melakukan overloading
- Kita bisa membuat constructor lebih dari satu, dengan syarat tipe data parameter harus berbeda, atau jumlah parameter
  harus berbeda

## Memanggil Constructor Lain

- Constructor bisa memanggil constructor lain
- Hal ini memudahkan saat kita butuh menginisialisasi data dengan berbagai kemungkinan
- Cara untuk memanggil constructor lain, kita hanya perlu memanggil seperti memanggil method, namun dengan kata kunci
  this.

##   
