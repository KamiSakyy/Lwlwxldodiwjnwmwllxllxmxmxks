package s11;

import java.util.concurrent.Executor;
import m11.t;
import w51.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements o11.b {
    public final v61.a a;
    public final v61.a b;
    public final t c;
    public final v61.a d;

    public h(v61.a aVar, v61.a aVar2, t tVar, v61.a aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = tVar;
        this.d = aVar3;
    }

    @Override // v61.a
    public final Object get() {
        return new r((Executor) this.a.get(), (t11.d) this.b.get(), (l51.h) this.c.get(), (u11.b) this.d.get(), 24);
    }
}
