<script setup>
import { onMounted, onUnmounted, ref } from 'vue';

// Порт встроенного Node.js подставляет нативная оболочка (WebView):
// window.__NODE_PORT__ + событие 'node-ready'. Всё общение — 127.0.0.1, офлайн.
function nodeBase() {
  const p = window.__NODE_PORT__;
  return p ? `http://127.0.0.1:${p}` : null;
}

const info = ref(null);
const nodeState = ref('ожидание движка…');
const code = ref('[1, 2, 3].map(x => x * x).join(" + ")');
const result = ref('');
const busy = ref(false);
let timer = null;

async function refreshInfo() {
  const base = nodeBase();
  if (!base) {
    nodeState.value = 'движок ещё запускается…';
    return;
  }
  try {
    const r = await fetch(`${base}/info`);
    const j = await r.json();
    info.value = j;
    nodeState.value = `Node.js ${j.node} • ${j.platform}/${j.arch} • офлайн OK`;
  } catch (e) {
    nodeState.value = `нет связи с движком: ${e.message}`;
  }
}

async function runCode() {
  const base = nodeBase();
  if (!base) {
    result.value = 'ОШИБКА: Node.js ещё не готов';
    return;
  }
  busy.value = true;
  try {
    const r = await fetch(`${base}/eval`, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ code: code.value }),
    });
    const j = await r.json();
    result.value = j.ok ? j.result : `ОШИБКА: ${j.error}`;
  } catch (e) {
    result.value = `ОШИБКА: ${e.message}`;
  } finally {
    busy.value = false;
  }
}

function onReady() {
  refreshInfo();
}

onMounted(() => {
  refreshInfo();
  timer = setInterval(refreshInfo, 3000);
  window.addEventListener('node-ready', onReady);
});

onUnmounted(() => {
  if (timer) clearInterval(timer);
  window.removeEventListener('node-ready', onReady);
});

const year = new Date().getFullYear();
</script>

<template>
  <div className="page">
    <header className="hero">
      <div className="badge">💚 Vue 3 • Vite • внутри APK • офлайн</div>
      <h1>GitHub RU Studio</h1>
      <p className="muted">
        Этот экран — настоящий Vue-билд (<code>web-vue/dist</code>), упакованный
        в <code>assets/web/vue</code>. Интернета нет и не надо: страница локальная,
        а JS выполняет встроенный Node.js 24 через 127.0.0.1.
      </p>
      <div :className="info ? 'pill ok' : 'pill wait'">{{ nodeState }}</div>
    </header>

    <section className="card">
      <h2>Консоль Node.js (офлайн)</h2>
      <textarea className="code" rows="4" v-model="code" spellcheck="false"></textarea>
      <div className="row">
        <button className="btn primary" @click="runCode" :disabled="busy">
          {{ busy ? 'Выполняется…' : '▶ Выполнить в Node.js' }}
        </button>
        <button className="btn" @click="refreshInfo">↻ Статус движка</button>
      </div>
      <pre v-if="result !== ''" className="out">{{ result }}</pre>
    </section>

    <section className="card">
      <h2>Что внутри</h2>
      <ul className="facts">
        <li>📱 <b>minSdk 28 → targetSdk 36</b> — только современные API Android 9–16</li>
        <li>🟢 <b>Node.js {{ info ? info.node : '…' }} (V8 {{ info ? info.v8 : '…' }})</b> — нативный libnode.so в APK</li>
        <li>💚 <b>Vue 3.5</b> — эта вкладка; ⚛ <b>React 19.3</b> — соседняя вкладка</li>
        <li>🔌 Общение фронта с движком — <b>localhost HTTP</b>, наружу ничего не ходит</li>
      </ul>
    </section>

    <footer className="muted small">
      GitHub RU Studio • сборка {{ year }} • работает в самолёте ✈
    </footer>
  </div>
</template>
