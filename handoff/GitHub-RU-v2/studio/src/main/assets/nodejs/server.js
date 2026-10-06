// GitHub RU Studio — встроенный ОФЛАЙН Node.js.
// Запускается нативно через node::Start(), слушает ТОЛЬКО 127.0.0.1
// на случайном порту. Интернет не нужен и не используется.
//
//   GET  /info    — версии движка
//   POST /eval    — {code} -> {ok, result} / {ok:false, error}
//   POST /run     — {code, name} -> {ok, logs[], result, ms} (модульный запуск с перехватом console)
//   POST /sha256  — {text} -> {ok, hash}
// CORS открыт (*), чтобы локальные WebView (React/Vue из assets)
// могли обращаться к движку напрямую.

'use strict';

const http = require('node:http');
const fs = require('node:fs');
const vm = require('node:vm');
const crypto = require('node:crypto');

const portFile = process.argv[2];

function sendJson(res, obj) {
  const data = JSON.stringify(obj);
  res.writeHead(200, {
    'Content-Type': 'application/json; charset=utf-8',
    'Content-Length': Buffer.byteLength(data),
  });
  res.end(data);
}

function readBody(req, limit, cb) {
  let body = '';
  req.on('data', (chunk) => {
    body += chunk;
    if (body.length > limit) req.destroy();
  });
  req.on('end', () => cb(body));
}

function makeSandbox(extra) {
  return Object.assign({
    console,
    process,
    Buffer,
    setTimeout,
    clearTimeout,
    setInterval,
    clearInterval,
    setImmediate,
    URL,
    URLSearchParams,
    TextEncoder,
    TextDecoder,
    JSON,
    Math,
    Date,
    Promise,
    Intl,
  }, extra || {});
}

const server = http.createServer((req, res) => {
  res.setHeader('Access-Control-Allow-Origin', '*');
  res.setHeader('Access-Control-Allow-Methods', 'GET,POST,OPTIONS');
  res.setHeader('Access-Control-Allow-Headers', 'Content-Type');

  if (req.method === 'OPTIONS') {
    res.writeHead(204);
    res.end();
    return;
  }

  if (req.method === 'GET' && req.url === '/info') {
    sendJson(res, {
      ok: true,
      node: process.version,
      mobile: (process.versions && process.versions.mobile) || null,
      v8: (process.versions && process.versions.v8) || null,
      platform: process.platform,
      arch: process.arch,
      pid: process.pid,
      uptime: Math.round(process.uptime()),
      memory: Math.round(process.memoryUsage().rss / 1048576),
    });
    return;
  }

  if (req.method === 'POST' && req.url === '/eval') {
    readBody(req, 200000, (body) => {
      try {
        const parsed = JSON.parse(body || '{}');
        const code = String((parsed && parsed.code) || '');
        // Песочница vm с таймаутом: зависший код не уронит движок.
        const result = vm.runInNewContext(code, makeSandbox(), { timeout: 8000 });
        let out;
        try {
          out = JSON.stringify(result);
          if (out === undefined) out = String(result);
        } catch (_) {
          out = String(result);
        }
        sendJson(res, { ok: true, result: out });
      } catch (e) {
        sendJson(res, { ok: false, error: String((e && e.stack) || e) });
      }
    });
    return;
  }

  // Модульный запуск кода из редактора: перехватываем console.* и возвращаем
  // и логи, и результат последнего выражения. Так кнопка «Запустить»
  // показывает вывод так же, как это сделал бы node script.js.
  if (req.method === 'POST' && req.url === '/run') {
    readBody(req, 500000, (body) => {
      const started = Date.now();
      const logs = [];
      const record = (level) => (...args) => {
        logs.push('[' + level + '] ' + args.map((a) => {
          if (typeof a === 'string') return a;
          try { return JSON.stringify(a); } catch (_) { return String(a); }
        }).join(' '));
        if (logs.length > 500) logs.shift();
      };
      try {
        const parsed = JSON.parse(body || '{}');
        const code = String((parsed && parsed.code) || '');
        const sandboxConsole = {
          log: record('log'),
          info: record('info'),
          warn: record('warn'),
          error: record('error'),
          debug: record('debug'),
          table: record('table'),
        };
        const module_ = { exports: {} };
        const sandbox = makeSandbox({
          console: sandboxConsole,
          module: module_,
          exports: module_.exports,
          require: (name) => require(name),
          __filename: '/studio/scratch.js',
          __dirname: '/studio',
        });
        const result = vm.runInNewContext(code, sandbox, {
          timeout: 15000,
          filename: 'studio-scratch.js',
        });
        let out;
        try {
          out = JSON.stringify(result);
          if (out === undefined) out = String(result);
        } catch (_) {
          out = String(result);
        }
        sendJson(res, { ok: true, logs, result: out, ms: Date.now() - started });
      } catch (e) {
        sendJson(res, {
          ok: false,
          logs,
          error: String((e && e.stack) || e),
          ms: Date.now() - started,
        });
      }
    });
    return;
  }

  if (req.method === 'POST' && req.url === '/sha256') {
    readBody(req, 2000000, (body) => {
      try {
        const parsed = JSON.parse(body || '{}');
        const text = String((parsed && parsed.text) || '');
        sendJson(res, {
          ok: true,
          hash: crypto.createHash('sha256').update(text, 'utf8').digest('hex'),
          bytes: Buffer.byteLength(text, 'utf8'),
        });
      } catch (e) {
        sendJson(res, { ok: false, error: String(e) });
      }
    });
    return;
  }

  res.writeHead(404, { 'Content-Type': 'text/plain' });
  res.end('not found');
});

server.listen(0, '127.0.0.1', () => {
  const port = server.address().port;
  if (portFile) {
    fs.writeFileSync(portFile, String(port));
  }
  console.log(`[server.js] Node.js ${process.version} слушает 127.0.0.1:${port} (офлайн)`);
});
