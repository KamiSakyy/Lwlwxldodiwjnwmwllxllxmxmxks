// GitHub RU Studio — встроенный ОФЛАЙН Node.js.
// Запускается нативно через node::Start(), слушает ТОЛЬКО 127.0.0.1
// на случайном порту. Интернет не нужен и не используется.
//
//   GET  /info — версии движка
//   POST /eval — {code} -> {ok, result} / {ok:false, error}
// CORS открыт (*), чтобы локальные WebView (React/Vue из assets)
// могли обращаться к движку напрямую.

'use strict';

const http = require('node:http');
const fs = require('node:fs');
const vm = require('node:vm');

const portFile = process.argv[2];

function sendJson(res, obj) {
  const data = JSON.stringify(obj);
  res.writeHead(200, {
    'Content-Type': 'application/json; charset=utf-8',
    'Content-Length': Buffer.byteLength(data),
  });
  res.end(data);
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
    });
    return;
  }

  if (req.method === 'POST' && req.url === '/eval') {
    let body = '';
    req.on('data', (chunk) => {
      body += chunk;
      if (body.length > 200000) req.destroy();
    });
    req.on('end', () => {
      try {
        const parsed = JSON.parse(body || '{}');
        const code = String((parsed && parsed.code) || '');
        // Песочница vm с таймаутом: зависший код не уронит движок.
        const sandbox = {
          console,
          process,
          Buffer,
          setTimeout,
          clearTimeout,
          setInterval,
          clearInterval,
          URL,
          URLSearchParams,
          TextEncoder,
          TextDecoder,
          JSON,
          Math,
        };
        const result = vm.runInNewContext(code, sandbox, { timeout: 8000 });
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
