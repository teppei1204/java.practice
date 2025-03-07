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


## 配列

### ・配列は同じデータ型の変数を複数まとめて管理するもの

- 配列を生成するには `new` を使います。生成時にデフォルト初期化が設定されます。
  - 整数や少数なら `0`
  - 文字なら空文字 (`''`)
  - 真偽値なら `false`

### ・配列の生成方法
```java
データ型[] 配列名 = new データ型[要素数];
int[] score = new int[3];  // new int[3]なので、メモリ上に32ビットの整数を入れる領域を3つ作成
score には、このデータがメモリ上のどこにあるかというアドレスの値（参照値）が格納されます。
添字は [] 内の数字で、0から始まります。
java
コピーする
score[0] = 80;  // 添字0
・配列の初期化
java
コピーする
データ型[] 配列名 = {値1, 値2, ...};
・配列の長さを取得
java
コピーする
配列名.length  // 配列の要素数を取得できます
・例: 配列の使用例
java
コピーする
class Array {
  public static void main(String[] args) {
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;

    String[] name = {"蕪木", "佐藤", "田中"};

    System.out.println(name[0] + "さん:" + score[0] + "点");
    System.out.println(name[1] + "さん:" + score[1] + "点");
    System.out.println(name[2] + "さん:" + score[2] + "点");
    System.out.println("受験者数:" + score.length + "名");
  }
}
・多次元配列
配列の中に配列を作成することができます。
java
コピーする
int[][] allScore = new int[2][3];  // [行][列]
一つ目の行は最初の数値が [0] で、列に合わせて [0][0], [0][1], [0][2] となります。
allScore.length は 2、allScore[0].length は 3 です。
・多次元配列の初期化
java
コピーする
int[][] allScore = {{10, 20, 30}, {40, 50, 60}};
・コマンドラインからのデータ入力
java コマンド実行時に、プログラムにデータを渡すことができます。
bash
コピーする
> java CmdLine Hello Java
java
コピーする
class CmdLine {
  public static void main(String[] args) {
    // コマンドラインから渡されたデータを受け取るString型の配列 args
  }
}
java
コピーする
class CmdLine {
  public static void main(String[] args) {
    System.out.println("args[0] : " + args[0]);
    System.out.println("args[1] : " + args[1]);
    System.out.println("args.length : " + args.length);
  }
}
コマンドラインから入力されたデータは、args 配列に格納され、プログラムが開始します。


## 演習問題

### Q.1
**GreetingBug.javaをコンパイルするとエラーが表示されてしまいました。どこが間違えているでしょうか。**

```java
class GreetingBug {
  pubric static void main(String args){
    System,out.println("こんにちは。");
    System.out.println("一緒に頑張りましょう");
  }
}
間違い

A___ public のスペルミス
A___ 2行目 [] が足りない
A___ 3行目の , が . である
A___ 3行目の : が ; である
A___ 6行目の { が } である
Q.2
ShowData.javaにコードを追加して、変数の値を画面に表示するプログラムを完成させてください。 変数のデータ型や変数名、値は以下の通り。

int num = 10
double pi = 3.14
char blood = 'A'
boolean fun = true
String msg = "好きなメッセージ"
java
コピーする
class ShowData {
  public static void main(String[] args) {
    // 変数の宣言と値の代入
    int num = 10;
    double pi = 3.14;
    char blood = 'A';
    boolean fun = true;
    String msg = "努力";

    // 値の表示
    System.out.println(num);
    System.out.println(pi);
    System.out.println(blood);
    System.out.println(fun);
    System.out.println(msg);
  }
}
Q.3
ArrayBug.javaをコンパイルして実行するとエラーが表示されてしまいました。どこをどのように直せば良いでしょうか。

java
コピーする
class ArrayBug {
  public static void main(String[] args) {
    String[] name = new String[4];

    name[0] = "蕪木";
    name[1] = "木下";
    name[2] = "佐藤";
    name[3] = "鈴木";
    name[4] = "大橋";  // ここがエラー

    System.out.println(name[0]);
    System.out.println(name[1]);
    System.out.println(name[2]);
    System.out.println(name[3]);
    System.out.println(name[4]);
  }
}
間違い

配列の指定は4つなので、添字 0 から 3 までの範囲で指定しなければなりません。
name[4] は範囲外です。正しくは、name[3] までに修正する必要があります。
Q.4
ScoreArray.javaにコードを追加して、テストの点数を表示するプログラムを完成させてください。

点数 (int型) を4つ格納する配列 data には以下の値を代入します。

配列 data
添字 0: 90
添字 1: 80
添字 2: 100
添字 3: 90
java
コピーする
class ScoreArray {
  public static void main(String[] args) {
    // 配列の生成
    int[] data = new int[4];

    // 配列に値を代入
    data[0] = 90;
    data[1] = 80;
    data[2] = 100;
    data[3] = 90;

    // 値を表示
    System.out.println("1人目は" + data[0] + "点");
    System.out.println("2人目は" + data[1] + "点");
    System.out.println("3人目は" + data[2] + "点");
    System.out.println("4人目は" + data[3] + "点");
  }
}


## 演算子

### ① 算術演算子
- `7 / 2 -> 3`  
  あまりは切り捨てられます。
- `7 % 2 -> 1`  
  余りを求める演算子です。

### ② 代入・複合代入演算子
- `a += b -> aにbを加えてaに代入`  
  これは `a = a + b` と同じです。

### ③ インクリメント・デクリメント演算子
- `a++ -> aに1を加える`  
  これは `a = a + 1` または `a += 1` と同じです。

### ④ 関係演算子
- `a >= 0 -> aが0以上ならtrue`

### ⑤ 論理演算子
- `(a >= 0) && (b >= 0) -> aが0以上かつbが0以上ならtrue`

### Integer.parseInt(): 文字列型をint型に変換
- `int a = Integer.parseInt(args[0]);`

### コード例

```java
class Operator {
  public static void main(String[] args) {
    // コマンドラインから入力したデータ(文字列型)をint型に変換する
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.println("a = " + a + ", b = " + b);
    System.out.println("a + b = " + (a + b));  // 計算結果の表示
    System.out.println("a - b = " + (a - b));  // 計算結果の表示
    System.out.println("a * b = " + (a * b));  // 計算結果の表示
    System.out.println("a / b = " + (a / b));  // 計算結果の表示
    System.out.println("a % b = " + (a % b));  // 計算結果の表示
    System.out.println("a >= 0 : " + (a >= 0));  // aが0以上かどうか
    System.out.println("(a >= 0) && (b >= 0) : " + ((a >= 0) && (b >= 0)));  // aとbが0以上かどうか
  }
}


## 基本データ型の型変換

### 数値同士の演算や代入をする時にデータ型の変換が行われる場合

- **自動で行われる**: 表現できる値の幅が小 → 大
- **キャストで明示する**: 大 → 小

### 型の変換の順番
- 小: `byte` → `short` → `int` → `long` → `float` → 大: `double`

- **小 → 大へは自動**  
  コンピュータは小さな型のデータを、大きな型に自動で変換します。例えば、`int`型（32ビット）は`double`型（64ビット）に自動で変換できます。

- **大 → 小へは明示的にキャストが必要**  
  大きな型を小さな型に変換する場合は、明示的にキャスト（強制的に型を変換する）を行う必要があります。

### 理由

- `int i;` → 32ビット
- `double d;` → 64ビット

`d = i;` では、`i`は32ビットの整数ですが、`d`は64ビットの浮動小数点型なので、データ型が大きい方に変換するのは自動で行われます。

しかし、逆に`i = (int)d;` では、`d`（64ビットの`double`型）を32ビットの`int`型に代入するため、明示的にキャストを行う必要があります。

**キャスト**は型変換しても問題ないことをコンパイラに知らせる記述です。

### キャストを行うプログラム

```java
class Cast {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.08; // 消費税8％
    int amount;

    // 計算結果をint型にキャストしてamountに代入
    amount = (int)(price * (1 + rate));
    System.out.println("税込金額: " + amount + "円");
  }
}
上記のプログラムでは、price * (1 + rate)の計算結果をint型にキャストしてamountに代入しています。キャストがないと、double型の計算結果をそのままint型に代入することができず、エラーが発生します。


## 構造化プログラミング (if文, switch文)

プログラムは、以下の3つの構造を組み合わせて作成します。

1. **順次進行**  
   処理 -> 処理 -> 処理 ->

2. **分岐**  
   条件 -> true -> 処理 ->  
            -> false -> 処理 ->

3. **繰り返し**  
   条件 -> 処理 ->

---

### if文

`if`文は条件を判定し、条件を満たしていれば処理を実行し、満たさなければ別の処理を実行します。

```java
if (条件式) {
  // 条件を満たした時の処理
} else {
  // 条件を満たしていない時の処理
}
elseは省略可能です。
処理が1つの場合、波括弧 {} を省略することができます。
java
コピーする
class Branch1 {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.10;
    int discount, amount;
    if (price >= 3000) {  // 値引額の設定
      discount = 300;
    } else {
      discount = 0;
    }
    amount = (int)((price - discount) * (1 + rate));
    System.out.println("値引金額:" + discount + "円");
    System.out.println("税込金額:" + amount + "円");
  }
}
else-if文
複数の条件を順番に評価し、最初に真となった条件の処理を実行します。

java
コピーする
if (条件1) {
  // 処理1
} else if (条件2) {
  // 処理2
} else {
  // 処理3
}
条件式は上から順番に評価されます。

java
コピーする
class Branch2 {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.10;
    int discount, amount;

    if (price >= 5000) {  // 値引額の設定
      discount = 500;
    } else if (price >= 3000) {
      discount = 300;
    } else {
      discount = 0;
    }

    amount = (int)((price - discount) * (1 + rate));
    System.out.println("値引金額:" + discount + "円");
    System.out.println("税込金額:" + amount + "円");
  }
}
switch文
switch文では、式の値に応じて異なる処理を行います。

java
コピーする
switch(式) {
  case 値1:
    // 処理1
    break;
  case 値2:
    // 処理2
    break;
  default:
    // 処理3
}
式はbyte、short、int、char型のみ使用できます。
caseに対応する値にマッチした場合、その処理が実行されます。
breakでswitch文を終了し、次の処理に進みます。
java
コピーする
class Branch3 {
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
    switch (num) {
      case 1:
        System.out.println("入園料金:8400円");
        break;
      case 2:
        System.out.println("入園料金:7000円");
        break;
      case 3:
        System.out.println("入園料金:5000円");
        break;
      default:
        System.out.println("1:一般, 2:中・高校生, 3:小学生・幼児");
    }
  }
}


## 繰り返し文 (while文, for文)

### while文

`while`文は、条件式が`true`である限り、繰り返し処理を実行します。

```java
while (条件式) {
  // 処理
}
例えば、次のようなコードでは、iが3未満の間、iの値を表示し続けます。

java
コピーする
int i = 0;
while (i < 3) {
  System.out.println("i = " + i);
  i++;
}
表示結果

ini
コピーする
i = 0  
i = 1  
i = 2  
サンプル
java
コピーする
class Loop1 {
  public static void main(String[] args) {
    int i = 0;
    while (i < 3) {
      System.out.println("i = " + i);
      i++;
    }
  }
}
最初に変数iを0で初期化し、その後iをカウントアップしていきます。
for文
for文は、繰り返し処理の際に変数の初期化、条件式の判定、インクリメント処理を1つの構文内で書くことができ、可読性が向上します。

java
コピーする
for (式1; 条件式; 式2) {
  // 処理
}
式1: カウンタ変数の初期化
条件式: 繰り返し処理を続ける条件
式2: 処理後のカウンタ変数の更新（インクリメント）
次のコードは、iが0から2までの値を表示します。

java
コピーする
for (int i = 0; i < 3; i++) {
  System.out.println("i = " + i);
}
サンプル
java
コピーする
class Loop2 {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.println("i = " + i);
    }
  }
}
配列とfor文の組み合わせ
配列を使って、複数のデータを一度に処理する方法として、for文を使ってループ処理を行います。

java
コピーする
class Array {
  public static void main(String[] args) {
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;

    String[] name = {"蕪木", "佐藤", "田中"};

    System.out.println(name[0] + "さん:" + score[0] + "点");
    System.out.println(name[1] + "さん:" + score[1] + "点");
    System.out.println(name[2] + "さん:" + score[2] + "点");
    System.out.println("受験者数:" + score.length + "名");
  }
}
このコードは、3人の名前と得点を表示しています。

リファクタリング例
上記のコードをリファクタリングして、配列の長さに基づいて繰り返し処理を行うようにします。これにより、繰り返し処理が簡潔になり、可読性が向上します。

java
コピーする
class Loop3 {
  public static void main(String[] args) {
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;

    String[] name = {"蕪木", "佐藤", "田中"};

    for (int i = 0; i < score.length; i++) {
      System.out.println(name[i] + "さん:" + score[i] + "点");
    }
    System.out.println("受験者数:" + score.length + "名");
  }
}
配列の長さ score.length を使って、繰り返し処理を行うことで、コードの再利用性が向上します。
iをインデックスとして使用し、名前と得点を対応させて表示します。


// Q.1: Triangle
class Triangle {
  public static void main(String[] args) {
      // 引数を整数に変換
      int height = Integer.parseInt(args[0]);
      int width = Integer.parseInt(args[1]);
      int area; // 面積の値を代入する変数
      
      // 面積の計算
      area = height * width / 2;
      
      // 高さ・幅・面積の表示
      System.out.println("高さ: " + height);
      System.out.println("幅: " + width);
      System.out.println("面積: " + area);
  }
}
// 実行例
// > java Triangle 5 10
// 高さ: 5
// 幅: 10
// 面積: 25

////////////////////////////////////////////////////////////////////////////////

// Q.2: Circle
class Circle {
  public static void main(String[] args) {
      // 引数を整数に変換
      int radius = Integer.parseInt(args[0]);
      double pi = 3.141592;
      double area;
      
      // 面積の計算
      area = radius * radius * pi;
      
      // 小数点第3位以降を切り捨て
      area = (int)(area * 100); 
      area = area / 100;
      
      // 半径と面積の表示
      System.out.println("半径: " + radius);
      System.out.println("面積: " + area);
  }
}
// 変数は宣言したブロック内でのみ有効です。
// 例えば、areaはメソッド内で宣言されたので、メソッド内でのみ使用可能です。

////////////////////////////////////////////////////////////////////////////////

// Q.3: Comparison
class Comparison {
  public static void main(String[] args) {
      // 引数を整数に変換
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      
      // 大きい方の値を表示
      if (a > b) {
          System.out.println("大きいのは " + a + " です");
      } else if (b > a) {
          System.out.println("大きいのは " + b + " です");
      } else {
          System.out.println("同じです");
      }
  }
}
// 変数aとbは、if文の中で使用されており、メインメソッド内で宣言されたため、
// メソッド内であればどこでも使えるスコープです。

////////////////////////////////////////////////////////////////////////////////

// Q.4: LoopMessage
class LoopMessage {
  public static void main(String[] args) {
      // メッセージを10回表示 (while文)
      int i = 1;
      while (i <= 10) {
          System.out.println(i + "回目: フルスタックエンジニアになりたい");
          i++; // インクリメントを忘れないように注意
      }
  }
}
// 変数iはwhile文の中で使われ、メソッド内で宣言されているため、while文の外でも使えるスコープです。

////////////////////////////////////////////////////////////////////////////////

// Q.5: Echo
class Echo {
  public static void main(String[] args) {
      // コマンドラインの入力文字列を表示 (for文)
      for (int i = 0; i < args.length; i++) {
          System.out.println(args[i]);
      }
  }
}
// 変数iはfor文の中で使われており、for文内でのスコープです。
// 変数iはforループ内で宣言されているため、forループの外では使えません。


## オブジェクト指向

### メインメソッドだけで処理を書く限界

メインメソッドひとつで色々な処理を記述するのは限界があります。  
以下の例では、複数の生徒の名前と点数を処理していますが、オブジェクト指向を使用すると、データと処理をより整理できます。

#### 例: オブジェクト指向ではない場合
```java
class NonObject {
  public static void main(String[] args) {
    // データの代入
    int[] score = {80, 100, 75};
    String[] name = {"菅原", "蕪木", "寺島"};

    for (int i = 0; i < score.length; i++) {
      System.out.println(name[i] + "さん: " + score[i] + "点");
    }
  }
}
このコードでは、処理が一か所に集まり、可読性や保守性が低くなります。

実行用クラスと設計図クラス
オブジェクト指向では、実行用クラスと設計図クラスを分けます。設計図クラスは、データ（属性）と処理（操作）をまとめます。

生徒の情報を管理する場合
名前、英語、数学 → 属性 (何のデータを持っているか)
点数を表示する → 操作 (何の処理をできるか)
例:
java
コピーする
class Student {
    String name;
    int englishScore;
    int mathScore;

    // コンストラクタ
    public Student(String name, int englishScore, int mathScore) {
        this.name = name;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
    }

    // 点数を表示するメソッド
    public void showScores() {
        System.out.println("名: " + name + " 英: " + englishScore + " 数: " + mathScore);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("蕪木", 90, 80);
        Student student2 = new Student("橘", 60, 100);
        
        student1.showScores();
        student2.showScores();
    }
}
オブジェクトとは？
具体的なデータを入れて作った実物のことをオブジェクトと言います。
オブジェクト指向は、オブジェクトを中心にしてプログラムを作る考え方です。
オブジェクト指向のメリット
開発効率
複数の人がそれぞれのクラスを担当することで、分担して開発ができ、効率よく進められます。

保守性
一度作ったプログラムを修正や機能追加を行う際に、影響範囲を限定できるためメンテナンスが容易になります。

メモリ効率
必要なクラスや変数をその都度メモリ上に読み込んで実行するので、使用メモリが効率的です。

システム化
何を持っていて、何ができるかという２つの情報をまとめることで、現実世界のシステムをプログラムに置き換えやすくなります。

クラスとオブジェクト
クラスとオブジェクトという考え方は、オブジェクト指向の3大要素の一つに過ぎません。
他にも、継承やポリモーフィズム（多態性）といった重要な概念があります。

## メンバ変数 (属性)

クラス内で定義される変数は「**メンバ変数**」または「**属性**」と呼ばれます。  
例えば、以下のクラス `Student` では、`name`、`engScore`、`mathScore` がメンバ変数にあたります。

```java
class Student {
  // メンバ変数(属性)
  String name;
  int engScore;
  int mathScore;

  // メソッド(操作)
  void display() {
    System.out.println(name + "さん");
    System.out.println("英語 " + engScore + "点・数学 " + mathScore + "点");
  }

  void setScore(int eng, int math) {
    engScore = eng;
    mathScore = math;
  }

  double getAvg() {
    double avg = (engScore + mathScore) / 2.0;
    return avg;
  }
}
メソッドの定義
メソッドの定義は以下のように行います：

scss
コピーする
戻り値の型 メソッド名(引数リスト) {
  (処理)
}
引数
引数は、メソッドが呼び出される際に外部から受け取る値です。
メソッド内で使用するために、引数をメソッドの宣言時に指定します。
戻り値
メソッドが処理を終えた後に呼び出し元に返す値です。
return 文を使って返すことができます。
何も返さない場合は、戻り値の型に void を記述します。
例
上記の Student クラスでは、setScore メソッドが引数を受け取り、getAvg メソッドが戻り値を返しています。

setScore(int eng, int math)：引数 eng と math を受け取り、engScore と mathScore に設定します（戻り値はなし）。
getAvg()：計算した平均を戻り値として返します（戻り値は double 型）。



