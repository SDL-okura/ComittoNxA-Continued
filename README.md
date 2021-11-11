# ComittoNxA-Continued
[ComittoNxA](https://github.com/ComittoNxA/ComittoNxA)のフォーク

ソースの再利用は自由です. 利用しているライブラリはそれぞれのライセンスに従ってください.

### [Ver1.65A20C1 (2021/11/11)](https://github.com/yuma211-lab/ComittoNxA/releases/tag/1.65A20C1)

- 画像フォーマット[Webp](https://github.com/webmproject/libwebp)およびBmp(24bit/32bit)に対応

TODO（2021/11/11）：PDFとEPUBのテキストデータの読み込み対応（ほぼすべて作り直し） / TIFF対応 / ファイルリスト、検索まわりの不具合の確認 / サードライブラリのアップデート



個人で楽しむために作成しています.  
ソースの再利用は自由です.  
利用しているライブラリはそれぞれのライセンスに従ってください.  

本ソースは、[ComittoNおよびComittoNxN](https://docs.google.com/open?id=0Bzx6UxEo3Pg0SXNIQVdRVnVqemM)、[ComittoNxM](https://www.axfc.net/u/3792235)、[ComittoNxT](https://www.axfc.net/u/3978158)のソースを元にしています.

対応バージョンはAndroid2.3以上です.  


#### 主な変更点

  - Windowsファイル共有サーバへのSMBバージョン2(SMBv2)プロトコルによるアクセスに対応.
  - Android7以降でSDカードアクセス（ファイルのダウンロード・ファイル名の変更・ファイルの削除）に対応.
  - イメージ表示画面でページ境界を越えた連続スクロールに対応.
  - イメージ表示画面とテキスト表示画面に時刻と充電状態を表示する機能を追加.


#### 注意事項

  - イメージ表示画面を開くときに落ちる場合には、画像処理スレッド数と使用メモリサイズを少なめにしてください.  


## 変更履歴


### [Ver1.65A20 (2020/10/23)](https://github.com/ComittoNxA/ComittoNxA/releases/tag/1.65A20)

  - バッテリー表示が更新されない不具合の修正.
  - テキスト閲覧時の改ページ・スクロール条件の再調整.


### [Ver1.65A19 (2020/10/22)](https://github.com/ComittoNxA/ComittoNxA/releases/tag/1.65A19)

  - スクロール中のページ切り替えタイミングの再調整.
  - テキスト閲覧時の改ページ・スクロール速度の調整.
  - 設定保存画面で保存済みの設定ファイルを選択してファイル名を入力欄にコピーできるように変更.


### [Ver1.65A18 (2020/10/22)](https://github.com/ComittoNxA/ComittoNxA/releases/tag/1.65A18)

  - ページ境界を越えてスクロールしているときのページめくり動作を調整.
  - smbjでファイルのタイムスタンプが誤っている不具合を修正.
  - 圧縮ファイル閲覧中のStreamが閉じてしまった場合に回復する処理を追加.


### Ver1.65A17 (2020/09/16)

  - ページめくりのエフェクトにスクロールを追加.
  - イメージ表示画面の設定にスクロールで前後のページへ連続的に移動する設定を追加.
  - 余白カットしているときに拡大縮小のプレビューやルーペが正しく表示されない不具合の修正.
  - イメージ表示画面に表示する画像の左端が欠け右端に余分な画像が表示される不具合の修正.


### Ver1.65A16 (2020/09/10)

  - イメージ表示画面とテキスト表示画面に時刻と充電状態を表示する機能を追加.


### Ver1.65A15 (2020/09/02)

  - フォルダ削除後にサムネイルが1つずれて表示される不具合の修正.


### Ver1.65A14 (2020/09/01)

  - SMB3共有にjcifs-ngでアクセスできない不具合の修正.


### Ver1.65A13 (2020/08/31)

  - SMB共有にsmbjでアクセスしたときのいくつかの不具合の修正.


### Ver1.65A12 (2020/08/30)

  - 暫定的に共通の操作設定にSMB接続ライブラリの種類(jcifs-ngとsmbj)の設定を追加.
  - jcifs-ngでSMBに匿名アクセスできなかった不具合をsmbjで解消.


### Ver1.65A11 (2020/08/26)

  - ファイル選択画面の設定にファイル名の分割とテキストの行数の設定を追加.
  - イメージ表示画面の詳細設定にイメージの拡大縮小率の設定を追加.


### Ver1.65A10 (2020/08/19)

  - SMBサーバ設定のホスト情報にホスト名だけ指定したときに共有フォルダ一覧が表示されない不具合の修正.


### Ver1.65A9 (2020/08/16)

  - Android7~9でのSDカード内へファイルのダウンロード・名前の変更・削除に対応.
  - ファイル書き込みを許可するフォルダをユーザが選択する際に、ストレージのサブフォルダを指定した場合に正常に動作しない不具合の修正.


### Ver1.65A8 (2020/08/15)

  - 細長い端末への対応.


### Ver1.65A7 (2020/08/11)

  - ページ選択モードが画面下をスワイプのときに先頭末尾へ移動の確認ダイアログを出さない.


### Ver1.65A6 (2020/08/10)

  - リモートの画像ファイル単体を表示できない不具合の修正.
  - イメージ表示画面を終了する際に固まる不具合の修正.


### Ver1.65A5 (2020/08/09)

  - 余白カットの微修正.


### Ver1.65A4 (2020/08/08)

  - イメージ表示画面を終了する際に固まる不具合の修正(暫定).
  - SDカード上にファイルをダウンロードできない不具合の修正.
  - 表示モードがリスト表示のときタイムスタンプの表示位置がずれる不具合の修正.
  - ファイル一覧画面でスクロールバーを操作すると異常終了する不具合の修正.
  - ファイル一覧画面でサムネイル作成中に異常終了する不具合の修正.
  - 余白カットの対象に黒を追加.


### Ver1.65A3 (2020/08/07)

  - イメージ表示画面でIMMERSIVEモードが有効の時に下部メニューが正常に表示されない不具合の修正.
  - イメージ表示画面で横の余白カット量を調整する条件を変更.


### Ver1.65A2 (2020/08/06)

  - SMB2の共有フォルダアクセスの際に、一部の環境(MD4の生成が可能)でしか接続できない不具合の修正.
  - ホーム画面にショートカットが作成できない不具合の修正.
  - ディレクトリ選択画面とサーバ選択画面で長押しができない不具合の修正.
  - ファイル一覧画面で左右スクロールで異常終了する不具合の修正.
  - ファイル一覧画面で下部のボタンによる選択時に表示が乱れる不具合の修正.
  - イメージ表示画面でタッチの静止判定が厳しい不具合の修正.
  - イメージ表示画面の縦フリック操作を削除.
  - イメージ表示画面で先頭・末尾移動ボタンを押した際に確認ダイアログを表示.(長押し判定は削除)
  - イメージ表示画面で余白カットかつ見開き対応のとき横の余白カット量を調整.


### Ver1.65A1 (2020/08/05)

  - SMB2の共有フォルダアクセスに対応.
  - SDカード内に保存されたファイルの名前の変更・削除に対応.
  - ツールバーの順番やアイコンを変更.
  - フォルダのサムネイル作成時にフォルダ内のファイルから作成できなければサブフォルダを対象にする.
  - サムネイル作成時に余白を削除。背表紙と折り返しをなるべく避ける.
  - 表示モードがサムネイル表示のときタイトルを()や[]で分解して表示.
  - ソートで「前」「後」や漢数字「一、二、三…」(壱、弐、参…)に対応.
  - ソートの数字の比較でカンマ、小数点に対応.(マイナスは書庫内の画像が逆順になる場合があるので対応しない)
  - 初期フォルダより上のフォルダに移動した場合に、フォルダ内が参照できなくても初期フォルダまでの途中のフォルダを表示するよう変更.
  - 3回連続で起動してタッチするまでに異常終了した場合には、表示モードをリスト表示(サムネイルOFF)にして初期フォルダから起動するよう変更.
  - ページ結合と余白カット方法をより画面にフィットするように変更.
  - イメージ表示画面の先頭・末尾移動ボタンの長押し判定する範囲を変更.
  - イメージ表示画面で縦フリックするとメニューを表示.

  
