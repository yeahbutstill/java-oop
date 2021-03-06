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

## Variable Shadowing

- Variable shadowing adalah kejadian ketika kita membuat nama variable dengan nama yang sama di scope yang menutupi
  variable dengan nama yang sama di scope diatasnya.
- Ini biasa terjadi seperti kita membuat nama parameter di method sama dengan nama field di class
- Saat terjadi variable shadowing, maka secara otomatis varibale di scope diatasnya tidak bisa diakses.

## This Keyword

- Saat kita membuat kode di dalam block constructor atau method di dalam class, kita bisa menggunakan kata kunci this
  untuk mengakses object saat ini.
- Misal kadang kita butuh mengakses sebuah field yang namanya sama dengan parameter method, hal ini tidak bisa dilakukan
  jika langsung menyebutkan field, kita bisa mengakses nama field tersebut dengan kata kunci this
- This juga tidak hanya digunakan untuk mengakses field milik object saat ini, namun juga bisa digunakan untuk mengakses
  method
- This bisa digunakan untuk mengatasi masalah variable shadowing

## Inheritance

- Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
- Dalam artian, kita bisa membuat class Parent dan class Child
- Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child
- Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan dimiliki oleh
  class Child
- Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalau diikuti dengan nama class
  parent nya.

## Method Overriding

- Method overriding adalah kemampuan mendeklarasikan ulang method di child class, yang sudah ada di parent class
- Saat kita melakukan proses overriding tersebut, secara otomatis ketika kita membuat object dari class child, method
  yang di class parent tidak bisa diakses lagi.

## Super Keyword

- Kadang kita ingin mengakses method yang terdapat di class parent yang sudah terlanjur kita override di class child
- Untuk mengakses method milik class parent kita bisa menggunakan kata kunci super
- sederhananya, super digunakan untuk mengakses class parent
- tidak hanya method, field milik parent class pun bisa kita akses menggunakan kata kunci super

## Super Constructor

- Tidak hanya untuk mengakses method atau field yang ada di parent class, kata kunci super juga bisa digunakan untuk
  mengakses constructor
- Namun syaratnya untuk mengakses parent class constructor, kita harus mengakses di dalam class child constructor
- jika sebuah class parent tidak memiliki constructor yang tidak ada paramater-nya(tidak memiliki default constructor),
  maka class child wajib mengakses constructor class parent tersebut.

## Object Class

- Di Java, setiap class yang kita buat secara otomatis adalah turunan dari class Object
- Walaupun tidak secara langsung kita eksplisit menyebutkan extends Object, tapi secara otmatis Java akan membuat class
  kita extends Object.
- Bisa dikatakan class Object adalah superclass untuk semua class yang ada di Java.

## Polymorphism

- Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk
- Dalam OOP, Polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
- Polymorphism erat hubungan dengan inheritance

## Type Check dan Casts (Konversi type data)

- Sebelumnya kita sudah tau cara melakukan konversi tipe data(casts) di tipe data primitif
- Casts juga bisa digunakan untuk tipe data bukan primitif(object)
- Namun agar aman, sebelum melakukan casts pastikan kita melakukan type check(pengecekan tipe data), dengan menggunakan
  kata kunci instanceof
- Hasil operator instanceof adalah boolean, true jika tipe data sesuai, false jika tidak sesuai

## Variable Hiding

- Variable hiding merupakan masalah yang terjadi ketika kita membuat nama field yang sama di class child dengan nama
  field class parent
- Tidak ada yang namanya field overriding, ketika kita membuat ulang nama field di class-class, itu berarti variable
  hiding
- Untuk mengatasi variable hiding, caranya kita bisa menggunakan super keyword
- Yang membedakan variable hiding dan method overriding adalah ketika sebuah object di casts
- Saat object di casts, method akan tetap mengakses method overriding, namun variable akan mengakses variable yang ada
  di class nya.

## Package

- Saat kita membuat aplikasi, bisa dipastikan kita akan banyak sekali membuat class
- Jika class terlalu banyak, kadang akan menyulitkan kita untuk mencari atau mengklasifikasikan jenis-jenis class
- Java memiliki fitur package, yaitu fitur mirip folder / direktori, dimana kita bisa menyimpan class-class kita di
  dalam package
- Sama seperti folder / direktori, package juga bisa nested, kita bisa menggunakan tanda titik(.) untuk membuat nested
  package
- Ketika kita menyimpan class di dalam package, maka diatas file Java nya, kita wajib menyebutkan nama package nya

## Access Modifier

- Access modifier adalah kemampuan membuat class field, method dan constructor dapat diakses dari mana saja
- Sebelumnya teman-teman sudah melihat 2 access modifier, yaitu public dan default(no-modifier)
- Sekarang kita akan bahas access modifier lainnya

## Access Level

| Modifier    | Class | Package | Subclass | World |
|-------------|-------|---------|----------|-------|
| public      | Y     | Y       | Y        | Y     |
| protected   | Y     | Y       | Y        | N     |
| no modifier | Y     | Y       | N        | N     |
| private     | Y     | N       | N        | N     |

- Public class
    - Saat kita membuat public class, kita hanya bisa membuat 1 public class di 1 file Java
    - Salain itu, nama public class harus sama dengan nama file

## Import

- Import adalah kemampuan untuk menggunakan class yang berada di package yang berbeda
- Syarat class yang bisa digunakan jika package nya berada adalah class yang harus public

## Import Semua Package

- Jika kita ingin menimport semua class di dalam sebuah package, kita bisa menggunakan tanda *, misal
- import danilaway.belajar.oop.data.*

## Default Import

- Secara default, semua class yang ada di package java.lang sudah auto import, jadi kita tidak perlu melakukan import
  secara manual
- Contoh class String, Integer, Long, Boolean, dan lain-lain terdapat di package java.lang. Oleh karena itu, kita tidak
  perlu meng-import nya secara manual

## Abstract class

- Saat kita membuat class, kita bisa menjadikan sebuah class sebagai abstract class.
- Abstract class artinya, class tersebut tidak bisa dibuat sebagai object secara langsung, hanya bisa diturunkan
- Untuk membuat sebuah class menjadi abstract, kita bisa menggunakan kata kunci abstract sebelum kata kunci class
- Dengan demikian abstract class bisa kita gunakan sebagai kontrak untuk class child

## Abstract Method

- Saat kita membuat class yang abstract, kita bisa membuat abstract method juga di dalam class abstract tersebut
- Saat kita membuat sebuah abstract method, kita tidak boleh membuat block method untuk method tersebu
- Artinya, abstract method wajib di override di class child
- Abstract method tidak boleh memiliki access modifier private

## Geter dan Setter

- Encapsulation
    - Encapsulation artinya memastikan data sensitif sebuah object tersembunyi dari akses luar
    - Hal ini bertujuan agar kita bisa menjaga agar data sebuah object tetap baik dan valid
    - Untuk mencapai ini, biasanya kita akan membuat semua field menggunakan access modifier private, sehingga tidak
      bisa diakses atau diubah dari luar
    - Agar bisa diubah, kita akan menyembunyikan method untuk mengubah dan mendapatkan field tersebut
    - Di Java, proses encapsulation sudah dibuat standarisasinya, dimana kita bisa menggunakan Getter dan Setter method
    - Getter adalah function atau method yang dibuat untuk mengambil data field
    - Setter adalah function atau method untuk mengubah data field

## Standard Pembuatan Getter dan Setter

| Tipe Data | Getter Method | Setter Method          |
|-----------|---------------|------------------------|
| boolean   | isXxx()       | setXxx(boolean value)  |
| primitif  | getXxx()      | setXxx(primitif value) |
| Object    | getXxx()      | setXxx(Object value)   |

## Interface

- Sebelumnya kita sudah tahu bahwa abstract class bisa kita gunakan sebagai kontrak untuk class child nya
- Namun sebenarnya yang lebih tepat untuk kontrak adalah interface
- Jangan salah sangka bahwa Interface disini bukanlah User Interface
- Interface mirip seperti abstract class, yang membedakannya adalah di Interface, semua method otomatis abstract, tidak
  memiliki block
- Di Interface kita tidak boleh memiliki field, kita hanya boleh memiliki constant(field yang tidak bisa diubah)
- Untuk mewariskan interface, kita tidak menggunakan kata kunci extends, melainkan implements

## Interface Inheritance

- Sebelumnya kita sudah tahu kalau di Java, child class hanya bisa punya 1 class parent
- Namun berbeda dengan interface, sebuah child class bisa implement lebih dari 1 interface
- Bahkan interface pun bisa implement interface lain, bisa lebih dari 1. Namun jika interface ingin mewariskan interface
  lain, kita menggunakan kata kunci extends, bukan implements

## Default Method

- Sebelumnya kita tahu bahwa interface, kita tidak bisa membuat konkrit yang memiliki block method
- Namun sejak versi Java 8, ada fitur default method di interface
- Fitur ini terjadi karena untuk maintain kontrak interface jika sudah terlalu banyak class yang implement interface
  tersebut
- Ketika kita menambahkan satu method di interface, secara otomatis semua class yang implement akan rusak karena harus
  meng-override method tersebut
- Dengan menggunakan default method, kita bisa menambahkan konkrit method di interface.

## ToString Method

- toString() adalah method yang terdapat di class Object
- Method ini biasanya digunakan untuk merepresentasikan object dalam bentuk String
- Secara default, toString() ini akan menghasilkan:
    - namaClass + @ + hashCode
- Namub kita bisa mengubahnya jika kita mau, agar object yang kita buat lebih mudah dibaca

## Equals Mehod

- Hal yang agak membingungkan di Java adalah, cara membandingkan object
- Di bahasa pemrograman lain, untuk mengecek apakah sebuah object sama, biasanya menggunakan operator ==, di Java
  operator == hanya untuk mengecek data primitif
- Untuk non primitif pengecekan nya menggunakan method equals
- Dan secara default, method equals itu akan membandingkan dua buah object secara kesamaan posisi object di memory,
  artinya jika kita membuat 2 object yang isi field nya sama, tetap dianggap beda oleh method equals
- Oleh karena itu, ada baiknya kita meng-override method equals milik class Object tersebut

## HashCode Method

- Method hashCode adalah method representasi integer object kita, mirip toString yang merupakan representasi String,
  hashCode adalah representasi integer
- HashCode sangat bermanfaat untuk membuat struktur data unique seperti HashMap, Set dan lain-lain, karena cukup
  menggunakan hashCode method untuk mendapatkan identitas unique object kita
- Secara default hashCode akan mengembalikan nilai integer sesuai data di memory, namun kita bisa mengonverride nya jika
  kita ingin

## Kontrak HashCode Method

Tidak mudah meng-override method hashCode, karena ada kontraknya:

- Sebanyak apapun hashCode dipanggil, untuk object yang sama, harus menghasilkan data integer yang sama
- Jika ada 2 object yang sama jika dibandingkan menggunakan method equals, maka nilai hashCode nya juga harus sama
- Tidak wajib hashCode berbeda jika method equals menghasilkan false, karena memang keterbatasan jumlah integer sekitar
  2 milyar

## Final Class

- Sebelumnya kita pernah menggunakan kata kunci final di Java
- Jika digunakan di variable, maka variable tersebut tidak bisa berubah lagi datanya
- Final pun bisa digunakan di class, dimana jika kita menggunakan kata kunci final sebelum class, maka kita menandakan
  bahwa class tersebut tidak bisa diwariskan lagi
- Secara otomatis semua class child nya akan error

## Final Method

- Kata kunci final juga bisa digunakan di Method
- Jika sebuah method kita tambahkan kata kunci final, maka artinya method tersebut tidak bisa di override lagi di class
  child nya
- Ini sangat cocok jikat kita ingin mengunci implementasi dari sebuah method agar tidak bisa diubah lagi oleh class
  child nya

## Inner Class

- Di Java, kita bisa membuat class di dalam class, atau disebut dengan Inner Class
- Salah satu kasus kita membuat inner class biasanya ketika kita butuh membuat beberapa class yang saling berhubungan,
  dimana sebuah class tidak bisa dibuat tanpa class lain
- Misal kita perlu membuat class Employee, dimana membutuhkan class Company, maka kita bisa membuat class Employee
  sebagai inner class Company
- Cara membuat inner class, cukup membuatnya di dalam blok class outer class nya

## Keuntungan Inner Class Mengakses Outer Class

- Saat kita membuat inner class adalah, kemampuan untuk mengakses outer class nya
- Inner class bisa membaca semua private member yang ada di outer class nya
- Untuk mengakses object class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci this, misal
  Company.this
- Dan untuk mengakses super class outer class nya, kita bisa menggunakan nama class outer nya diikuti dengan kata kunci
  super, misal Company.super

## Anonymous Class

- Anonymous class atau class tanpa nama
- Adalah kemampuan mendeklarasikan class, sekaligus meng-instansiasi object-nya secara langsung
- Anonymous class sebenarnya termasuk inner class, dimana outer class nya adalah tempat dimana kita membuat anonymous
  class tersebut
- Anonymous class sangat cocok ketika kita berhadapan dengan kasus membuat implementasi interface atau abstract class
  sederhana, tanpa harus membuat implementasi class nya
- Kekurangan Anoymous Class adalah tidak bisa di reuse

## Static Keyword

- Sebelumnya kita sudah sering melihat kata kunci static, namun belum pernah kita bahas
- Dengan menggunakan kata kunci static, kita bisa membuat field, method atau class bisa diakses langsung tanpa melalui
  object nya
- Perlu diingat, static hanya bisa mengakses static lainnya

## Static Dapat Digunakan Di

- Field, atau disebut class variable, artinya field tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
- Method, atau disebut class method, artinya method tersebut bisa diakses langsung tanpa membuat object terlebih dahulu
- Block, static block otomatis dieksekusi ketika sebuah class di load
- Inner Class, artinya inner class tersebut bisa diakses secara langsung tanpa harus membuat object outer class terlebih
  dahulu. Static pada inner class menyebabkan kita tidak bisa mengakses lagi object outer class nya.

## Java 14 - Experimental

- Fitur ini masih versi preview dan belum stabil di versi Java 14, namun kita sudah bisa mencobanya
- Tapi perlu diingat, bahwa karena fitur ini masih experimental, artinya tidak ada jaminan di versi Java mendatang,
  fitur ini akan tetap ada, bisa saja dihilangkan.

## Record Class

- Kadang kita sering membuat class, hanya untuk class yang berisikan data. Hanya berisi getter, equals, hashCode, dan
  toString method
- Record class digunakan untuk mempermudah pembuatan jenis class tersebut
- Saat kita membuat record class, secara otomatis Java akan membuatkan getter, equals, hashCode dan toString method
  secara otomatis dan juga constructor secara otomatis
- Saat membuat record class, secara otomatis kita akan meng-extends class java.lang.Record yang artinya kita tidak bisa
  extends class lain. Namun kita tetap bisa meng-implement interface

## Record Class Constructor

- Secara default, constructor di record class akan dibuat secara otomatis, sesuai dengan definisi record class parameter
- Namun jika kita ingin melakukan sesuatu di constructor tersebut, kita bisa membuat compact constructor, yaitu
  constructor tanpa tanda()
- Selain itu kita juga bisa melakukan constructor overloading, namun ada syaratnya, yaitu constructor overloading nya
  harus tetap memanggil constructor utama yang secra otomatis dibuatkan di record class

## Enum Class

- Saat kita membuat aplikasi, kadang kita akan bertemu dengan jenis-jenis data yang nilainya terbatas
- Misal, gender, ada male dan female, atau tipe customer, ada standard dan premium atau VIP dan lain-lain
- Dalam kasus seperti ini kita bisa menggunakan enum class, yaitu class yang berisikan nilai terbatas yang sudah
  ditentukan
- Saat membuat enaum class, secara otomatis dia akan meng-extends class java.lang.Enum, oleh karena itu class enum tidak
  akan bisa extends class lain, namun masih tetap bisa di implements interface.

## Enum Members

- Sama seperti class biasanya, di class enum pun kita bisa menambahkan members(field, method dan constructor)
- Khusus constructor, kita tidak membuat public constructor, karena memang tujuan enum bukun untuk di instansiasi secara
  bebas

## Exception

- Saat kita membuat aplikasi, kita tidak akan terhindar dengan yang namanya error
- Di Java, error direpresentasikan dengan istilah exception, dan semua direpresentasikan dalam bentuk class exception
- Kita bisa menggunakan class exception sendiri, atau menggunakan yang sudah disediakan oleh Java
- Jikat kita ingin membuat exception, maka kita harus membuat class yang extends class Throwable atau turunan-turunannya

## Membuat Exception

- Exception biasanya terjadi di method, ketika kita membuat exception di sebuah method, maka method tersebut harus
  ditandai dengan kata kunci throws diikuti dengan class exception nya.
- Jika method tersebut bisa menimbulkan lebih dari satu jenis exception, kita bisa menambahkan lebih dari satu class
  exception
- Di dalam kode program kita, untuk membuat exception kita cukup menggunakan kata kunci throw, diikuti dengan object
  exception nya

## Try Catch

- Saat kita memanggil sebuah function yang bisa menyebabkan exception, maka kita wajib menggunakan try-catch expression
  di Java
- ini gunanya agar kita bisa menangkap exception yang terjadi, karena jika tidak ditangkap, lalu terjadi exception, maka
  secara otomatis program kita akan berhenti
- Cara menggunakan try-catch expression di java sangat mudah, di block try, kita tinggal panggil method yang bisa
  menyebabkan exception dan block catch kita bisa melakukan sesuatu jika terjadi exception

## Finally Keyword

- Dalam try-catch, kita bisa menambahkan block finally
- Block finally ini adalah block dimana akan selalu dieksekusi baik terjadi exception ataupun tidak
- Ini sangat cocok ketika kita ingin melakukan sesuatu, tidak peduli sukses ataupun gagal, misal di block try kita ingin
  membaca file, di block catch kita akan tangkap jika terjadi error, dan di block finally error ataupun sukses membaca
  file, kita wajib menutup koneksi ke file tersebut, biar tidak menggantung di memory

## Runtime Exception

- Runtime exception adalah jenis exception yang tidak wajib di tangkap menggunakan try catch
- Kompiler Java tidak akan protes walaupun kita tidak menggunakan try catch ketika kita memanggil method yang bisa
  menyebabkan runtime exception
- Untuk melalukan membuat class runtime exception, kita wajib mengextends class RuntimeException
- Ada banyak di Java yang merupakan runtime exception, seperti NullPointerException, IllegalArgumentException dan
  lain-lain

### Jenis Exception

secara garis besar, di Java, exception dibagi menjadi 3 jenis

- Checked Exception, yaitu exception yang wajib di try catch, seperti yang sudah kita bahas sebelumnya
- Runtime Exception
- Error (yang akan kita bahas di materi selanjutnya)

### Perlu Diperhatikan

- Walaupun runtime exception tidak wajib try-catch, tapi ada baiknya kita tetap melakukan try-catch
- Karena jika terjadi runtime exception, yang dilakukan adalah program kita berhenti

## Error

- Error adalah jenis exception yang terakhir
- Error adalah sebuah class di Java, yang tidak direkomendasikan untuk di try-catch
- Biasanya error terjadi ketika ada masalah serius, dan sangat tidak di rekomendasikan untuk di try catch
- Artinya, direkomendasikan untuk mematikan aplikasi
- Contoh, misal jika diawal aplikasi kita tidak bisa terkoneksi ke database, direkomendasikan untuk membuat exception
  jenis Error, dan menghentikan aplikasi

## StackTraceElement Class

- Throwable memiliki method yang bernama getStackTrace(), dimana menghasilkan Array dari StackTraceElement Object
- StackTraceElement berisikan informasi tentang class, file, bahkan baris lokasi terjadina error
- Class StackTraceElement ini sangat penting untuk menelusuri lokasi terjadinya error yang terjadi
- Cara yang paling mudah, kita bisa memanggil method printStackTrace() class Throwable, untuk memprint ke console detail
  error StackTraceElement nya.

## Try With Resource

- Di java 7, terdapat fitur baru yang bernama try with resource
- Try with resource adalah sebuah mekanisme agar kita lebih mudah menggunakan resource (yang wajib di close) dalam block
  try
- Jika kita ingin menggunakan fitur ini, kita wajib menggunakan interface AutoCloseable

## Annotation

- Annotation adalah menambahkan metadata ke kode program yang kita buat
- Tidak semua orang membutuhkan Annotation biasanya Annotation digunakan saat kita ingin membuat library / framework
- Annotation sendiri bisa diakses menggunakan Reflection, yang akan kita bahas nanti
- Untuk membuat annotation, kita bisa menggunakan kata kunci @interface
- Annotation hanya bisa memiliki method dengan tipe data sederhana, dan bisa memiliki default value

## Attribute Annotation

| Attribute  | Keterangan |
|------------|-----------|
| @Target    | Memberitahu annotation bisa digunakan dimana? Class, Method, Field, dan lain-lain |
| @Retention | Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection |

## Predefined Annotation

Java juga sudah memiliki annotation bawaan, seperti:

- @Override, untuk menandai bahwa method yang meng-override method parent class nya
- @Deprecated, untuk menandai bahwa method tersebut tidak direkomendasikan lagi untuk digunakan
- @FunctionalInterface, untuk menandai bahwa class tersebut bisa dibuat sebagai lambda expression
- dan lain-lain

## Reflection

- Reflection adalah kemampuan melihat struktur aplikasi kita pada saat bejalan
- Reflection biasanya sangat berguna saat kita ingin membuat library ataupun framework, sehingga bisa meng-otomatisasi
  pekerjaan
- Untuk mengakses reflection class dari sebuah object, kita bisa menggunakan method getClass() atau NamaClass.class

### Perlu Diperhatikan

- Reflection adalah materi yang sangat panjang
- Oleh karena itu materi Java Reflection akan dibuatkan course terpisah.

## Meteri Selanjutnya

- Java Classes
- Java Generic
- Java Collection
