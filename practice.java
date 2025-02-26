## プログラムの構成

```java
class クラス名 {
  public static void main(String[] args) {
    // 処理文
  }
}
Javaのプログラムはクラスの集まりです。
クラス名とソースプログラムのファイル名を合わせることが重要です。
クラスの内容は {} の間（ブロック）に書きます。
処理のまとまりはメソッドと呼ばれ、Javaは main メソッドから実行されます。
処理文は ; セミコロンで終わります。
System.out.println() は () 内のデータを表示します。

## わかりやすいプログラムを書く3つのポイント

### ① コメント: プログラム内のメモ書き

- `//コメント` 1行のコメント
- `/*コメント*/` 複数行のコメント

### ② フォーマット: プログラムの体裁

- ブロックの開始・終了や処理文毎に改行する
- タブや半角スペースで字下げ（インデント）する

### ③ 命名ルール: 名付けの慣習

- 1文字目:
  - クラス・インタフェース: 大文字
  - 変数・メソッド・パッケージ: 小文字
- 2つ目以降の単語は大文字から


## 変数

### ・変数はデータの入れ物

### ・変数名のルール
- 1文字目:
  - 英字(a~z, A~Z), `_`, `.` , `$`
- 2文字目以降は数字も可
- キーワードは使えない（`public`, `static`, `void` など）

### ・変数の使い方

#### ① 宣言する: 変数を作る
- データ型 変数名, 変数名, .....;
- 例: `int month, day;`

#### ② 代入する: 値を入れる
- `変数名 = 値;`
- 例: `age = 20;`

#### ③ 参照する: 値を見る
- ① + ② 初期化する
- 例: `int age = 20;`

```java
class Variable {
  public static void main(String[] args) {
    int month;
    month = 9;
    int day = 16;

    System.out.println("この勉強は、");
    System.out.println(month + "月" + day + "日にしました！");
  }
}


## データ型 (基本データ型)(参照型)

データ型は、データの種類であり、3000種類以上のデータ型があります。

### ① 基本データ型

#### 整数
- `byte`    8ビット
- `short`   16ビット
- `int`     32ビット
- `long`    64ビット

#### 小数
- `float`   32ビット (4バイト、単精度浮動小数点数)
- `double`  64ビット (8バイト、倍精度浮動小数点数)

#### 文字
- `char`    16ビット (1文字、Unicode)

#### 真偽値
- `boolean` true (真) / false (偽)

### ② 参照型
- 文字列 (`String`)
- 配列

数値はデフォルトで `int` と `double` 型です。  
`float` 型の小数には `f` または `F` を、`long` 型の整数には `l` または `L` を付ける必要があります。  
文字データは `''` で囲みます。

```java
class DataType {
  public static void main(String[] args) {
    int month = 12;
    int day = 29;
    float weight = 63.0f;
    double height = 168.5;
    char bloodType = 'A';

    String name = "蕪木";

    System.out.println("こんにちは" + name + "です");
    System.out.println("身長は" + height + "cm、体重は" + weight + "kg");
    System.out.println("誕生日は" + month + "月" + day + "日");
    System.out.println("血液型は" + bloodType + "型です");
    System.out.println("よろしくお願いします");
  }
}
③ 参照型 (文字列: String)
java
コピーする
String name = "蕪木";
S は大文字で、文字列は "" で囲みます。
この "蕪木" という文字列のデータは、メモリ上の別の領域に保存されます。
name 変数には、"蕪木" という文字列がメモリ上のどこに保存されているかというアドレス（住所）の値が格納されます。これを参照値（アドレス）と言います。
16バイトの0と1で表現できることがわかります。
文字列は、最初に作られるときに何文字になるか、必要なメモリがどれぐらいかが分からないため、プログラム実行時に必要なメモリを確保し、そのメモリのアドレス（参照値）を変数に入れます。これにより、メモリを効率よく使うことができます。

データ自体はメモリ上の別の場所に置かれ、そのアドレス（参照値）が変数に格納されるため、これを参照型と呼びます。

基本データ型と参照型の違い
基本データ型: 変数の中にデータそのものが入る
参照型: 変数の中にはデータの参照値（アドレス）が入る
※入るものが明確に異なります。