/*
 * Смоук-тест веб-ядра GitHub RU Studio (tools/studio-smoke/smoke.mjs).
 *
 * Запускается в CI перед сборкой APK и проверяет, что редактор, скачивание
 * файлов, инструменты, консоль и вкладка «Инфо» реально работают: ядро
 * монтируется в jsdom, нажимаются кнопки, вызовы нативного моста проверяются.
 *
 *   cd tools/studio-smoke && npm install && node smoke.mjs
 */
import { JSDOM } from 'jsdom';
import { fileURLToPath } from 'node:url';
import { dirname, resolve } from 'node:path';

const here = dirname(fileURLToPath(import.meta.url));
const CORE = resolve(here, '..', '..', 'handoff', 'GitHub-RU-v2', 'shared-web', 'studio-core.js');
const CORE_URL = 'file://' + CORE;

const dom = new JSDOM(`<!doctype html><html lang="ru" data-theme="dark"><head></head><body><div id="root"></div></body></html>`, {
  pretendToBeVisual: true,
  url: 'file:///android_asset/web/react/index.html',
});
global.window = dom.window;
global.document = dom.window.document;
Object.defineProperty(global, 'navigator', { value: dom.window.navigator, configurable: true });
global.FileReader = dom.window.FileReader;

const calls = [];
window.Studio = {
  deviceInfo: () => 'Android 14 (API 34) • arm64-v8a • Test',
  appInfo: () => JSON.stringify({
    versionName: '1.257.0-ru4-studio', versionCode: 928, package: 'com.github.rudroid',
    nodeReady: 'READY', nodeVersion: 'v24.20.0', theme: 'dark', downloadsFolder: 'Download/GitHub RU Studio',
  }),
  saveText: (name, text) => { calls.push(['saveText', name, text.length]); return 'ok:Download/GitHub RU Studio/' + name; },
  saveTextAs: (name, text) => { calls.push(['saveTextAs', name, text.length]); return 'ok:'; },
  saveBase64: () => 'ok:',
  downloadUrl: (url, name) => { calls.push(['downloadUrl', url, name]); return 'ok:скачивание запущено (#1) → Загрузки/GitHub RU Studio'; },
  openTextFile: () => { calls.push(['openTextFile']); return 'ok:'; },
  share: (name) => { calls.push(['share', name]); return 'ok:'; },
  listDownloads: () => JSON.stringify([
    { name: 'demo.js', size: 2048, date: 1760000000000, uri: 'content://downloads/1' },
    { name: 'README.md', size: 100, date: 1760000000000, uri: 'content://downloads/2' },
  ]),
  openDownloaded: () => 'ok:открываю',
  deleteDownloaded: () => 'ok:удалено',
  formattedDate: () => '06.10.2026 12:00',
  sha256: (t) => 'ok:' + 'a'.repeat(64),
  toast: (m) => calls.push(['toast', m]),
};

const { mountStudio } = await import(CORE_URL);

const root = document.getElementById('root');
const studio = mountStudio(root, { framework: 'React 19' });

const results = [];
const check = (name, cond) => { results.push([name, !!cond]); console.log((cond ? 'OK   ' : 'FAIL ') + name); };

check('каркас приложения', root.querySelector('.appbar'));
check('бренд', root.querySelector('.brand-title').textContent.includes('GitHub RU Studio'));
check('нижняя навигация: 5 вкладок', root.querySelectorAll('.tab').length === 5);
check('редактор: гуттер со строками', root.querySelectorAll('.gut-line').length > 5);
check('редактор: подсветка markdown', root.querySelector('.editor-hl code').innerHTML.includes('tk-'));
check('редактор: textarea со стартовым файлом', root.querySelector('#ta').value.includes('GitHub RU Studio'));
check('строка состояния', root.querySelector('#statusbar').textContent.includes('Стр'));
check('чип Node.js', root.querySelector('#chip-node').textContent.length > 0);

// клик по вкладке «Файлы»
const tabs = root.querySelectorAll('.tab');
tabs[1].dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
await new Promise((r) => setTimeout(r, 60));
check('вкладка «Файлы»: ссылка для скачивания', root.textContent.includes('Скачать по ссылке'));
check('вкладка «Файлы»: список скачанного', root.textContent.includes('demo.js'));

// скачивание по ссылке через мост
root.querySelector('#dl-url').value = 'https://example.com/a.zip';
root.querySelector('#dl-name').value = 'a.zip';
root.querySelector('#dl-go').dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
check('мост downloadUrl вызван', calls.some((c) => c[0] === 'downloadUrl'));

// инструменты
tabs[2].dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
await new Promise((r) => setTimeout(r, 60));
check('инструменты: SHA-256 карточка', root.textContent.includes('SHA-256'));
const toolCards = root.querySelectorAll('.tool');
check('инструменты: 6 карточек', toolCards.length === 6);
const buttons = toolCards[3].querySelectorAll('button[data-i]');
buttons[0].dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
check('инструменты: SHA-256 считает через мост', toolCards[3].querySelector('.tool-out').textContent.includes('aaaa'));
const jsonButtons = toolCards[0].querySelectorAll('button[data-i]');
jsonButtons[0].dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
check('инструменты: JSON форматируется', toolCards[0].querySelector('.tool-out').textContent.includes('\n'));

// консоль Node
tabs[3].dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
await new Promise((r) => setTimeout(r, 60));
check('вкладка Node.js: кнопка выполнения', !!root.querySelector('#node-run'));
check('вкладка Node.js: консоль', !!root.querySelector('#node-log'));

// о приложении
tabs[4].dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
await new Promise((r) => setTimeout(r, 60));
check('вкладка «Инфо»: версия из моста', root.textContent.includes('1.257.0-ru4-studio'));
check('вкладка «Инфо»: список возможностей', root.textContent.includes('Скачивание файлов'));

// редактор: сохранение файла
tabs[0].dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
await new Promise((r) => setTimeout(r, 60));
const saveBtn = Array.from(root.querySelectorAll('.toolbar .btn')).find((b) => b.textContent.includes('Скачать'));
saveBtn.dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
check('сохранение в «Загрузки» через мост', calls.some((c) => c[0] === 'saveText'));
check('тост о сохранении', root.querySelector('.toasts').textContent.includes('Сохранено'));

// открытие файла из нативного SAF-диалога
window.StudioEditor.onFileOpened('imported.py', 'print("hi")\n');
await new Promise((r) => setTimeout(r, 60));
check('открытие файла из Android (SAF)', root.textContent.includes('imported.py'));

// минификатор в редакторе
const minBtn = Array.from(root.querySelectorAll('.toolbar .btn')).find((b) => b.textContent.includes('Минифицировать'));
minBtn.dispatchEvent(new dom.window.MouseEvent('click', { bubbles: true }));
check('минификация меняет текст файла', root.querySelector('#ta').value.length < 4000 && root.querySelector('#ta').value.length > 0);

studio.destroy();
const failed = results.filter(([, ok]) => !ok);
console.log(`\nИТОГО: ${results.length - failed.length}/${results.length} проверок пройдено`);
process.exit(failed.length ? 1 : 0);
