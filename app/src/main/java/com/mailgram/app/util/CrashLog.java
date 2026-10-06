package com.mailgram.app.util;

import android.content.Context;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * «Чёрный ящик»: записывает последнюю ошибку в закрытый файл приложения,
 * чтобы её можно было разобрать, и не даёт приложению закрыться молча.
 * Наружу (в интерфейс) ничего не выводится — только простое сообщение.
 */
public final class CrashLog {

    private static final String FILE = "last_error.txt";
    private static final int MAX = 4000;

    private CrashLog() {
    }

    /** Ставит перехват необработанных ошибок: пишем файл и продолжаем работу. */
    public static void install(final Context context) {
        final Context app = context.getApplicationContext();
        final Thread.UncaughtExceptionHandler base = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler((thread, error) -> {
            write(app, error);
            if (base != null) {
                base.uncaughtException(thread, error);
            }
        });
    }

    /** Записывает ошибку в файл (без технических данных наружу). */
    public static void record(Context context, Throwable error) {
        if (context == null || error == null) return;
        write(context.getApplicationContext(), error);
    }

    /** Последняя ошибка или пустая строка. */
    public static String last(Context context) {
        if (context == null) return "";
        File file = new File(context.getFilesDir(), FILE);
        if (!file.exists()) return "";
        try (FileInputStream in = new FileInputStream(file);
             BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"))) {
            StringBuilder out = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                out.append(line).append('\n');
            }
            return out.toString().trim();
        } catch (Exception e) {
            return "";
        }
    }

    public static boolean has(Context context) {
        return context != null && new File(context.getFilesDir(), FILE).exists();
    }

    public static void clear(Context context) {
        if (context == null) return;
        File file = new File(context.getFilesDir(), FILE);
        if (file.exists()) {
            //noinspection ResultOfMethodCallIgnored
            file.delete();
        }
    }

    private static void write(Context context, Throwable error) {
        try {
            StringWriter buffer = new StringWriter();
            PrintWriter printer = new PrintWriter(buffer);
            printer.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()));
            error.printStackTrace(printer);
            printer.flush();
            String text = buffer.toString();
            if (text.length() > MAX) {
                text = text.substring(0, MAX);
            }
            text = hide(text);
            try (FileOutputStream out = new FileOutputStream(new File(context.getFilesDir(), FILE))) {
                out.write(text.getBytes("UTF-8"));
            }
        } catch (Throwable ignored) {
        }
    }

    /** Убирает из текста всё, что похоже на адрес или ключ. */
    private static String hide(String text) {
        String out = text;
        out = out.replaceAll("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}", "…");
        out = out.replaceAll("[A-Za-z0-9_-]{24,}\\.[A-Za-z0-9_-]{6,}", "…");
        out = out.replaceAll("\\b[0-9a-fA-F]{32,}\\b", "…");
        out = out.replaceAll("(?i)(client_id|client_secret|refresh_token|access_token)=[^\\s&]+", "$1=…");
        return out;
    }
}
