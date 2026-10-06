#!/usr/bin/env bash
# Публикует ошибки сборки как аннотации GitHub Actions.
# Аннотации доступны через REST API (/check-runs/{id}/annotations), поэтому
# диагностика работает даже там, где нельзя скачать лог целиком.
#
# Использование: tools/ci-annotate.sh <лог-файл> [лимит-строк]
set -uo pipefail

log="${1:?укажите файл лога}"
limit="${2:-30}"

if [ ! -s "$log" ]; then
  echo "::error::лог сборки пуст или не найден: $log"
  exit 0
fi

# самое полезное — сообщения компилятора, ошибки Gradle и задачи, на которых всё встало
grep -nE "(\.java|\.xml|\.cpp|\.h):[0-9]+(:|[[:space:]])|error:|ERROR|FAILURE:|Caused by:|Execution failed for task|What went wrong|Could not (resolve|find|create|determine)|Unsupported|Unknown property|не найден" "$log" \
  | grep -vE "^\s*$" \
  | head -n "$limit" \
  | while IFS= read -r line; do
      clean=$(printf '%s' "$line" | tr -d '\r' | cut -c1-800)
      echo "::error title=Ошибка сборки::$clean"
    done

echo "::notice title=Журнал::---- последние строки лога сборки ----"
tail -n 30 "$log" | tr -d '\r' | cut -c1-800 | while IFS= read -r line; do
  echo "::notice title=Журнал::$line"
done
