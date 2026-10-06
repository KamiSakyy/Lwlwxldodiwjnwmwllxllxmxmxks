package r41;

import b9.f;
import java.util.Collections;
import java.util.Map;
import k41.g;
import v41.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public p a;

    public c(p pVar) {
        this.a = pVar;
    }

    public static c a() {
        c cVar = (c) g.c().b(c.class);
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public final void b(Throwable th) {
        if (th == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        p pVar = this.a;
        pVar.p.a.a(new f(pVar, th));
    }
}
