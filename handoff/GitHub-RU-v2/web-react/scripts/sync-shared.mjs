// Копирует общее ядро студии (../shared-web) в src/.
// Так одна и та же логика (редактор, скачивание, инструменты, дизайн)
// используется и React-, и Vue-сборкой, а `npm run build` работает
// самодостаточно — и локально, и в GitHub Actions.
import { copyFileSync, existsSync, mkdirSync } from 'node:fs';
import { dirname, join, resolve } from 'node:path';
import { fileURLToPath } from 'node:url';

const here = dirname(fileURLToPath(import.meta.url));
const pkgRoot = resolve(here, '..');
const shared = resolve(pkgRoot, '..', 'shared-web');
const src = join(pkgRoot, 'src');

mkdirSync(src, { recursive: true });

for (const file of ['studio-core.js', 'studio-core.css']) {
  const from = join(shared, file);
  if (!existsSync(from)) {
    console.error(`[sync-shared] не найден общий файл ${from}`);
    process.exit(1);
  }
  copyFileSync(from, join(src, file));
  console.log(`[sync-shared] ${file} → src/${file}`);
}
