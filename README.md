# Company_Simulation_API

## 実行可能jarファイルの作成

```shell
権限変更
chmod 744 mvnw
```
```shell
jarファイル作成
./mvnw clean package
```
```shell
テスト通さずjarファイル作成
./mvnw clean package -DskipTests=true
```

### jarファイルの実行

```shell
java -jar target/company_simulation_api-0.0.1-SNAPSHOT.jar
```

## 環境変数を設定して起動する方法
- 参考資料
  - application.ymlに環境変数をセットする方法
    https://qiita.com/niwasawa/items/8e119ac9c7844bc96a61
