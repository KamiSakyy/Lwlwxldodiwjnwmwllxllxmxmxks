package w9;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import r9.t;
import t71.p;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f33452a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f33453b = Bitmap.Config.HARDWARE;

    /* renamed from: c, reason: collision with root package name */
    public static final q81.n f33454c = new q81.n((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || p.T(str)) {
            return null;
        }
        String q02 = p.q0(p.q0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(p.m0('.', p.m0('/', q02, q02), ""));
    }

    public static final t c(View view) {
        t tVar;
        Object tag = view.getTag(2131362106);
        t tVar2 = tag instanceof t ? (t) tag : null;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(2131362106);
                tVar = tag2 instanceof t ? (t) tag2 : null;
                if (tVar == null) {
                    tVar = new t(view);
                    view.addOnAttachStateChangeListener(tVar);
                    view.setTag(2131362106, tVar);
                }
            } finally {
            }
        }
        return tVar;
    }

    public static final boolean d(Uri uri) {
        return k71.k.b(uri.getScheme(), "file") && k71.k.b((String) x61.m.W(uri.getPathSegments()), "android_asset");
    }

    public static final int e(k41.b bVar, s9.g gVar) {
        if (bVar instanceof s9.a) {
            return ((s9.a) bVar).f31765a;
        }
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (ordinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
