package cn;

import v71.v;
import v71.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends oa.c {
    public final z b;
    public final v c;
    public final qe.a d;

    public a(z zVar, v vVar, qe.a aVar) {
        k71.k.g(zVar, "applicationScope");
        k71.k.g(vVar, "dispatcher");
        this.b = zVar;
        this.c = vVar;
        this.d = aVar;
    }

    public final Object b(oa.j jVar) {
        return new s(this.b, this.c, this.d);
    }
}
