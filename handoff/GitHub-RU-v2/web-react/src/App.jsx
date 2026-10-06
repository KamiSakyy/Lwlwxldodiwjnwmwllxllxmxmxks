import React, { useCallback, useEffect, useState } from 'react';

// Порт встроенного Node.js подставляет нативная оболочка (WebView):
// window.__NODE_PORT__ + событие 'node-ready'. Всё общение — 127.0.0.1, офлайн.
function nodeBase() {
  const p = window.__NODE_PORT__;
  return p ? `http://127.0.0.1:${p}` : null;
}

export default function App() {
  const [info, setInfo] = useState(null);
  const [nodeState, setNodeState] = useState('ожидание движка…');
  const [code, setCode] = useState('({node: process.version, v8: process.versions.v8})');
  const [result, setResult] = useState('');
  const [busy, setBusy] = useState(false);

  const refreshInfo = useCallback(async () => {
    const base = nodeBase();
    if (!base) {
      setNodeState('движок ещё запускается…');
      return;
    }
    try {
      const r = await fetch(`${base}/info`);
      const j = await r.json();
      setInfo(j);
      setNodeState(`Node.js ${j.node} • ${j.platform}/${j.arch} • офлайн OK`);
    } catch (e) {
      setNodeState(`нет связи с движком: ${e.message}`);
    }
  }, []);

  useEffect(() => {
    refreshInfo();
    const t = setInterval(refreshInfo, 3000);
    const onReady = () => refreshInfo();
    window.addEventListener('node-ready', onReady);
    return () => {
      clearInterval(t);
      window.removeEventListener('node-ready', onReady);
    };
  }, [refreshInfo]);

  const runCode = async () => {
    const base = nodeBase();
    if (!base) {
      setResult('ОШИБКА: Node.js ещё не готов');
      return;
    }
    setBusy(true);
    try {
      const r = await fetch(`${base}/eval`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ code }),
      });
      const j = await r.json();
      setResult(j.ok ? j.result : `ОШИБКА: ${j.error}`);
    } catch (e) {
      setResult(`ОШИБКА: ${e.message}`);
    } finally {
      setBusy(false);
    }
  };

  return (
    <div className="page">
      <header className="hero">
        <div className="badge">⚛ React 19 • Vite • внутри APK • офлайн</div>
        <h1>GitHub RU Studio</h1>
        <p className="muted">
          Этот экран — настоящий React-билд (<code>web-react/dist</code>), упакованный
          в <code>assets/web/react</code>. Интернета нет и не надо: страница локальная,
          а JS выполняет встроенный Node.js 24 через 127.0.0.1.
        </p>
        <div className={info ? 'pill ok' : 'pill wait'}>{nodeState}</div>
      </header>

      <section className="card">
        <h2>Консоль Node.js (офлайн)</h2>
        <textarea
          className="code"
          rows={4}
          value={code}
          onChange={(e) => setCode(e.target.value)}
          spellCheck={false}
        />
        <div className="row">
          <button className="btn primary" onClick={runCode} disabled={busy}>
            {busy ? 'Выполняется…' : '▶ Выполнить в Node.js'}
          </button>
          <button className="btn" onClick={refreshInfo}>↻ Статус движка</button>
        </div>
        {result !== '' && <pre className="out">{result}</pre>}
      </section>

      <section className="card">
        <h2>Что внутри</h2>
        <ul className="facts">
          <li>📱 <b>minSdk 28 → targetSdk 36</b> — только современные API Android 9–16</li>
          <li>🟢 <b>Node.js {info ? info.node : '…'} (V8 {info ? info.v8 : '…'})</b> — нативный libnode.so в APK</li>
          <li>⚛ <b>React 19.3</b> — эта вкладка; 💚 <b>Vue 3.5</b> — соседняя вкладка</li>
          <li>🔌 Общение фронта с движком — <b>localhost HTTP</b>, наружу ничего не ходит</li>
        </ul>
      </section>

      <footer className="muted small">
        GitHub RU Studio • сборка {new Date().getFullYear()} • работает в самолёте ✈
      </footer>
    </div>
  );
}
