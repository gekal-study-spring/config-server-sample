# コンフィグサーバーサンプル

## コンフィグ

### コンフィグリソース

```
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties
```

1. application: 
2. profile
3. label

## 設定変更

### アプリケーションプロパティの読み込み

```bash
# アプリケーション名の変更
java -jar config-client-0.0.1-SNAPSHOT.jar --spring.application.name=first-client
# プロファイル名の変更
java -jar config-client-0.0.1-SNAPSHOT.jar --spring.profiles.active=profile
```

## 参照

1. [Spring Cloud Config](https://cloud.spring.io/spring-cloud-config/reference/html/)
2. [Spring Boot 2.0でSpring Cloud Config Serverをセキュリティ付きで作る](https://qiita.com/suke_masa/items/fdf36aef263cca2a88df)
