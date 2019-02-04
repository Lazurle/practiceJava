// ◆ラムダ式のいくつかの例

//硬貨インスタンスを受け取り、その値段を返す
(Coin c) -> { return c.getPrice(); }

//何も受け取らず、現在日時を返す
() -> { return new java.util.Date(); }

//関数オブジェクトを受け取り、２回呼び出した合計を返す
(IntBinaryOperator func, int a, int b) -> {
  int result func.applyAsInt(a, b) + func.applyAsInt(a, b);
  return result;
}//上記を高階関数という。

//long配列を受け取り、そのコピーを作る、内容を並び替えて返す
(long array[]) -> {
  long array2[] = java.util.Arrays.copyOf(array, array.length);
  java.util.Arrays.sort(array2);
  return array2;
}

// ◆ラムダ式の省略記法
IntToDoubleFunction func = (int x) -> { return x*x*3.14; };

//ルール１　代入時はラムダ式の引数宣言における型を省略可能
// intという型表記を省略した。
IntToDoubleFunction func = (x) -> { return x*x*3.14; };

//ルール２　ラムダ式の引数が１つの場合は丸カッコを省略可能。
IntToDoubleFunction func x -> { return x*x*3.14; };

//ルール３　ラムダ式が単一のreturn文の場合、波カッコとreturnを省略可能
IntToDoubleFunction func x -> x*x*3.14;

// ◆ラムダ式の応用
//ラムダ式には「自身が評価され関数の実体が生み出される際、
//その時点でアクセス可能なすべての変数の情報を記録し、ラムダ式内で利用できる」
//という特徴がある。
double b = 1.41;
IntToDoubleFunction func = (x) -> { return x*x*b; };
//しかしラムダ式外にある変数bを変更することはできない。
