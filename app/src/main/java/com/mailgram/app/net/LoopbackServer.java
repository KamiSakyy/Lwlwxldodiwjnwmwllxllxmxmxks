package com.mailgram.app.net;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/**
 * Локальный приёмник редиректа OAuth (loopback, RFC 8252 §7.3).
 * <p>
 * Нужен для сценария «свой client ID без пересборки»: Google разрешает
 * redirect на http://127.0.0.1:порт для Desktop/Web-клиентов. Сокет слушает
 * только петлевой интерфейс, наружу ничего не открыто; живёт до первого кода.
 */
public final class LoopbackServer {

    private static final String TAG = "MailGramLoopback";
    public static final int PORT = 7717;
    public static final String PATH = "/oauth2redirect";

    private LoopbackServer() {
    }

    public static String redirectUri() {
        return "http://127.0.0.1:" + PORT + PATH;
    }

    public interface Callback {
        void onCode(String code, String state);

        void onError(String message);
    }

    /** Запускает приём кода в отдельном потоке (демон). */
    public static Thread start(Callback callback) {
        Thread t = new Thread(() -> run(callback), "mailgram-loopback");
        t.setDaemon(true);
        t.start();
        return t;
    }

    private static void run(Callback callback) {
        ServerSocket server = null;
        try {
            server = new ServerSocket(PORT, 4, InetAddress.getByName("127.0.0.1"));
            server.setSoTimeout(300_000); // 5 минут на вход
            long deadline = System.currentTimeMillis() + 300_000L;
            while (System.currentTimeMillis() < deadline) {
                Socket socket = null;
                try {
                    socket = server.accept();
                    BufferedReader in = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    String requestLine = in.readLine();
                    if (requestLine == null) continue;
                    String code = null;
                    String state = null;
                    String error = null;
                    int q = requestLine.indexOf('?');
                    if (q > 0) {
                        String query = requestLine.substring(q + 1);
                        int sp = query.indexOf(' ');
                        if (sp > 0) query = query.substring(0, sp);
                        for (String pair : query.split("&")) {
                            int eq = pair.indexOf('=');
                            if (eq <= 0) continue;
                            String key = URLDecoder.decode(pair.substring(0, eq), "UTF-8");
                            String value = URLDecoder.decode(pair.substring(eq + 1), "UTF-8");
                            if ("code".equals(key)) code = value;
                            else if ("state".equals(key)) state = value;
                            else if ("error".equals(key)) error = value;
                        }
                    }
                    boolean isRedirect = requestLine.startsWith("GET " + PATH);
                    respond(socket, error == null ? 200 : 400, isRedirect ? successPage() : "MailGram");
                    if (isRedirect && code != null) {
                        callback.onCode(code, state);
                        return;
                    }
                    if (isRedirect && error != null) {
                        callback.onError("Google вернул ошибку: " + error);
                        return;
                    }
                } catch (Exception e) {
                    Log.w(TAG, "сбой приёма редиректа: " + e);
                } finally {
                    if (socket != null) {
                        try {
                            socket.close();
                        } catch (Exception ignored) {
                        }
                    }
                }
            }
            callback.onError("истекло время ожидания входа (5 минут)");
        } catch (Exception e) {
            callback.onError("не удалось открыть порт " + PORT + ": " + e.getMessage());
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (Exception ignored) {
                }
            }
        }
    }

    private static void respond(Socket socket, int code, String html) {
        try {
            byte[] body = html.getBytes(StandardCharsets.UTF_8);
            String head = "HTTP/1.1 " + code + " " + (code == 200 ? "OK" : "Bad Request") + "\r\n"
                    + "Content-Type: text/html; charset=utf-8\r\n"
                    + "Content-Length: " + body.length + "\r\n"
                    + "Connection: close\r\n\r\n";
            OutputStream os = socket.getOutputStream();
            os.write(head.getBytes(StandardCharsets.US_ASCII));
            os.write(body);
            os.flush();
        } catch (Exception ignored) {
        }
    }

    private static String successPage() {
        return "<!doctype html><html lang=\"ru\"><head><meta charset=\"utf-8\">"
                + "<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">"
                + "<title>MailGram</title></head>"
                + "<body style=\"margin:0;font:16px/1.5 -apple-system,Roboto,sans-serif;"
                + "background:#0f1621;color:#e9f1ff;display:flex;min-height:100vh;align-items:center;"
                + "justify-content:center;text-align:center\">"
                + "<div><div style=\"font-size:56px\">🔐</div>"
                + "<h1 style=\"font-weight:600;margin:8px 0\">Готово!</h1>"
                + "<p style=\"opacity:.8\">Вход выполнен. Вернитесь в приложение MailGram.</p>"
                + "</div></body></html>";
    }
}
