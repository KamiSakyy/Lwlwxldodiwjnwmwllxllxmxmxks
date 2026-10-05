package nj;

import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 implements oa.g {
    public final oa.g a;
    public final e b;

    public e0(oa.g gVar, e eVar) {
        k71.k.g(gVar, "delegate");
        k71.k.g(eVar, "overrideStore");
        this.a = gVar;
        this.b = eVar;
    }

    public final Object a(oa.j jVar) {
        k71.k.g(jVar, "user");
        return new g0((r1) this.a.a(jVar), this.b);
    }
}
