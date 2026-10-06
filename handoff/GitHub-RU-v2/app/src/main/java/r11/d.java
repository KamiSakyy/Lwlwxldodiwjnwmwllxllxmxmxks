package r11;

import java.util.concurrent.Executor;
import l51.h;
import m11.t;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements o11.b {
    public v61.a a;
    public v61.a b;
    public t c;
    public v61.a d;
    public v61.a e;

    public d(v61.a aVar, v61.a aVar2, t tVar, v61.a aVar3, v61.a aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = tVar;
        this.d = aVar3;
        this.e = aVar4;
    }

    @Override // v61.a
    public final Object get() {
        return new c((Executor) this.a.get(), (n11.e) this.b.get(), (h) this.c.get(), (t11.d) this.d.get(), (u11.b) this.e.get());
    }
}
