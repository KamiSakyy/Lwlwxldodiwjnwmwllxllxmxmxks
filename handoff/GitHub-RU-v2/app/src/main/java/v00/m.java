package v00;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import jo.mi0;
import t00.ua;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements z01.h, mi0 {
    public v71.v r;
    public g61.a s;
    public i t;

    public m(q81.u uVar, v71.v vVar, com.github.service.wrapper.b bVar, oa.h hVar, oa.j jVar) {
        k71.k.g(uVar, "okHttpClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(hVar, "tokenManager");
        this.r = vVar;
        l81.n q = d5.q(new ua(29));
        t71.n nVar = q81.q.d;
        this.s = a.a.g(q, i4.V("application/json"));
        this.t = new i(uVar, bVar, hVar, jVar);
    }

    public final y71.i a(String str) {
        return n1.y(in.rShadow.l(d11.b.b(d11.a.t, new a10.b(this, str, null, 10))), this.r);
    }

    public final y71.i b() {
        return n1.y(new nm.g(d11.b.b(d11.a.t, new k(this, null, 1)), 7), this.r);
    }

    public final y71.i c() {
        return n1.y(new nm.g(d11.b.b(d11.a.t, new k(this, null, 0)), 6), this.r);
    }

    public final Object h() {
        return this;
    }
}
