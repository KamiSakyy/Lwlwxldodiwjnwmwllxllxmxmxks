package com.mailgram.app.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/** Подготовка фото к отправке письмом: уменьшаем и сжимаем JPEG. */
public final class PhotoUtil {

    public static final int MAX_DIMENSION = 1280;
    public static final int MAX_BYTES = 900 * 1024;

    private PhotoUtil() {
    }

    public static byte[] compressForMail(Context ctx, Uri uri) throws IOException {
        return compressBytes(readAll(ctx, uri));
    }

    /** То же самое, но если изображение уже в памяти (например, снимок с камеры). */
    public static byte[] compressBytes(byte[] raw) throws IOException {
        BitmapFactory.Options bounds = new BitmapFactory.Options();
        bounds.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(raw, 0, raw.length, bounds);
        int sample = 1;
        int maxSide = Math.max(bounds.outWidth, bounds.outHeight);
        while (maxSide / sample > MAX_DIMENSION * 2) sample *= 2;

        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inSampleSize = sample;
        Bitmap bitmap = BitmapFactory.decodeByteArray(raw, 0, raw.length, opts);
        if (bitmap == null) throw new IOException("не удалось прочитать изображение");
        bitmap = scaleDown(bitmap, MAX_DIMENSION);

        int quality = 85;
        byte[] out;
        while (true) {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, bos);
            out = bos.toByteArray();
            if (out.length <= MAX_BYTES || quality <= 40) break;
            quality -= 15;
        }
        bitmap.recycle();
        if (out.length > MAX_BYTES * 2) throw new IOException("файл слишком большой");
        return out;
    }

    public static Bitmap decodeScaled(byte[] jpeg, int maxDimension) {
        if (jpeg == null || jpeg.length == 0) return null;
        BitmapFactory.Options bounds = new BitmapFactory.Options();
        bounds.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(jpeg, 0, jpeg.length, bounds);
        int sample = 1;
        int maxSide = Math.max(bounds.outWidth, bounds.outHeight);
        while (maxSide / sample > maxDimension * 2) sample *= 2;
        BitmapFactory.Options opts = new BitmapFactory.Options();
        opts.inSampleSize = sample;
        Bitmap bmp = BitmapFactory.decodeByteArray(jpeg, 0, jpeg.length, opts);
        if (bmp == null) return null;
        return scaleDown(bmp, maxDimension);
    }

    private static Bitmap scaleDown(Bitmap src, int maxDimension) {
        int w = src.getWidth();
        int h = src.getHeight();
        int maxSide = Math.max(w, h);
        if (maxSide <= maxDimension) return src;
        float ratio = (float) maxDimension / (float) maxSide;
        Bitmap scaled = Bitmap.createScaledBitmap(src, Math.round(w * ratio), Math.round(h * ratio), true);
        if (scaled != src) src.recycle();
        return scaled;
    }

    private static byte[] readAll(Context ctx, Uri uri) throws IOException {
        try (InputStream is = ctx.getContentResolver().openInputStream(uri)) {
            if (is == null) throw new IOException("нет доступа к файлу");
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            long total = 0;
            while ((n = is.read(buf)) > 0) {
                total += n;
                if (total > 24L * 1024 * 1024) throw new IOException("файл больше 24 МБ");
                bos.write(buf, 0, n);
            }
            return bos.toByteArray();
        }
    }

    /** Поворот по EXIF не критичен: фото с камер передаём без изменений. */
    @SuppressWarnings("unused")
    private static Bitmap rotate(Bitmap src, float degrees) {
        if (degrees == 0) return src;
        Matrix m = new Matrix();
        m.postRotate(degrees);
        return Bitmap.createBitmap(src, 0, 0, src.getWidth(), src.getHeight(), m, true);
    }
}
