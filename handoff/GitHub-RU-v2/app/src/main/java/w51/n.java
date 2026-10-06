package w51;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.concurrent.Future;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements Closeable {
    public URL r;
    public volatile Future s;
    public w21.o t;

    public n(URL url) {
        this.r = url;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.cancel(true);
    }

    public final Bitmap f() {
        boolean isLoggable = Log.isLoggable("FirebaseMessaging", 4);
        URL url = this.r;
        if (isLoggable) {
            Objects.toString(url);
        }
        URLConnection openConnection = url.openConnection();
        if (openConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = openConnection.getInputStream();
        try {
            byte[] y = sy.r.y(new d(inputStream));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable("FirebaseMessaging", 2)) {
                int length = y.length;
                Objects.toString(url);
            }
            if (y.length > 1048576) {
                throw new IOException("Image exceeds max size of 1048576");
            }
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(y, 0, y.length);
            if (decodeByteArray != null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Objects.toString(url);
                }
                return decodeByteArray;
            }
            throw new IOException("Failed to decode image: " + url);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public n(Object... a) {
    }
}
