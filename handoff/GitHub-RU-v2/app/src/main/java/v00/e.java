package v00;

import java.util.LinkedHashSet;
import jo.mi0;
import jo.q80;
import jo.wo;
import m10.sa0;
import t00.g3;
import t00.h7;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements z01.k, mi0 {
    public com.github.service.wrapper.j r;
    public com.github.service.wrapper.b s;
    public v71.v t;

    public e(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v71.v vVar) {
        k71.k.g(jVar, "client");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(vVar, "ioDispatcher");
        this.r = jVar;
        this.s = bVar;
        this.t = vVar;
    }

    public final y71.i a() {
        return n1.y(new h7(com.github.service.wrapper.b.a(this.s, new wo(), ga.h.r, false, (LinkedHashSet) null, 56), 20), this.t);
    }

    public final y71.i b() {
        return n1.y(new g3(in.rShadow.h(this.r.d(new q80(new sa0()))), 22), this.t);
    }

    public final Object h() {
        return this;
    }
}
