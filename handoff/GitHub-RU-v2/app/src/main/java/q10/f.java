package q10;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import k71.k;
import oa.h;
import oa.j;
import oa.m;
import q81.t;
import q81.u;
import sy.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends oa.c {
    public final u b;
    public final m c;
    public final h d;
    public final vz0.c e;

    public f(u uVar, m mVar, h hVar, vz0.c cVar) {
        k.g(uVar, "unauthenticatedClient");
        k.g(mVar, "userManager");
        k.g(hVar, "tokenManager");
        k.g(cVar, "loopAction");
        this.b = uVar;
        this.c = mVar;
        this.d = hVar;
        this.e = cVar;
        w.t(new ma.a(13, this));
    }

    public final Object b(j jVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String host = Uri.parse(jVar.a()).getHost();
        if (host != null) {
            linkedHashSet.add(host);
        }
        String host2 = Uri.parse(com.google.common.util.concurrent.a.w(jVar)).getHost();
        if (host2 != null) {
            linkedHashSet.add(host2);
        }
        String host3 = Uri.parse(com.google.common.util.concurrent.a.u(jVar)).getHost();
        if (host3 != null) {
            linkedHashSet.add(host3);
        }
        t a = this.b.a();
        a.c.add(new e(this, jVar, linkedHashSet));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a.b(30L, timeUnit);
        a.a(30L, timeUnit);
        a.y = r81.g.b("timeout", 30L, timeUnit);
        return new u(a);
    }



}
