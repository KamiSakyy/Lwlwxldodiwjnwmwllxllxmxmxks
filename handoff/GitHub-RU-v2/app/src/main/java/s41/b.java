package s41;

import java.util.concurrent.atomic.AtomicReference;
import p41.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public static final a c = new a();
    public final m a;
    public final AtomicReference b = new AtomicReference(null);

    public b(m mVar) {
        this.a = mVar;
        mVar.a(new c5.b(23, this));
    }

    public final a a(String str) {
        b bVar = (b) this.b.get();
        return bVar == null ? c : bVar.a(str);
    }

    public final boolean b() {
        b bVar = (b) this.b.get();
        return bVar != null && bVar.b();
    }

    public final boolean c(String str) {
        b bVar = (b) this.b.get();
        return bVar != null && bVar.c(str);
    }
}
