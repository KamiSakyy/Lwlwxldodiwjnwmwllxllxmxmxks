package v00;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import f1.hc;
import java.util.List;
import java.util.Map;
import jo.mi0;
import xn.g1;
import y71.n1Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 implements z01.l, mi0 {
    public v71.v r;
    public g61.a s;
    public i t;

    public g0(q81.u uVar, v71.v vVar, com.github.service.wrapper.b bVar, oa.h hVar, oa.j jVar) {
        k71.k.g(uVar, "okHttpClient");
        k71.k.g(vVar, "ioDispatcher");
        k71.k.g(bVar, "cachedClient");
        k71.k.g(hVar, "tokenManager");
        this.r = vVar;
        l81.n q = d5.q(new n(1));
        t71.n nVar = q81.q.d;
        this.s = a.a.g(q, i4.V("application/json"));
        this.t = new i(uVar, bVar, hVar, jVar);
    }

    public final y71.i a(String str, String str2, List list) {
        k71.k.g(str, "taskId");
        k71.k.g(str2, "content");
        return n1.y(d11.b.b(d11.b.a, new n5.v(this, str, str2, list, (a71.c) null, 5)), this.r);
    }

    public final y71.i b(String str) {
        k71.k.g(str, "taskId");
        return n1.y(d11.b.b(d11.b.a, new w(this, str, null, 0)), this.r);
    }

    public final y71.i c(String str, String str2, String str3, boolean z) {
        k71.k.g(str, "taskId");
        k71.k.g(str3, "answer");
        return n1.y(d11.b.b(d11.b.a, new e0(this, str, str2, str3, z, (a71.c) null)), this.r);
    }

    public final y71.i d(String str) {
        k71.k.g(str, "taskId");
        return n1.y(new nm.g(d11.b.b(d11.b.a, new w(this, str, null, 1)), 12), this.r);
    }

    public final y71.i e(int i, String str, int i2) {
        return n1.y(new c0(d11.b.b(d11.b.a, new d0(this, str, i, i2, null)), i, i2), this.r);
    }

    public final y71.i f(String str) {
        k71.k.g(str, "sessionId");
        return n1.y(new nm.g(d11.b.b(d11.b.a, new w(this, str, null, 2)), 13), this.r);
    }

    public final y71.i g(String str, String str2, boolean z, String str3, Boolean bool, String str4) {
        k71.k.g(str, "taskId");
        return n1.y(d11.b.b(d11.b.a, new f0(this, str, str2, z, str3, bool, str4, null)), this.r);
    }

    public final Object h() {
        return this;
    }

    public final y71.i i(String str, String str2) {
        k71.k.g(str, "taskId");
        k71.k.g(str2, "message");
        return n1.y(d11.b.b(d11.b.a, new hc(this, str, str2, (a71.c) null, 4)), this.r);
    }

    public final y71.i j(String str, String str2, g1 g1Var, Map map) {
        k71.k.g(str, "taskId");
        return n1.y(d11.b.b(d11.b.a, new ja.d(this, str, str2, g1Var, map, (a71.c) null, 2)), this.r);
    }

    public final y71.i k(String str, String str2, String str3, boolean z) {
        k71.k.g(str, "taskId");
        return n1.y(d11.b.b(d11.b.a, new e0(this, str, str2, z, str3, (a71.c) null)), this.r);
    }

    public final y71.i l(String str, String str2, String str3) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "taskId");
        return n1.y(new nm.g(d11.b.b(d11.b.a, new n5.v(this, str, str2, str3, (a71.c) null, 4)), 11), this.r);
    }
}
