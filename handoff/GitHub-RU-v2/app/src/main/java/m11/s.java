package m11;

import a0.s0;
import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public static volatile k e;
    public final v11.a a;
    public final v11.a b;
    public final r11.e c;
    public final d51.d d;

    public s(v11.a aVar, v11.a aVar2, r11.e eVar, d51.d dVar, w51.r rVar) {
        this.a = aVar;
        this.b = aVar2;
        this.c = eVar;
        this.d = dVar;
        ((Executor) rVar.s).execute(new androidx.fragment.app.s(20, rVar));
    }

    public static s a() {
        k kVar = e;
        if (kVar != null) {
            return (s) kVar.w.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (s.class) {
                try {
                    if (e == null) {
                        a7.d dVar = new a7.d();
                        context.getClass();
                        dVar.a = context;
                        e = dVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final q c(l lVar) {
        byte[] bytes;
        Set unmodifiableSet = lVar != null ? Collections.unmodifiableSet(k11.a.d) : Collections.singleton(new j11.c("proto"));
        l51.h a = j.a();
        lVar.getClass();
        a.s = "cct";
        k11.a aVar = (k11.a) lVar;
        String str = aVar.a;
        String str2 = aVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = s0.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a.t = bytes;
        return new q(unmodifiableSet, a.i(), this);
    }
}
