package u31;

import android.content.Context;
import com.github.domain.searchandfilter.filters.data.ReviewRequestedFilter;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.z6;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes4.dex */
public class f implements b91.l, bm.k, com.google.android.gms.measurement.internal.x, d51.e, k21.d {
    public static final /* synthetic */ f s = new f(3);
    public static final /* synthetic */ f t = new f(4);
    public static final /* synthetic */ f u = new f(5);
    public final /* synthetic */ int r;

    public /* synthetic */ f(int i) {
        this.r = i;
    }

    public static d51.b d(c21.j jVar) {
        return new d51.b(System.currentTimeMillis() + 3600000, new p81.a(8), new d51.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static ShortcutType g(String str) {
        ShortcutType shortcutType;
        k71.k.g(str, "value");
        ShortcutType.Companion.getClass();
        ShortcutType[] values = ShortcutType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                shortcutType = null;
                break;
            }
            shortcutType = values[i];
            if (k71.k.b(shortcutType.getValue(), str)) {
                break;
            }
            i++;
        }
        return shortcutType == null ? ShortcutType.ISSUE : shortcutType;
    }

    public boolean a(SSLSocket sSLSocket) {
        return t71.w.F(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    public b91.n b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new b91.e(cls2);
    }

    @Override // com.google.android.gms.measurement.internal.x
    public Object c() {
        switch (this.r) {
            case 3:
                List list = com.google.android.gms.measurement.internal.c0.a;
                z6.s.get();
                Long l = (Long) b7.J.b();
                l.getClass();
                return l;
            case 4:
                List list2 = com.google.android.gms.measurement.internal.c0.a;
                j8.s.get();
                Long l2 = (Long) l8.e.b();
                l2.getClass();
                return l2;
            default:
                List list3 = com.google.android.gms.measurement.internal.c0.a;
                z6.s.get();
                return Integer.valueOf((int) ((Long) b7.i0.b()).longValue());
        }
    }

    @Override // d51.e
    public d51.b e(c21.j jVar, JSONObject jSONObject) {
        return d(jVar);
    }

    @Override // k21.d
    public k21.c f(Context context, String str, k21.b bVar) {
        k21.c cVar = new k21.c();
        cVar.a = bVar.b(context, str);
        int i = 1;
        int a = bVar.a(context, str, true);
        cVar.b = a;
        int i2 = cVar.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                cVar.c = i;
                return cVar;
            }
        }
        if (i2 >= a) {
            i = -1;
        }
        cVar.c = i;
        return cVar;
    }

    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        boolean z;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            z = ((Boolean) bVar.a(str, k81.g.a)).booleanValue();
        } else {
            z = false;
        }
        return new ReviewRequestedFilter(z);
    }
}
