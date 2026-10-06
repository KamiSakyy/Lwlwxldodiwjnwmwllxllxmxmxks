package com.mailgram.app.media;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.OpenableColumns;
import android.util.Base64;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** Работа с медиа: чтение из галереи, размеры, кэш-файлы, миниатюры. */
public final class MediaUtil {

    /** Ограничения на вложение: письмо не должно раздуваться (Gmail: 35 МБ на письмо). */
    public static final long MAX_PHOTO_BYTES = 1200L * 1024L;
    public static final long MAX_VIDEO_BYTES = 4L * 1024L * 1024L;
    public static final long MAX_VOICE_BYTES = 2L * 1024L * 1024L;
    public static final long MAX_FILE_BYTES = 6L * 1024L * 1024L;
    public static final long MAX_CIRCLE_MS = 30_000L;

    private MediaUtil() {
    }

    public static byte[] readAll(Context ctx, Uri uri, long limit) throws IOException {
        try (InputStream is = ctx.getContentResolver().openInputStream(uri)) {
            if (is == null) throw new IOException("нет доступа к файлу");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[16384];
            int n;
            long total = 0;
            while ((n = is.read(buf)) > 0) {
                total += n;
                if (total > limit) throw new IOException("файл больше " + (limit / 1024 / 1024) + " МБ");
                bos.write(buf, 0, n);
            }
            return bos.toByteArray();
        }
    }

    public static String displayName(Context ctx, Uri uri) {
        ContentResolver cr = ctx.getContentResolver();
        try (Cursor c = cr.query(uri, null, null, null, null)) {
            if (c != null && c.moveToFirst()) {
                int idx = c.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                if (idx >= 0) {
                    String name = c.getString(idx);
                    if (name != null && !name.isEmpty()) return name;
                }
            }
        } catch (Exception ignored) {
        }
        String last = uri.getLastPathSegment();
        return last == null ? "файл" : last;
    }

    public static long sizeOf(Context ctx, Uri uri) {
        try (Cursor c = ctx.getContentResolver().query(uri, null, null, null, null)) {
            if (c != null && c.moveToFirst()) {
                int idx = c.getColumnIndex(OpenableColumns.SIZE);
                if (idx >= 0 && !c.isNull(idx)) return c.getLong(idx);
            }
        } catch (Exception ignored) {
        }
        return -1;
    }

    public static String mimeOf(Context ctx, Uri uri) {
        String mime = ctx.getContentResolver().getType(uri);
        return mime == null ? "application/octet-stream" : mime;
    }

    /** Сохраняет расшифрованное вложение в кэш — из файла работают плееры и просмотрщики. */
    public static File cacheFile(Context ctx, String name, byte[] data, String suffix) {
        File dir = new File(ctx.getCacheDir(), "media");
        if (!dir.exists() && !dir.mkdirs()) {
            dir = ctx.getCacheDir();
        }
        String safe = name == null || name.trim().isEmpty() ? ("mailgram-" + System.nanoTime() + suffix) : name;
        File out = new File(dir, safe);
        try (OutputStream os = new FileOutputStream(out)) {
            os.write(data);
        } catch (Exception ignored) {
        }
        return out;
    }

    public static byte[] decode(String base64) {
        if (base64 == null || base64.isEmpty()) return new byte[0];
        try {
            return Base64.decode(base64, Base64.DEFAULT);
        } catch (Exception e) {
            return new byte[0];
        }
    }

    public static String encode(byte[] data) {
        return data == null || data.length == 0
                ? "" : Base64.encodeToString(data, Base64.NO_WRAP);
    }

    /** Миниатюра видео (первый кадр) — для превью в пузыре и в кружке. */
    public static Bitmap videoFrame(File file, int maxDimension) {
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        try {
            retriever.setDataSource(file.getAbsolutePath());
            Bitmap frame = retriever.getFrameAtTime(200_000L,
                    MediaMetadataRetriever.OPTION_CLOSEST_SYNC);
            if (frame == null) return null;
            int maxSide = Math.max(frame.getWidth(), frame.getHeight());
            if (maxSide <= maxDimension) return frame;
            float ratio = (float) maxDimension / (float) maxSide;
            Bitmap scaled = Bitmap.createScaledBitmap(frame,
                    Math.max(1, Math.round(frame.getWidth() * ratio)),
                    Math.max(1, Math.round(frame.getHeight() * ratio)), true);
            if (scaled != frame) frame.recycle();
            return scaled;
        } catch (Exception e) {
            return null;
        } finally {
            try {
                retriever.release();
            } catch (Exception ignored) {
            }
        }
    }

    public static long videoDurationMs(File file) {
        MediaMetadataRetriever retriever = new MediaMetadataRetriever();
        try {
            retriever.setDataSource(file.getAbsolutePath());
            String value = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION);
            return value == null ? 0L : Long.parseLong(value);
        } catch (Exception e) {
            return 0L;
        } finally {
            try {
                retriever.release();
            } catch (Exception ignored) {
            }
        }
    }

    /** Открывает файл системным приложением (просмотр/прослушивание). */
    public static void openFile(Context ctx, File file, String mime) {
        try {
            Uri uri = androidx.core.content.FileProvider.getUriForFile(ctx,
                    ctx.getPackageName() + ".files", file);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(uri, mime == null || mime.isEmpty() ? "*/*" : mime);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_ACTIVITY_NEW_TASK);
            ctx.startActivity(intent);
        } catch (Exception e) {
            android.widget.Toast.makeText(ctx, "нечем открыть этот файл",
                    android.widget.Toast.LENGTH_SHORT).show();
        }
    }

    public static String humanSize(long bytes) {
        if (bytes < 1024) return bytes + " Б";
        if (bytes < 1024 * 1024) return String.format(java.util.Locale.US, "%.1f КБ", bytes / 1024.0);
        return String.format(java.util.Locale.US, "%.1f МБ", bytes / 1024.0 / 1024.0);
    }

    public static String humanDuration(long ms) {
        long total = ms / 1000L;
        long minutes = total / 60L;
        long seconds = total % 60L;
        return String.format(java.util.Locale.US, "%d:%02d", minutes, seconds);
    }
}
