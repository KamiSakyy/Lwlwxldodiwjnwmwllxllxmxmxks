# Вход через Google: настройка за 5 минут

MailGram не имеет сервера, поэтому OAuth-клиент создаёте вы — в своём проекте Google Cloud.
Секретов в приложении нет: **client ID публичного клиента не является секретом**, а `client secret`
не нужен вообще (используется PKCE, RFC 7636).

## Данные этого билда

| Что | Значение |
|---|---|
| Имя пакета (package name) | `com.mailgram.app` |
| SHA-1 подписи | `BA:CF:61:D8:5B:A6:51:0E:27:6B:3C:8D:B8:79:43:0A:51:83:47:32` |
| Scopes | `openid`, `email`, `https://www.googleapis.com/auth/gmail.modify` |
| redirect URI (Android-клиент) | `com.googleusercontent.apps.<ваш-client-id-без-.apps.googleusercontent.com>:/oauth2redirect` |
| redirect URI (Desktop + loopback) | `http://127.0.0.1:7717/oauth2redirect` |

> Приложение показывает эти значения само: **Настройки → Настройка подключения** (пакет, отпечаток
> подписи и redirect URI считаются на устройстве, поэтому всегда совпадают с установленным APK).

## Шаги

1. **Проект.** <https://console.cloud.google.com/projectcreate> → создайте проект (например, `mailgram`).
2. **Gmail API.** APIs & Services → Library → найдите *Gmail API* → **Enable**.
3. **Экран согласия.** APIs & Services → OAuth consent screen:
   * User type: **External** → Create;
   * App name: `MailGram`, поддержка: ваш e-mail, developer contact: ваш e-mail → Save and continue;
   * Scopes: ничего не добавляйте вручную (приложение запросит `gmail.modify` само) → Save;
   * **Test users** → Add users → добавьте свой Gmail (и Gmail собеседника, если он тоже будет входить).
     Пока приложение в статусе *Testing*, войти могут только эти аккаунты, а при входе будет
     предупреждение «Google не проверил это приложение» → «Дополнительно» → «Перейти (небезопасно)».
     Это ожидаемо: `gmail.modify` — restricted scope, верификация Google нужна только для публикации в Play.
4. **OAuth client ID (вариант А — «один тап»).** Credentials → Create credentials → **OAuth client ID** →
   Application type: **Android**:
   * Name: `MailGram Android`
   * Package name: `com.mailgram.app`
   * SHA-1 certificate fingerprint: `BA:CF:61:D8:5B:A6:51:0E:27:6B:3C:8D:B8:79:43:0A:51:83:47:32`
   → Create → скопируйте **client ID**.
5. **Передайте client ID приложению — любым из двух способов:**
   * **А. Он вшит в сборку (вход в один тап, «из коробки»):** GitHub → репозиторий → Settings →
     Secrets and variables → Actions → *New repository secret* → имя `OAUTH_CLIENT_ID`, значение —
     ваш client ID → затем Actions → «MailGram — сборка APK» → Run workflow.
     Схема redirect подставится автоматически (`com.googleusercontent.apps.<id>:/oauth2redirect`).
   * **Б. Без пересборки:** откройте APK → «Настройка подключения» → вставьте client ID → выберите
     тип клиента **«Desktop + локальный порт»** и создайте в консоли ещё один OAuth-клиент типа
     **Desktop app** с redirect URI `http://127.0.0.1:7717/oauth2redirect`.
     Приложение поднимет локальный сервер только на адресе 127.0.0.1 и поймает код авторизации.

## Если вход не работает

| Симптом | Причина и решение |
|---|---|
| `Error 400: redirect_uri_mismatch` | В консоли указан не тот пакет/SHA-1 (например, вы подписали APK своим ключом) или выбран режим «локальный порт», а клиент создан как Android. Сверьте данные в «Настройка подключения» → скопируйте их кнопкой «Скопировать всё для настройки». |
| `Error 403: access_denied` / «доступ заблокирован» | Ваш аккаунт не добавлен в **Test users** экрана согласия. |
| `Error 401: invalid_client` | client ID введён с опечаткой (лишний пробел) или это ID от другого проекта. |
| Экран «Google не проверил это приложение» | Норма для restricted-скоупа в Testing: «Дополнительно» → «Перейти». |
| «нужно войти в аккаунт Google» при синхронизации | Истёк refresh-token (например, отозван в аккаунте Google или сменили пароль) → выйдите и войдите заново. |
| Письма не приходят | Проверьте, что Gmail API включён, а письма с темой `MailGram …` не попали в «Спам». |

## Почему это безопасно

* **PKCE (S256)** обязателен: перехваченный код авторизации нельзя обменять без `code_verifier`,
  который остаётся на устройстве.
* **`state`** проверяется при возврате редиректа — защита от подмены ответа.
* **Токены** хранятся только на устройстве и зашифрованы ключом Android Keystore (AES-256-GCM).
* При выходе токены **отзываются** на стороне Google (`/revoke`), а ключи устройства уничтожаются.
* Приложение запрашивает **`gmail.modify`** — чтение, отправка и разметка писем. Права на удаление
  писем у него нет; при желании ограничить ещё сильнее, можно заменить scope на `gmail.readonly` +
  отправку через отдельный клиент, но тогда нельзя будет снимать метку «непрочитано».
