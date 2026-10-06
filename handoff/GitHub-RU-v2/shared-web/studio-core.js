/*
 * GitHub RU Studio — общее ядро интерфейса (React- и Vue-сборки используют один
 * и тот же код, поэтому возможности и дизайн совпадают).
 *
 * Что внутри:
 *   1. Редактор файлов: нумерация строк, подсветка синтаксиса, поиск/замена,
 *      автоотступы, вставка парных символов, форматирование, минификация.
 *   2. Скачивание файлов: ссылка (DownloadManager), текст в «Загрузки»,
 *      Base64/картинки, «Сохранить как» (SAF), «Поделиться», список скачанного.
 *   3. Инструменты: JSON, Base64, URL, SHA-256, регистр, статистика текста.
 *   4. Консоль встроенного Node.js (офлайн) — если движок есть в сборке.
 *   5. Оформление: светлая/тёмная тема, чипсы состояния, карточки, тосты.
 *
 * Никаких внешних зависимостей: только стандартный DOM + мост window.Studio
 * (нативный Android-мост) и локальный HTTP Node.js (127.0.0.1).
 */

const VERSION = '1.257.0-ru4-studio (928)';

// --------------------------------------------------------------------------
// Утилиты
// --------------------------------------------------------------------------

export function escapeHtml(text) {
  return String(text)
    .replace(/&/g, '&amp;')
    .replace(/</g, '&lt;')
    .replace(/>/g, '&gt;');
}

function el(tag, className, text) {
  const node = document.createElement(tag);
  if (className) node.className = className;
  if (text !== undefined && text !== null) node.textContent = text;
  return node;
}

function bridge() {
  return typeof window !== 'undefined' && window.Studio ? window.Studio : null;
}

function bridgeCall(method, ...args) {
  const b = bridge();
  if (!b || typeof b[method] !== 'function') return null;
  try {
    return b[method](...args);
  } catch (e) {
    return 'err:' + (e && e.message ? e.message : e);
  }
}

function isOk(result) {
  return typeof result === 'string' && result.indexOf('ok:') === 0;
}

/** Кадровый планировщик: в WebView всегда есть, в тестах — подстраховка. */
function raf(fn) {
  if (typeof window !== 'undefined' && typeof window.requestAnimationFrame === 'function') {
    return window.requestAnimationFrame(fn);
  }
  return setTimeout(fn, 16);
}

function store(key, value) {
  try {
    if (value === undefined) {
      const raw = window.localStorage.getItem('studio.' + key);
      return raw === null ? undefined : JSON.parse(raw);
    }
    window.localStorage.setItem('studio.' + key, JSON.stringify(value));
  } catch (e) {
    /* приватный режим — просто не сохраняем */
  }
  return undefined;
}

function nodePort() {
  return window.__NODE_PORT__ || 0;
}

async function nodeFetch(path, options, timeoutMs = 20000) {
  const port = nodePort();
  if (!port) throw new Error('встроенный Node.js ещё не готов');
  const controller = typeof AbortController !== 'undefined' ? new AbortController() : null;
  const timer = controller ? setTimeout(() => controller.abort(), timeoutMs) : null;
  try {
    const res = await fetch(`http://127.0.0.1:${port}${path}`, Object.assign({
      signal: controller ? controller.signal : undefined,
    }, options || {}));
    return await res.json();
  } finally {
    if (timer) clearTimeout(timer);
  }
}

function formatSize(bytes) {
  if (!bytes && bytes !== 0) return '—';
  const units = ['Б', 'КБ', 'МБ', 'ГБ'];
  let value = bytes;
  let unit = 0;
  while (value >= 1024 && unit < units.length - 1) {
    value /= 1024;
    unit += 1;
  }
  return `${value < 10 && unit > 0 ? value.toFixed(1) : Math.round(value)} ${units[unit]}`;
}

function guessLang(name) {
  const n = String(name || '').toLowerCase();
  if (n.endsWith('.json')) return 'json';
  if (n.endsWith('.js') || n.endsWith('.mjs') || n.endsWith('.jsx') || n.endsWith('.ts') || n.endsWith('.tsx')) return 'js';
  if (n.endsWith('.html') || n.endsWith('.htm') || n.endsWith('.xml') || n.endsWith('.svg')) return 'html';
  if (n.endsWith('.css')) return 'css';
  if (n.endsWith('.md') || n.endsWith('.markdown')) return 'md';
  return 'text';
}

// --------------------------------------------------------------------------
// Подсветка синтаксиса (лёгкая, без зависимостей)
// --------------------------------------------------------------------------

const RULES = {
  js: [
    { cls: 'c', re: /\/\*[\s\S]*?\*\/|\/\/[^\n]*/ },
    { cls: 's', re: /`(?:\\[\s\S]|[^`\\])*`|"(?:\\[\s\S]|[^"\\\n])*"|'(?:\\[\s\S]|[^'\\\n])*'/ },
    { cls: 'k', re: /\b(?:const|let|var|function|return|if|else|for|while|do|switch|case|break|continue|new|class|extends|super|this|try|catch|finally|throw|async|await|yield|import|export|from|default|typeof|instanceof|in|of|null|undefined|true|false|delete|void|static)\b/ },
    { cls: 'f', re: /\b[A-Za-z_$][\w$]*(?=\s*\()/ },
    { cls: 'n', re: /\b0[xX][0-9a-fA-F]+\b|\b\d[\d_]*(?:\.\d+)?(?:[eE][+-]?\d+)?\b/ },
  ],
  json: [
    { cls: 'a', re: /"(?:\\.|[^"\\])*"(?=\s*:)/ },
    { cls: 's', re: /"(?:\\.|[^"\\])*"/ },
    { cls: 'k', re: /\b(?:true|false|null)\b/ },
    { cls: 'n', re: /-?\b\d+(?:\.\d+)?(?:[eE][+-]?\d+)?\b/ },
  ],
  html: [
    { cls: 'c', re: /<!--[\s\S]*?-->/ },
    { cls: 's', re: /"[^"\n]*"|'[^'\n]*'/ },
    { cls: 'k', re: /<\/?[a-zA-Z][\w:-]*|\/?>/ },
    { cls: 'a', re: /\b[a-zA-Z-]+(?==)/ },
  ],
  css: [
    { cls: 'c', re: /\/\*[\s\S]*?\*\// },
    { cls: 's', re: /"[^"\n]*"|'[^'\n]*'/ },
    { cls: 'k', re: /@[\w-]+|#[0-9a-fA-F]{3,8}\b/ },
    { cls: 'a', re: /[a-zA-Z-]+(?=\s*:)/ },
    { cls: 'n', re: /\b\d+(?:\.\d+)?(?:px|em|rem|%|vh|vw|vmin|s|ms|deg|fr)?\b/ },
  ],
  md: [
    { cls: 'k', re: /^#{1,6} [^\n]*/m },
    { cls: 's', re: /```[\s\S]*?```|`[^`\n]*`/ },
    { cls: 'a', re: /\[[^\]\n]*\]\([^)\n]*\)/ },
    { cls: 'f', re: /\*\*[^*\n]+\*\*|__[^_\n]+__/ },
    { cls: 'c', re: /^>[^\n]*/m },
  ],
  text: [],
};

const HIGHLIGHT_LIMIT = 60000;

/**
 * Подсветка кода: возвращает HTML со <span class="tk-*">.
 * Алгоритм — «самое раннее совпадение» среди правил языка: строки и комментарии
 * начинаются раньше ключевых слов внутри них, поэтому разметка не путается.
 */
export function highlight(code, lang) {
  const escaped = escapeHtml(code);
  const rules = RULES[lang] || [];
  if (!rules.length || code.length > HIGHLIGHT_LIMIT) {
    return escaped;
  }
  const compiled = rules.map((rule) => ({ cls: rule.cls, re: new RegExp(rule.re.source, rule.re.flags.includes('g') ? rule.re.flags : rule.re.flags + 'g') }));
  let out = '';
  let pos = 0;
  while (pos < escaped.length) {
    let best = null;
    for (const rule of compiled) {
      rule.re.lastIndex = pos;
      const m = rule.re.exec(escaped);
      if (!m) continue;
      if (!best || m.index < best.index || (m.index === best.index && m[0].length > best.text.length)) {
        best = { index: m.index, text: m[0], cls: rule.cls };
      }
    }
    if (!best) {
      out += escaped.slice(pos);
      break;
    }
    out += escaped.slice(pos, best.index);
    out += `<span class="tk-${best.cls}">${best.text}</span>`;
    pos = best.index + best.text.length;
  }
  return out;
}

// --------------------------------------------------------------------------
// Минификаторы и инструменты (работают без Node.js)
// --------------------------------------------------------------------------

function minifyJs(code) {
  let out = '';
  let i = 0;
  let quote = null;
  let line = false;
  let block = false;
  while (i < code.length) {
    const c = code[i];
    const c2 = code[i + 1];
    if (line) {
      if (c === '\n') {
        line = false;
        out += '\n';
      }
      i += 1;
      continue;
    }
    if (block) {
      if (c === '*' && c2 === '/') {
        block = false;
        i += 2;
        continue;
      }
      i += 1;
      continue;
    }
    if (quote) {
      out += c;
      if (c === '\\') {
        out += code[i + 1] || '';
        i += 2;
        continue;
      }
      if (c === quote) quote = null;
      i += 1;
      continue;
    }
    if (c === '/' && c2 === '/') {
      line = true;
      i += 2;
      continue;
    }
    if (c === '/' && c2 === '*') {
      block = true;
      i += 2;
      continue;
    }
    if (c === '"' || c === "'" || c === '`') {
      quote = c;
      out += c;
      i += 1;
      continue;
    }
    out += c;
    i += 1;
  }
  return out
    .split('\n')
    .map((l) => l.replace(/[ \t]+$/g, '').replace(/^[ \t]+/g, ''))
    .filter((l) => l.length > 0)
    .join('\n');
}

function minifyCss(code) {
  return code
    .replace(/\/\*[\s\S]*?\*\//g, '')
    .replace(/\s*([{};:,>])\s*/g, '$1')
    .replace(/;}/g, '}')
    .replace(/\s+/g, ' ')
    .replace(/\s*([{};:,>])\s*/g, '$1')
    .trim();
}

function minifyHtml(code) {
  return code
    .replace(/<!--(?!\[if)[\s\S]*?-->/g, '')
    .replace(/>\s+</g, '><')
    .replace(/\s{2,}/g, ' ')
    .trim();
}

function minify(code, lang) {
  if (lang === 'json') return JSON.stringify(JSON.parse(code));
  if (lang === 'css') return minifyCss(code);
  if (lang === 'html') return minifyHtml(code);
  return minifyJs(code);
}

function base64Encode(text) {
  const bytes = new TextEncoder().encode(text);
  let binary = '';
  bytes.forEach((b) => {
    binary += String.fromCharCode(b);
  });
  return btoa(binary);
}

function base64Decode(text) {
  const binary = atob(text.replace(/\s+/g, ''));
  const bytes = Uint8Array.from(binary, (c) => c.charCodeAt(0));
  return new TextDecoder().decode(bytes);
}

// --------------------------------------------------------------------------
// Ядро интерфейса
// --------------------------------------------------------------------------

const STARTER_FILES = () => ([
  {
    name: 'README.md',
    lang: 'md',
    text: [
      '# GitHub RU Studio',
      '',
      'Полностью **офлайн**-студия на телефоне: редактор файлов, скачивание,',
      'инструменты и встроенный Node.js 24 (в full-сборке).',
      '',
      '## Что можно делать прямо сейчас',
      '',
      '1. **Открыть файл с устройства** — кнопка «Открыть» (системный диалог).',
      '2. **Сохранить в «Загрузки»** — кнопка «Скачать»: файл появится в',
      '   `Загрузки/GitHub RU Studio`.',
      '3. **Скачать по ссылке** — вкладка «Файлы» → «Скачать по ссылке».',
      '4. **Поделиться** текстом файла — кнопка «Поделиться» в меню «⋯».',
      '5. **Запустить JS** — вкладка «Node.js» или кнопка «▶ Запустить».',
      '',
      '## Горячие клавиши',
      '',
      '- `Ctrl+S` — сохранить в «Загрузки»',
      '- `Ctrl+O` — открыть файл',
      '- `Ctrl+F` — поиск и замена',
      '- `Ctrl+Enter` — запустить код в Node.js',
      '- `Tab` / `Shift+Tab` — отступ / снятие отступа',
      '',
      '> Всё работает без интернета: страницы лежат в APK, движок слушает 127.0.0.1.',
    ].join('\n'),
  },
  {
    name: 'demo.js',
    lang: 'js',
    text: [
      '// Нажмите «▶ Запустить» — код выполнится во встроенном Node.js (офлайн).',
      'const facts = {',
      '  node: process.version,',
      '  v8: process.versions.v8,',
      '  platform: `${process.platform}/${process.arch}`,',
      '};',
      '',
      'console.log("Движок:", JSON.stringify(facts));',
      'console.log("Свободно, МБ:", Math.round(process.memoryUsage().rss / 1048576));',
      '',
      'facts;',
    ].join('\n'),
  },
]);

export function mountStudio(root, options = {}) {
  const framework = options.framework || 'JS';
  const state = {
    view: store('view') || 'editor',
    theme: store('theme') || 'system',
    fontSize: store('fontSize') || 14,
    wrap: store('wrap') === true,
    files: [],
    activeId: 0,
    nextId: 1,
    node: { ready: false, info: null, logs: [], busy: false },
    downloads: [],
    downloadsLoaded: false,
  };

  const initial = store('files');
  if (Array.isArray(initial) && initial.length) {
    state.files = initial.map((f) => ({
      id: state.nextId++,
      name: f.name || 'file.txt',
      lang: f.lang || guessLang(f.name),
      text: f.text || '',
      dirty: false,
    }));
    state.activeId = state.files[0].id;
  } else {
    STARTER_FILES().forEach((f) => {
      state.files.push({ id: state.nextId++, name: f.name, lang: f.lang, text: f.text, dirty: false });
    });
    state.activeId = state.files[0].id;
  }

  const active = () => state.files.find((f) => f.id === state.activeId) || state.files[0];

  function persist() {
    store('files', state.files.slice(0, 12).map((f) => ({ name: f.name, lang: f.lang, text: f.text })));
    store('view', state.view);
    store('theme', state.theme);
    store('fontSize', state.fontSize);
    store('wrap', state.wrap);
  }

  // ---------------------------------------------------------------- каркас

  root.className = 'studio-root';
  root.innerHTML = `
    <div class="app">
      <header class="appbar">
        <div class="brand">
          <div class="brand-title">GitHub RU Studio</div>
          <div class="brand-sub">
            <span class="chip chip-fw">${escapeHtml(framework)}</span>
            <span class="chip" id="chip-node">Node.js: …</span>
          </div>
        </div>
        <div class="appbar-actions">
          <button class="icon-btn" id="btn-theme" title="Светлая / тёмная тема">◐</button>
          <button class="icon-btn" id="btn-about" title="О приложении">ℹ</button>
        </div>
      </header>

      <main class="content" id="content"></main>

      <nav class="tabbar" id="tabbar"></nav>
    </div>
    <div class="toasts" id="toasts"></div>
  `;

  const contentEl = root.querySelector('#content');
  const tabbarEl = root.querySelector('#tabbar');
  const chipNode = root.querySelector('#chip-node');
  const toastsEl = root.querySelector('#toasts');

  const VIEWS = [
    { id: 'editor', icon: '📝', label: 'Редактор' },
    { id: 'files', icon: '📥', label: 'Файлы' },
    { id: 'tools', icon: '🧰', label: 'Инструменты' },
    { id: 'node', icon: '🟢', label: 'Node.js' },
    { id: 'about', icon: 'ℹ️', label: 'Инфо' },
  ];

  function toast(message, kind) {
    if (!message) return;
    const item = el('div', 'toast' + (kind ? ' toast-' + kind : ''), message);
    toastsEl.appendChild(item);
    setTimeout(() => {
      item.classList.add('toast-out');
      setTimeout(() => item.remove(), 260);
    }, 2600);
  }

  function applyTheme() {
    const prefersDark = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches;
    const native = window.__STUDIO_THEME__;
    const effective = state.theme === 'system' ? (native || (prefersDark ? 'dark' : 'light')) : state.theme;
    document.documentElement.setAttribute('data-theme', effective);
    document.documentElement.style.setProperty('--fs', state.fontSize + 'px');
    persist();
  }

  function renderTabbar() {
    tabbarEl.innerHTML = '';
    VIEWS.forEach((view) => {
      const item = el('button', 'tab' + (state.view === view.id ? ' tab-active' : ''));
      item.innerHTML = `<span class="tab-icon">${view.icon}</span><span class="tab-label">${view.label}</span>`;
      item.addEventListener('click', () => {
        state.view = view.id;
        render();
      });
      tabbarEl.appendChild(item);
    });
  }

  function setChip(text, cls) {
    chipNode.textContent = text;
    chipNode.className = 'chip' + (cls ? ' ' + cls : '');
  }

  function render() {
    renderTabbar();
    applyTheme();
    contentEl.innerHTML = '';
    const view = VIEWS.find((v) => v.id === state.view) || VIEWS[0];
    const viewEl = VIEW_RENDERERS[view.id]();
    state.viewRoot = viewEl;
    contentEl.appendChild(viewEl);
    persist();
  }

  // ------------------------------------------------------------- РЕДАКТОР

  function renderEditorView() {
    const wrapEl = el('div', 'stack');
    state.viewRoot = wrapEl; // текущая вкладка: по ней ищем элементы (статус, поиск, вывод)
    const file = active();

    // Панель открытых файлов
    const tabsRow = el('div', 'filetabs');
    state.files.forEach((f) => {
      const tab = el('div', 'filetab' + (f.id === state.activeId ? ' filetab-active' : ''));
      tab.innerHTML = `<span class="filetab-name">${escapeHtml(f.name)}${f.dirty ? ' •' : ''}</span>`;
      const close = el('button', 'filetab-close', '×');
      close.addEventListener('click', (event) => {
        event.stopPropagation();
        closeFile(f.id);
      });
      tab.appendChild(close);
      tab.addEventListener('click', () => {
        state.activeId = f.id;
        render();
      });
      tabsRow.appendChild(tab);
    });
    const addTab = el('button', 'filetab filetab-new', '+');
    addTab.title = 'Новый файл';
    addTab.addEventListener('click', () => {
      const name = prompt('Имя нового файла', 'notes.txt') || 'notes.txt';
      const f = { id: state.nextId++, name, lang: guessLang(name), text: '', dirty: false };
      state.files.push(f);
      state.activeId = f.id;
      render();
    });
    tabsRow.appendChild(addTab);
    wrapEl.appendChild(tabsRow);

    // Инструменты редактора
    const bar = el('div', 'toolbar');
    const buttons = [
      ['📂 Открыть', 'открыть файл с устройства', () => openFromDevice()],
      ['⬇ Скачать', 'сохранить в «Загрузки»', () => saveActive()],
      ['▶ Запустить', 'выполнить в Node.js (Ctrl+Enter)', () => runActive()],
      ['🔍 Поиск', 'найти и заменить (Ctrl+F)', () => toggleFind()],
      ['✨ Формат', 'JSON / отступы', () => formatActive()],
      ['🗜 Минифицировать', 'убрать лишнее (JS/CSS/HTML/JSON)', () => minifyActive()],
      ['⋯', 'ещё действия', (event) => openMenu(event)],
    ];
    buttons.forEach(([label, title, handler]) => {
      const b = el('button', 'btn btn-quiet', label);
      b.title = title;
      b.addEventListener('click', handler);
      bar.appendChild(b);
    });
    wrapEl.appendChild(bar);

    // Поиск / замена
    const findBar = el('div', 'findbar hidden');
    findBar.id = 'findbar';
    findBar.innerHTML = `
      <input class="input" id="find-what" placeholder="Найти" />
      <input class="input" id="find-with" placeholder="Заменить на" />
      <span class="muted small" id="find-count">0</span>
      <button class="btn btn-quiet" id="find-prev">↑</button>
      <button class="btn btn-quiet" id="find-next">↓</button>
      <button class="btn btn-quiet" id="find-replace">Заменить</button>
      <button class="btn btn-quiet" id="find-all">Все</button>
    `;
    wrapEl.appendChild(findBar);

    // Сам редактор
    const editorBox = el('div', 'editor');
    editorBox.innerHTML = `
      <div class="editor-gutter" id="gutter"></div>
      <div class="editor-code">
        <pre class="editor-hl" id="hl" aria-hidden="true"><code></code></pre>
        <textarea class="editor-ta" id="ta" spellcheck="false" autocapitalize="off"
                  autocomplete="off" autocorrect="off" wrap="off"></textarea>
      </div>
    `;
    wrapEl.appendChild(editorBox);

    // Строка состояния
    const status = el('div', 'statusbar');
    status.id = 'statusbar';
    wrapEl.appendChild(status);

    // Панель вывода (запуск/ошибки)
    const output = el('div', 'output hidden');
    output.id = 'output';
    wrapEl.appendChild(output);

    // Редактор подключаем синхронно: никаких «полуготовых» кадров,
    // где textarea ещё пустая, а гуттер без номеров строк.
    wireEditor(wrapEl);
    updateStatus();
    if (state.pendingFocusFind) {
      state.pendingFocusFind = false;
      toggleFind(true);
    }

    return wrapEl;
  }

  function wireEditor(scope) {
    const ta = scope.querySelector('#ta');
    const hl = scope.querySelector('#hl code');
    const gutter = scope.querySelector('#gutter');
    const status = scope.querySelector('#statusbar');
    if (!ta) return;

    state.editor = { ta, hl, gutter, status };

    const file = active();
    ta.value = file.text;
    ta.wrap = state.wrap ? 'soft' : 'off';

    ta.addEventListener('input', () => {
      file.text = ta.value;
      file.dirty = true;
      file.lang = file.lang === 'text' ? guessLang(file.name) : file.lang;
      updateGutter();
      scheduleHighlight();
      updateStatus();
      updateFileTabLabel(file);
    });

    ta.addEventListener('scroll', () => {
      if (state.editor.hl) {
        state.editor.hl.parentElement.scrollTop = ta.scrollTop;
        state.editor.hl.parentElement.scrollLeft = ta.scrollLeft;
      }
      if (state.editor.gutter) {
        state.editor.gutter.scrollTop = ta.scrollTop;
      }
    });

    ta.addEventListener('click', updateStatus);
    ta.addEventListener('keyup', updateStatus);

    ta.addEventListener('keydown', (event) => {
      const ctrl = event.ctrlKey || event.metaKey;
      if (ctrl && event.key.toLowerCase() === 's') {
        event.preventDefault();
        saveActive();
        return;
      }
      if (ctrl && event.key.toLowerCase() === 'o') {
        event.preventDefault();
        openFromDevice();
        return;
      }
      if (ctrl && event.key.toLowerCase() === 'f') {
        event.preventDefault();
        toggleFind(true);
        return;
      }
      if (ctrl && event.key === 'Enter') {
        event.preventDefault();
        runActive();
        return;
      }
      if (event.key === 'Tab') {
        event.preventDefault();
        if (event.shiftKey) {
          unindent(ta);
        } else {
          insertText(ta, ' '.repeat(state.tabSize || 2));
        }
        file.text = ta.value;
        file.dirty = true;
        scheduleHighlight();
        updateGutter();
        return;
      }
      if (event.key === 'Enter') {
        const before = ta.value.slice(0, ta.selectionStart);
        const lineStart = before.lastIndexOf('\n') + 1;
        const indentMatch = before.slice(lineStart).match(/^[ \t]*/);
        let indent = indentMatch ? indentMatch[0] : '';
        const lastChar = before.trimEnd().slice(-1);
        if ('{[('.includes(lastChar)) {
          indent += ' '.repeat(state.tabSize || 2);
        }
        if (indent) {
          event.preventDefault();
          insertText(ta, '\n' + indent);
          file.text = ta.value;
          scheduleHighlight();
          updateGutter();
        }
        return;
      }
      const pairs = { '(': ')', '[': ']', '{': '}', '"': '"', "'": "'", '`': '`' };
      if (pairs[event.key]) {
        const start = ta.selectionStart;
        const end = ta.selectionEnd;
        const selected = ta.value.slice(start, end);
        event.preventDefault();
        const close = pairs[event.key];
        insertText(ta, event.key + selected + close, start + 1, start + 1 + selected.length);
        file.text = ta.value;
        scheduleHighlight();
        return;
      }
    });

    updateHighlight();

    ta.addEventListener('paste', () => setTimeout(() => {
      file.text = ta.value;
      file.dirty = true;
      updateGutter();
      scheduleHighlight();
    }, 0));

    updateGutter();

    function updateFileTabLabel(f) {
      const tabs = scope.querySelectorAll('.filetab');
      state.files.forEach((item, index) => {
        const tab = tabs[index];
        if (tab) {
          tab.querySelector('.filetab-name').textContent = item.name + (item.dirty ? ' •' : '');
        }
      });
    }

    // Наружу — только то, что нужно после перерисовки.
    state.editorApi = { updateGutter, updateHighlight, scheduleHighlight };

    function scheduleHighlight() {
      if (state.hlTimer) clearTimeout(state.hlTimer);
      state.hlTimer = setTimeout(updateHighlight, 90);
    }

    function updateHighlight() {
      const ta2 = state.editor.ta;
      const hl2 = state.editor.hl;
      if (!ta2 || !hl2) return;
      hl2.innerHTML = highlight(ta2.value, active().lang) + '\n';
    }

    function updateGutter() {
      const ta2 = state.editor.ta;
      const gutterEl = state.editor.gutter;
      if (!ta2 || !gutterEl) return;
      const lines = ta2.value.split('\n').length;
      if (gutterEl.childElementCount !== lines) {
        const frag = document.createDocumentFragment();
        for (let i = 1; i <= lines; i += 1) {
          const line = el('div', 'gut-line', String(i));
          frag.appendChild(line);
        }
        gutterEl.innerHTML = '';
        gutterEl.appendChild(frag);
      }
      const caret = ta2.value.slice(0, ta2.selectionStart).split('\n').length;
      Array.from(gutterEl.children).forEach((node, index) => {
        node.classList.toggle('gut-active', index + 1 === caret);
      });
    }

    // --- поиск и замена
    const findInput = scope.querySelector('#find-what');
    const replaceInput = scope.querySelector('#find-with');
    const findCount = scope.querySelector('#find-count');

    function updateFindCount() {
      const needle = findInput.value;
      const total = needle ? countOccurrences(ta.value, needle) : 0;
      findCount.textContent = total ? `${total} совпад.` : 'нет';
    }
    findInput.addEventListener('input', updateFindCount);
    scope.querySelector('#find-next').addEventListener('click', () => findStep(1));
    scope.querySelector('#find-prev').addEventListener('click', () => findStep(-1));
    scope.querySelector('#find-replace').addEventListener('click', () => {
      const needle = findInput.value;
      if (!needle) return;
      const start = ta.selectionStart;
      const end = ta.selectionEnd;
      if (ta.value.slice(start, end) === needle) {
        insertText(ta, replaceInput.value);
      } else {
        findStep(1);
        return;
      }
      file.text = ta.value;
      file.dirty = true;
      updateHighlight();
      updateFindCount();
    });
    scope.querySelector('#find-all').addEventListener('click', () => {
      const needle = findInput.value;
      if (!needle) return;
      const replacements = countOccurrences(ta.value, needle);
      ta.value = ta.value.split(needle).join(replaceInput.value);
      file.text = ta.value;
      file.dirty = true;
      updateHighlight();
      updateGutter();
      updateFindCount();
      toast(`Заменено вхождений: ${replacements}`);
    });

    function findStep(direction) {
      const needle = findInput.value;
      if (!needle) return;
      const from = direction > 0 ? ta.selectionEnd : ta.selectionStart - needle.length - 1;
      let index = direction > 0
        ? ta.value.indexOf(needle, Math.max(0, from))
        : ta.value.lastIndexOf(needle, Math.max(0, from));
      if (index < 0) {
        index = direction > 0 ? ta.value.indexOf(needle) : ta.value.lastIndexOf(needle);
      }
      if (index < 0) {
        toast('Не найдено');
        return;
      }
      ta.focus();
      ta.setSelectionRange(index, index + needle.length);
      const line = ta.value.slice(0, index).split('\n').length;
      const lineHeight = parseFloat(getComputedStyle(ta).lineHeight) || 20;
      ta.scrollTop = Math.max(0, (line - 4) * lineHeight);
      updateStatus();
    }
    updateFindCount();
  }

  function toggleFind(force) {
    const bar = (state.viewRoot || contentEl).querySelector('#findbar');
    if (!bar) return;
    const show = force === undefined ? bar.classList.contains('hidden') : force;
    bar.classList.toggle('hidden', !show);
    if (show) {
      const input = bar.querySelector('#find-what');
      if (input) input.focus();
    }
  }

  function countOccurrences(text, needle) {
    if (!needle) return 0;
    let count = 0;
    let index = 0;
    while (true) {
      index = text.indexOf(needle, index);
      if (index < 0) break;
      count += 1;
      index += needle.length;
    }
    return count;
  }

  function insertText(ta, text, selStart, selEnd) {
    const start = ta.selectionStart;
    const end = ta.selectionEnd;
    ta.setRangeText(text, start, end, 'end');
    if (selStart !== undefined) {
      ta.setSelectionRange(selStart, selEnd === undefined ? selStart : selEnd);
    }
    ta.dispatchEvent(new Event('input'));
  }

  function unindent(ta) {
    const start = ta.selectionStart;
    const endLine = ta.value.lastIndexOf('\n', ta.selectionEnd - 1) + 1;
    const from = ta.value.lastIndexOf('\n', start - 1) + 1;
    const block = ta.value.slice(from, endLine || ta.value.length);
    const dedented = block.split('\n').map((l) => l.replace(/^ {1,2}|^\t/, '')).join('\n');
    ta.setRangeText(dedented, from, endLine || ta.value.length, 'end');
    ta.dispatchEvent(new Event('input'));
  }

  function updateStatus() {
    const ta = state.editor && state.editor.ta;
    const status = (state.viewRoot || contentEl).querySelector('#statusbar');
    if (!ta || !status) return;
    const upto = ta.value.slice(0, ta.selectionStart);
    const line = upto.split('\n').length;
    const col = upto.length - upto.lastIndexOf('\n');
    const bytes = new TextEncoder().encode(ta.value).length;
    const file = active();
    status.innerHTML = `
      <span>Стр ${line}:${col}</span>
      <span>Строк: ${ta.value.split('\n').length}</span>
      <span>Символов: ${ta.value.length}</span>
      <span>${formatSize(bytes)}</span>
      <span class="status-lang">${escapeHtml(file.lang.toUpperCase())}</span>
      <span class="status-name">${escapeHtml(file.name)}</span>
      <span class="status-wrap">${state.wrap ? 'перенос' : 'без переноса'}</span>
    `;
  }

  function closeFile(id) {
    const index = state.files.findIndex((f) => f.id === id);
    if (index < 0) return;
    if (state.files.length === 1) {
      toast('Последний файл нельзя закрыть');
      return;
    }
    state.files.splice(index, 1);
    if (state.activeId === id) {
      state.activeId = state.files[Math.max(0, index - 1)].id;
    }
    render();
  }

  // -------------------------------------------------------- действия файлов

  function currentText() {
    const file = active();
    const ta = state.editor && state.editor.ta;
    if (ta) file.text = ta.value;
    return file.text;
  }

  function saveActive() {
    const file = active();
    const text = currentText();
    const result = bridgeCall('saveText', file.name, text);
    if (result === null) {
      browserDownload(file.name, text);
      return;
    }
    if (isOk(result)) {
      file.dirty = false;
      toast('Сохранено в «Загрузки/GitHub RU Studio»: ' + file.name, 'ok');
      state.downloadsLoaded = false;
    } else {
      toast(String(result).replace(/^err:/, 'Не удалось: '));
    }
  }

  function saveActiveAs() {
    const file = active();
    const result = bridgeCall('saveTextAs', file.name, currentText());
    if (result === null) {
      browserDownload(file.name, currentText());
    }
  }

  function shareActive() {
    const file = active();
    const result = bridgeCall('share', file.name, currentText());
    if (result === null) {
      navigator.clipboard &&
        navigator.clipboard.writeText(currentText()).then(() => toast('Скопировано в буфер'));
    }
  }

  function openFromDevice() {
    const result = bridgeCall('openTextFile');
    if (result === null) {
      toast('Открытие файлов доступно в приложении Android');
    }
  }

  function runActive() {
    const file = active();
    const text = currentText();
    const output = (state.viewRoot || contentEl).querySelector('#output');
    if (!output) return;
    output.classList.remove('hidden');
    output.innerHTML = '<div class="output-head">Запуск в Node.js…</div>';
    nodeFetch('/run', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ code: text, name: file.name }),
    }).then((data) => {
      const lines = [];
      lines.push(`<div class="output-head">${data.ok ? '✅ Готово' : '❌ Ошибка'} • ${data.ms} мс</div>`);
      (data.logs || []).forEach((line) => lines.push(`<pre class="output-line">${escapeHtml(line)}</pre>`));
      if (data.result !== undefined && data.result !== 'undefined') {
        lines.push(`<pre class="output-line output-result">= ${escapeHtml(String(data.result))}</pre>`);
      }
      if (data.error) {
        lines.push(`<pre class="output-line output-error">${escapeHtml(String(data.error))}</pre>`);
      }
      output.innerHTML = lines.join('');
    }).catch((e) => {
      output.innerHTML = `<div class="output-head">❌ Node.js недоступен</div>
        <pre class="output-line output-error">${escapeHtml(String(e.message || e))}</pre>
        <div class="muted small">Это LITE-сборка без libnode.so — редактор, скачивание и
        инструменты работают, а выполнение кода требует FULL-сборки.</div>`;
    });
  }

  function formatActive() {
    const file = active();
    const text = currentText();
    try {
      if (file.lang === 'json' || /^\s*[{[]/.test(text)) {
        const formatted = JSON.stringify(JSON.parse(text), null, 2);
        setEditorText(formatted);
        file.lang = 'json';
        toast('JSON отформатирован', 'ok');
        return;
      }
      if (file.lang === 'css' || file.lang === 'html') {
        setEditorText(text.replace(/></g, '>\n<'));
        toast('Разметка разбита по строкам', 'ok');
        return;
      }
      setEditorText(text.split('\n').map((l) => l.replace(/\t/g, ' '.repeat(state.tabSize || 2))).join('\n'));
      toast('Табы заменены пробелами', 'ok');
    } catch (e) {
      toast('Не удалось отформатировать: ' + e.message);
    }
  }

  function minifyActive() {
    const file = active();
    const before = currentText();
    try {
      const after = minify(before, file.lang);
      setEditorText(after);
      const saved = before.length - after.length;
      const percent = before.length ? Math.round((saved / before.length) * 100) : 0;
      toast(`Минифицировано: −${formatSize(saved)} (${percent}%)`, 'ok');
    } catch (e) {
      toast('Минификация не удалась: ' + e.message);
    }
  }

  function setEditorText(text) {
    const file = active();
    file.text = text;
    file.dirty = true;
    const ta = state.editor && state.editor.ta;
    if (ta) {
      const scroll = ta.scrollTop;
      ta.value = text;
      ta.scrollTop = scroll;
      ta.dispatchEvent(new Event('input'));
    }
  }

  function browserDownload(name, text) {
    const blob = new Blob([text], { type: 'text/plain;charset=utf-8' });
    const url = URL.createObjectURL(blob);
    const a = document.createElement('a');
    a.href = url;
    a.download = name;
    document.body.appendChild(a);
    a.click();
    a.remove();
    setTimeout(() => URL.revokeObjectURL(url), 4000);
    toast('Файл сохранён браузером: ' + name, 'ok');
  }

  function openMenu(event) {
    const menu = el('div', 'menu');
    const items = [
      ['💾 Сохранить как…', () => saveActiveAs()],
      ['📤 Поделиться файлом', () => shareActive()],
      ['🔤 Размер шрифта: ' + state.fontSize + 'px →', () => {
        state.fontSize = state.fontSize >= 22 ? 12 : state.fontSize + 1;
        applyTheme();
        toast('Шрифт ' + state.fontSize + 'px');
      }],
      ['↩ Перенос строк: ' + (state.wrap ? 'вкл' : 'выкл'), () => {
        state.wrap = !state.wrap;
        const ta = state.editor && state.editor.ta;
        if (ta) ta.wrap = state.wrap ? 'soft' : 'off';
        render();
      }],
      ['📋 Скопировать содержимое', () => {
        const text = currentText();
        if (navigator.clipboard) navigator.clipboard.writeText(text);
        toast('Скопировано');
      }],
      ['🧹 Очистить файл', () => {
        setEditorText('');
      }],
      ['🔁 Сбросить стартовые файлы', () => {
        state.files = [];
        state.nextId = 1;
        STARTER_FILES().forEach((f) => state.files.push({ id: state.nextId++, name: f.name, lang: f.lang, text: f.text, dirty: false }));
        state.activeId = state.files[0].id;
        render();
      }],
    ];
    menu.innerHTML = '';
    items.forEach(([label, handler]) => {
      const item = el('button', 'menu-item', label);
      item.addEventListener('click', () => {
        menu.remove();
        handler();
      });
      menu.appendChild(item);
    });
    document.body.appendChild(menu);
    const rect = (event.currentTarget || event.target).getBoundingClientRect();
    menu.style.top = Math.min(window.innerHeight - menu.offsetHeight - 12, rect.bottom + 6) + 'px';
    menu.style.left = Math.max(8, Math.min(window.innerWidth - menu.offsetWidth - 8, rect.left - 40)) + 'px';
    const close = (e) => {
      if (!menu.contains(e.target)) {
        menu.remove();
        document.removeEventListener('click', close);
      }
    };
    setTimeout(() => document.addEventListener('click', close), 0);
  }

  // --------------------------------------------------------------- ФАЙЛЫ

  function renderFilesView() {
    const wrapEl = el('div', 'stack');
    state.viewRoot = wrapEl; // текущая вкладка: по ней ищем элементы (статус, поиск, вывод)

    const card = el('section', 'card');
    card.innerHTML = `
      <h2>Скачать по ссылке</h2>
      <p class="muted small">Ссылка уходит в системный загрузчик Android: файл появится
      в «Загрузки/GitHub RU Studio» с уведомлением о прогрессе.</p>
      <div class="row">
        <input class="input grow" id="dl-url" placeholder="https://example.com/file.zip" inputmode="url" />
        <input class="input" id="dl-name" placeholder="имя файла (необязательно)" />
      </div>
      <div class="row">
        <button class="btn btn-primary" id="dl-go">⬇ Скачать</button>
        <button class="btn btn-quiet" id="dl-editor">💾 Сохранить открытый файл</button>
      </div>
    `;
    wrapEl.appendChild(card);

    const listCard = el('section', 'card');
    listCard.innerHTML = `
      <div class="card-head">
        <h2>Скачанные файлы</h2>
        <button class="btn btn-quiet" id="dl-refresh">↻ Обновить</button>
      </div>
      <div id="dl-list" class="list"><div class="muted small">Загрузка списка…</div></div>
    `;
    wrapEl.appendChild(listCard);

    const importCard = el('section', 'card');
    importCard.innerHTML = `
      <h2>Импорт и экспорт</h2>
      <div class="row">
        <button class="btn btn-quiet" id="imp-open">📂 Открыть файл с устройства</button>
        <button class="btn btn-quiet" id="imp-share">📤 Поделиться открытым файлом</button>
        <button class="btn btn-quiet" id="imp-copy">📋 Скопировать текст</button>
      </div>
      <p class="muted small">Открытие и «Сохранить как» используют системный файловый
      диалог Android — доступ к памяти выдаётся только на выбранный файл.</p>
    `;
    wrapEl.appendChild(importCard);

    raf(() => {
      wrapEl.querySelector('#dl-go').addEventListener('click', () => {
        const url = wrapEl.querySelector('#dl-url').value.trim();
        let name = wrapEl.querySelector('#dl-name').value.trim();
        if (!url) {
          toast('Введите ссылку');
          return;
        }
        if (!name) {
          name = decodeURIComponent((url.split('?')[0].split('/').pop() || 'download.bin'));
        }
        const result = bridgeCall('downloadUrl', url, name);
        if (result === null) {
          const a = document.createElement('a');
          a.href = url;
          a.download = name;
          a.target = '_blank';
          a.click();
          toast('Открываю ссылку браузером');
          return;
        }
        toast(isOk(result) ? String(result).slice(3) : String(result).replace(/^err:/, 'Ошибка: '),
          isOk(result) ? 'ok' : undefined);
        setTimeout(loadDownloads, 1200);
      });
      wrapEl.querySelector('#dl-editor').addEventListener('click', saveActive);
      wrapEl.querySelector('#imp-open').addEventListener('click', openFromDevice);
      wrapEl.querySelector('#imp-share').addEventListener('click', shareActive);
      wrapEl.querySelector('#imp-copy').addEventListener('click', () => {
        const text = currentText();
        if (navigator.clipboard) navigator.clipboard.writeText(text);
        toast('Текст скопирован');
      });
      wrapEl.querySelector('#dl-refresh').addEventListener('click', loadDownloads);
      loadDownloads();
    });

    function loadDownloads() {
      const target = wrapEl.querySelector('#dl-list');
      if (!target) return;
      const raw = bridgeCall('listDownloads');
      if (raw === null) {
        target.innerHTML = '<div class="muted small">Список доступен в приложении Android. ' +
          'Здесь можно скачать файл по ссылке — он сохранится браузером.</div>';
        return;
      }
      if (raw.startsWith('err:')) {
        target.innerHTML = `<div class="muted small">${escapeHtml(raw.slice(4))}</div>`;
        return;
      }
      let items = [];
      try {
        items = JSON.parse(raw);
      } catch (e) {
        items = [];
      }
      if (!items.length) {
        target.innerHTML = '<div class="muted small">Пока пусто. Сохраните файл — он появится здесь.</div>';
        return;
      }
      target.innerHTML = '';
      items.forEach((item) => {
        const row = el('div', 'list-row');
        row.innerHTML = `
          <div class="list-main">
            <div class="list-name">${escapeHtml(item.name)}</div>
            <div class="muted small">${formatSize(item.size)} • ${escapeHtml(bridgeCall('formattedDate', item.date) || '')}</div>
          </div>
        `;
        const openBtn = el('button', 'btn btn-quiet', 'Открыть');
        openBtn.addEventListener('click', () => {
          const res = bridgeCall('openDownloaded', item.uri, mimeOf(item.name));
          if (res && !isOk(res)) toast(res.replace(/^err:/, 'Ошибка: '));
        });
        const shareBtn = el('button', 'btn btn-quiet', 'Поделиться');
        shareBtn.addEventListener('click', () => bridgeCall('share', item.name, item.uri));
        const delBtn = el('button', 'btn btn-quiet btn-danger', 'Удалить');
        delBtn.addEventListener('click', () => {
          const res = bridgeCall('deleteDownloaded', item.uri);
          if (res && isOk(res)) {
            toast('Удалено');
            loadDownloads();
          }
        });
        const actions = el('div', 'list-actions');
        actions.appendChild(openBtn);
        actions.appendChild(shareBtn);
        actions.appendChild(delBtn);
        row.appendChild(actions);
        target.appendChild(row);
      });
    }

    function mimeOf(name) {
      const n = String(name).toLowerCase();
      if (n.endsWith('.json')) return 'application/json';
      if (n.endsWith('.html') || n.endsWith('.htm')) return 'text/html';
      if (n.endsWith('.css')) return 'text/css';
      if (n.endsWith('.js')) return 'text/javascript';
      if (n.endsWith('.md')) return 'text/markdown';
      if (n.endsWith('.png')) return 'image/png';
      if (n.endsWith('.jpg') || n.endsWith('.jpeg')) return 'image/jpeg';
      if (n.endsWith('.pdf')) return 'application/pdf';
      if (n.endsWith('.zip')) return 'application/zip';
      if (n.endsWith('.apk')) return 'application/vnd.android.package-archive';
      return 'text/plain';
    }

    return wrapEl;
  }

  // ---------------------------------------------------------- ИНСТРУМЕНТЫ

  function renderToolsView() {
    const wrapEl = el('div', 'stack');
    state.viewRoot = wrapEl; // текущая вкладка: по ней ищем элементы (статус, поиск, вывод)

    const tools = [
      {
        id: 'json',
        title: 'JSON',
        hint: 'Форматирование, минификация и проверка на ошибки.',
        input: '{"studio":true,"offline":true,"node":"24"}',
        buttons: [
          ['Отформатировать', (text) => JSON.stringify(JSON.parse(text), null, 2)],
          ['Минифицировать', (text) => JSON.stringify(JSON.parse(text))],
          ['Проверить', (text) => {
            const value = JSON.parse(text);
            const count = Array.isArray(value) ? value.length : Object.keys(value).length;
            return `Всё корректно. Элементов верхнего уровня: ${count}.`;
          }],
        ],
      },
      {
        id: 'base64',
        title: 'Base64',
        hint: 'Кодирование и декодирование текста (UTF-8).',
        input: 'GitHub RU Studio',
        buttons: [
          ['→ Base64', (text) => base64Encode(text)],
          ['← Из Base64', (text) => base64Decode(text)],
        ],
      },
      {
        id: 'url',
        title: 'URL',
        hint: 'Кодирование ссылок и параметров.',
        input: 'https://github.com/search?q=офлайн студия',
        buttons: [
          ['Закодировать', (text) => encodeURIComponent(text)],
          ['Раскодировать', (text) => decodeURIComponent(text)],
          ['Собрать из строк', (text) => text.split('\n').filter(Boolean)
            .map((pair, index) => `${index ? '&' : '?'}${encodeURIComponent(pair.split('=')[0] || '')}=${encodeURIComponent((pair.split('=')[1] || '').trim())}`)
            .join('')],
        ],
      },
      {
        id: 'hash',
        title: 'SHA-256',
        hint: 'Отпечаток текста (нативный расчёт на Android — работает и в LITE-сборке).',
        input: 'GitHub RU Studio',
        buttons: [
          ['Посчитать', (text) => {
            const native = bridgeCall('sha256', text);
            if (native) {
              return native.startsWith('ok:') ? native.slice(3) : native.replace(/^err:/, '');
            }
            return 'SHA-256 доступен в приложении Android (нативный MessageDigest).';
          }],
        ],
      },
      {
        id: 'case',
        title: 'Регистр и текст',
        hint: 'Быстрые преобразования.',
        input: 'GitHub RU Studio — офлайн!',
        buttons: [
          ['ВЕРХНИЙ', (t) => t.toUpperCase()],
          ['нижний', (t) => t.toLowerCase()],
          ['Заголовок', (t) => t.replace(/(^|\s)(\S)/g, (m, a, b) => a + b.toUpperCase())],
          ['Убрать пустые строки', (t) => t.split('\n').filter((l) => l.trim()).join('\n')],
          ['Статистика', (t) => {
            const words = t.trim() ? t.trim().split(/\s+/).length : 0;
            return `Строк: ${t.split('\n').length}\nСлов: ${words}\nСимволов: ${t.length}\nБайт: ${new TextEncoder().encode(t).length}`;
          }],
        ],
      },
      {
        id: 'min',
        title: 'Минификатор',
        hint: 'JS/CSS/HTML/JSON — удаление комментариев и лишних пробелов.',
        input: '/* комментарий */\nfunction hello(name) {\n  return `Привет, ${name}!`;\n}\n\nconsole.log(hello("мир"));',
        buttons: [
          ['Минифицировать JS', (text) => minifyJs(text)],
          ['Минифицировать CSS', (text) => minifyCss(text)],
          ['Минифицировать HTML', (text) => minifyHtml(text)],
        ],
      },
    ];

    tools.forEach((tool) => {
      const card = el('section', 'card tool');
      card.innerHTML = `
        <h2>${escapeHtml(tool.title)}</h2>
        <p class="muted small">${escapeHtml(tool.hint)}</p>
        <textarea class="input tool-input" rows="4" spellcheck="false"></textarea>
        <div class="row">${tool.buttons.map(([label], index) => `<button class="btn btn-quiet" data-i="${index}">${escapeHtml(label)}</button>`).join('')}</div>
        <pre class="tool-out hidden"></pre>
      `;
      const input = card.querySelector('.tool-input');
      input.value = tool.input;
      const out = card.querySelector('.tool-out');
      card.querySelectorAll('button[data-i]').forEach((button) => {
        button.addEventListener('click', () => {
          const [, fn] = tool.buttons[Number(button.dataset.i)];
          try {
            const result = fn(input.value);
            out.textContent = result;
            out.classList.remove('hidden');
            out.classList.remove('tool-out-error');
          } catch (e) {
            out.textContent = 'Ошибка: ' + (e && e.message ? e.message : e);
            out.classList.remove('hidden');
            out.classList.add('tool-out-error');
          }
        });
      });
      wrapEl.appendChild(card);
    });

    return wrapEl;
  }

  // ------------------------------------------------------------ NODE.JS

  function renderNodeView() {
    const wrapEl = el('div', 'stack');
    state.viewRoot = wrapEl; // текущая вкладка: по ней ищем элементы (статус, поиск, вывод)
    const card = el('section', 'card');
    card.innerHTML = `
      <div class="card-head">
        <h2>Node.js (офлайн)</h2>
        <span class="chip" id="node-chip-inline">…</span>
      </div>
      <p class="muted small">Движок стартует на 127.0.0.1 и не ходит в интернет.
      Код выполняется как модуль: вывод console.log попадает в журнал.</p>
      <textarea class="input" id="node-code" rows="6" spellcheck="false">const started = Date.now();
console.log("Node.js", process.version);
console.log("Платформа", process.platform + "/" + process.arch);
console.log("Память, МБ:", Math.round(process.memoryUsage().rss / 1048576));
console.log("Прошло, мс:", Date.now() - started);
({ node: process.version, v8: process.versions.v8 });</textarea>
      <div class="row">
        <button class="btn btn-primary" id="node-run">▶ Выполнить</button>
        <button class="btn btn-quiet" id="node-clearlog">Очистить журнал</button>
        <button class="btn btn-quiet" id="node-info">ℹ Сведения о движке</button>
      </div>
      <pre class="console" id="node-log"></pre>
    `;
    wrapEl.appendChild(card);

    const logEl = () => card.querySelector('#node-log');

    function append(line, cls) {
      const target = logEl();
      if (!target) return;
      state.node.logs.push(line);
      if (state.node.logs.length > 300) state.node.logs.shift();
      target.textContent = state.node.logs.join('\n');
      target.scrollTop = target.scrollHeight;
      if (cls) {
        // цветовые акценты — минимальные: добавляем префикс вместо разметки
      }
    }

    raf(() => {
      const chip = card.querySelector('#node-chip-inline');
      const update = () => {
        const port = nodePort();
        if (port) {
          chip.textContent = 'движок готов • 127.0.0.1:' + port;
          chip.className = 'chip chip-ok';
        } else {
          chip.textContent = 'движок ещё не готов';
          chip.className = 'chip';
        }
      };
      update();
      window.addEventListener('node-ready', update);
      window.addEventListener('studio-ready', update);

      card.querySelector('#node-run').addEventListener('click', () => {
        const code = card.querySelector('#node-code').value;
        append(`$ выполнить ${code.split('\n').length} строк(и)…`);
        nodeFetch('/run', {
          method: 'POST',
          headers: { 'Content-Type': 'application/json' },
          body: JSON.stringify({ code }),
        }).then((data) => {
          (data.logs || []).forEach((line) => append(line));
          if (data.ok) {
            if (data.result !== undefined && data.result !== 'undefined') {
              append('= ' + data.result);
            }
            append(`— готово за ${data.ms} мс`);
          } else {
            append('ОШИБКА: ' + data.error);
          }
        }).catch((e) => {
          append('ОШИБКА: ' + (e.message || e));
          append('LITE-сборка не содержит libnode.so — выполнение кода недоступно,');
          append('остальные функции (редактор, файлы, инструменты) работают полностью.');
        });
      });

      card.querySelector('#node-clearlog').addEventListener('click', () => {
        state.node.logs = [];
        logEl().textContent = '';
      });

      card.querySelector('#node-info').addEventListener('click', () => {
        nodeFetch('/info').then((info) => {
          append('— сведения о движке —');
          append(`node      ${info.node}`);
          append(`v8        ${info.v8}`);
          append(`mobile    ${info.mobile || '—'}`);
          append(`platform  ${info.platform}/${info.arch}`);
          append(`pid       ${info.pid}`);
          append(`uptime    ${info.uptime} c`);
          append(`rss       ${info.memory} МБ`);
        }).catch((e) => append('ОШИБКА: ' + (e.message || e)));
      });
    });

    return wrapEl;
  }

  // ------------------------------------------------------------- О ПРИЛОЖЕНИИ

  function renderAboutView() {
    const wrapEl = el('div', 'stack');
    state.viewRoot = wrapEl; // текущая вкладка: по ней ищем элементы (статус, поиск, вывод)

    let info = {};
    const raw = bridgeCall('appInfo');
    if (raw && raw.startsWith('{')) {
      try {
        info = JSON.parse(raw);
      } catch (e) {
        info = {};
      }
    }
    const device = bridgeCall('deviceInfo') || 'браузер (отладка)';

    const card = el('section', 'card');
    card.innerHTML = `
      <h2>GitHub RU Studio</h2>
      <p class="muted small">Версия ${escapeHtml(VERSION)} • ${escapeHtml(framework)}-сборка • офлайн</p>
      <div class="kv">
        <div><span>Пакет</span><b>${escapeHtml(info.package || '—')}</b></div>
        <div><span>Версия</span><b>${escapeHtml(info.versionName || '—')} (${escapeHtml(String(info.versionCode || ''))})</b></div>
        <div><span>Устройство</span><b>${escapeHtml(device)}</b></div>
        <div><span>Node.js</span><b>${escapeHtml(info.nodeVersion || 'нет (LITE)')}</b></div>
        <div><span>Загрузки</span><b>${escapeHtml(info.downloadsFolder || 'браузер')}</b></div>
        <div><span>Тема</span><b>${escapeHtml((info.theme || document.documentElement.getAttribute('data-theme') || 'system'))}</b></div>
      </div>
    `;
    wrapEl.appendChild(card);

    const features = el('section', 'card');
    features.innerHTML = `
      <h2>Возможности</h2>
      <ul class="facts">
        <li>📥 <b>Скачивание файлов</b>: по ссылке (системный загрузчик с уведомлением),
            сохранение текста в «Загрузки/GitHub RU Studio», Base64-картинки,
            «Сохранить как» через системный диалог, «Поделиться», список скачанного.</li>
        <li>📝 <b>Редактор файлов</b>: нумерация строк, подсветка синтаксиса,
            поиск и замена, автоотступы, парные скобки, форматирование JSON,
            минификация JS/CSS/HTML, размер шрифта, перенос строк, горячие клавиши.</li>
        <li>🧰 <b>Инструменты</b>: JSON, Base64, URL, SHA-256, регистр, статистика текста.</li>
        <li>🟢 <b>Node.js 24</b> (в FULL-сборке): выполнение кода офлайн на 127.0.0.1.</li>
        <li>🎨 <b>Дизайн</b>: светлая и тёмная темы GitHub, чипсы состояния, карточки,
            плавные переходы, крупные зоны нажатия.</li>
        <li>⚡ <b>Оптимизация</b>: R8 (минификация и удаление мёртвого кода),
            ленивый запуск движка, ленивое создание Vue-вкладки, отключённые отладочные логи.</li>
        <li>📦 <b>Вес</b>: сжатые .so внутри APK + strip символов + исключение лишних
            ресурсов; есть LITE-сборка вообще без Node.js (меньше 3 МБ).</li>
      </ul>
    `;
    wrapEl.appendChild(features);

    const links = el('section', 'card');
    links.innerHTML = `
      <h2>Ссылки</h2>
      <div class="row">
        <a class="btn btn-quiet" href="https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks" target="_blank" rel="noopener">Репозиторий</a>
        <a class="btn btn-quiet" href="https://github.com/KamiSakyy/Lwlwxldodiwjnwmwllxllxmxmxks/releases" target="_blank" rel="noopener">Релизы APK</a>
      </div>
      <p class="muted small">Приложение не отправляет данные в сеть: страницы лежат в APK,
      движок слушает только 127.0.0.1.</p>
    `;
    wrapEl.appendChild(links);

    return wrapEl;
  }

  const VIEW_RENDERERS = {
    editor: renderEditorView,
    files: renderFilesView,
    tools: renderToolsView,
    node: renderNodeView,
    about: renderAboutView,
  };

  // ------------------------------------------------------------- слушатели

  function onStudioReady() {
    applyTheme();
    const raw = bridgeCall('appInfo');
    if (raw && raw.startsWith('{')) {
      try {
        const info = JSON.parse(raw);
        state.node.ready = info.nodeReady === 'READY';
        setChip(info.nodeReady === 'READY' ? 'Node.js ' + info.nodeVersion : 'Node.js: ' + nodeStateText(info.nodeReady),
          info.nodeReady === 'READY' ? 'chip-ok' : '');
      } catch (e) {
        /* игнорируем */
      }
    }
    if (state.view === 'node') render();
  }

  function nodeStateText(name) {
    if (name === 'UNAVAILABLE') return 'LITE-сборка';
    if (name === 'FAILED') return 'ошибка';
    if (name === 'STARTING') return 'запуск…';
    return 'ожидание';
  }

  root.querySelector('#btn-theme').addEventListener('click', () => {
    const order = ['system', 'light', 'dark'];
    state.theme = order[(order.indexOf(state.theme) + 1) % order.length];
    applyTheme();
    toast('Тема: ' + ({ system: 'как в системе', light: 'светлая', dark: 'тёмная' })[state.theme]);
  });
  root.querySelector('#btn-about').addEventListener('click', () => {
    state.view = 'about';
    render();
  });

  window.addEventListener('studio-ready', onStudioReady);
  window.addEventListener('node-ready', () => {
    setChip('Node.js готов', 'chip-ok');
  });

  if (window.matchMedia) {
    window.matchMedia('(prefers-color-scheme: dark)').addEventListener('change', applyTheme);
  }

  // Публичный API для нативных вызовов: открытие файла из SAF-диалога.
  window.StudioEditor = {
    onFileOpened(name, text) {
      const file = { id: state.nextId++, name: name || 'file.txt', lang: guessLang(name), text: text || '', dirty: false };
      state.files.push(file);
      state.activeId = file.id;
      state.view = 'editor';
      render();
      toast('Открыт файл: ' + file.name, 'ok');
    },
    openDownload(name, text) {
      window.StudioEditor.onFileOpened(name, text);
    },
    save() {
      saveActive();
    },
    run() {
      runActive();
    },
    listFeatures() {
      return ['editor', 'downloads', 'tools', 'node', 'themes'];
    },
  };

  // Старт
  render();
  onStudioReady();
  setChip(nodePort() ? 'Node.js готов' : 'Node.js: запуск…', nodePort() ? 'chip-ok' : '');

  return {
    destroy() {
      window.removeEventListener('studio-ready', onStudioReady);
      state.editorApi = null;
      root.innerHTML = '';
    },
    state,
  };
}

export default { mountStudio, highlight, escapeHtml };
