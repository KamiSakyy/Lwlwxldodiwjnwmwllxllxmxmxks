package s61;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final Uri a;
    public final Bitmap b;
    public final Integer c;
    public boolean d;

    public a(Bitmap bitmap) {
        this.b = bitmap;
        this.a = null;
        this.c = null;
        this.d = false;
        bitmap.getWidth();
        bitmap.getHeight();
    }

    public a(Uri uri) {
        String uri2 = uri.toString();
        if (uri2.startsWith("file:///") && !new File(uri2.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(uri2, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        this.b = null;
        this.a = uri;
        this.c = null;
        this.d = true;
    }

    public a(int i) {
        this.b = null;
        this.a = null;
        this.c = Integer.valueOf(i);
        this.d = true;
    }
}
