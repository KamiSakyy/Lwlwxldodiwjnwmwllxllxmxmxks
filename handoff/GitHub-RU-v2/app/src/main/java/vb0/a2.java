package vb0;

import java.util.concurrent.CancellationException;
import u10.lf;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 implements z01.z, y90 {
    public static final y1 Companion = new y1();
    public com.github.service.wrapper.j r;
    public v71.v s;
    public v71.d1 t;

    public a2(com.github.service.wrapper.j jVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = vVar;
    }

    @Override // z01.z
    public final y71.i a(String str, String str2) {
        return y41.t1.S("searchCode", "3.10");
    }

    @Override // z01.z
    public final y71.i b(String str, boolean z) {
        k71.k.g(str, "query");
        v71.d1 d1Var = this.t;
        if (d1Var != null) {
            d1Var.m((CancellationException) null);
        }
        this.t = null;
        return y71.n1.y(new rm0.f3(new y71.y(new com.github.rudroid.d0(this, (a71.c) null, 9), com.github.service.wrapper.a.o(this.r, new lf("type:issue ".concat(str), "type:pr ".concat(str), str, "type:user ".concat(str), "type:org ".concat(str)), null, false, null, null, 62)), 6), this.s);
    }

    public final Object h() {
        return this;
    }
}
