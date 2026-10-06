package v00;

import a61.u0;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import java.util.List;
import jo.mi0;
import t00.q6;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements z01.i, mi0 {
    public v71.v r;
    public l81.n s;
    public g61.a t;
    public i u;

    public v(q81.u uVar, v71.v vVar, com.github.service.wrapper.b bVar, oa.h hVar, oa.j jVar) {
        k71.k.g(uVar, "okHttpClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(hVar, "tokenManager");
        this.r = vVar;
        l81.n q = d5.q(new n(0));
        this.s = q;
        t71.n nVar = q81.q.d;
        this.t = a.a.g(q, i4.V("application/json"));
        this.u = new i(uVar, bVar, hVar, jVar);
    }

    public final y71.i a(String str, String str2, xn.e0 e0Var, List list) {
        k71.k.g(str2, "messageId");
        return n1.y(in.rShadow.l(d11.b.b(d11.a.t, new ja.d(this, str, str2, e0Var, list, (a71.c) null, 1))), this.r);
    }

    public final y71.i b(String str) {
        return n1.y(new nm.g(d11.b.b(d11.a.t, new q(this, str, null, 1)), 9), this.r);
    }

    public final y71.i c(String str) {
        return n1.y(d11.b.b(d11.a.t, new q(this, str, null, 2)), this.r);
    }

    public final y71.i d() {
        return n1.y(new nm.g(d11.b.b(d11.a.t, new p(this, null, 1)), 10), this.r);
    }

    public final y71.i e(String str) {
        return n1.y(in.rShadow.l(d11.b.b(d11.a.t, new q(this, str, null, 0))), this.r);
    }

    public final y71.i f(String str, String str2, String str3, String str4, List list, List list2) {
        k71.k.g(str, "threadId");
        k71.k.g(str2, "content");
        k71.k.g(list, "references");
        k71.k.g(list2, "confirmations");
        return n1.y(d11.b.a(new q6(new y00.l(n1.h(new u0(this, str, list, list2, str2, str3, str4, (a71.c) null, 2)), 10), 26), (j71.c) null, 3), this.r);
    }

    public final y71.i g() {
        return n1.y(new nm.g(d11.b.b(d11.a.t, new p(this, null, 0)), 8), this.r);
    }

    public final Object h() {
        return this;
    }
}
