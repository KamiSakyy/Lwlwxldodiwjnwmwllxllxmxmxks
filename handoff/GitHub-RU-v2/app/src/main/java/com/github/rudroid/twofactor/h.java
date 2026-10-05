package com.github.rudroid.twofactor;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h extends k1 {
    public static final a Companion = new a();
    public final dn.e s;
    public final dn.g t;
    public final dn.j0 u;
    public final dn.p v;
    public final oa.m w;
    public final y1 x;
    public q1 y;
    public final i1 z;

    public static final class a {
    }

    public h(dn.e eVar, dn.g gVar, dn.j0 j0Var, dn.p pVar, oa.m mVar, a1 a1Var) {
        k71.k.g(eVar, "approveUseCase");
        k71.k.g(gVar, "approveWithoutChallengeUseCase");
        k71.k.g(j0Var, "rejectUseCase");
        k71.k.g(pVar, "fetchAuthRequestsUseCase");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = eVar;
        this.t = gVar;
        this.u = j0Var;
        this.v = pVar;
        this.w = mVar;
        fl.e eVar2 = fl.f.Companion;
        b bVar = new b(null, com.github.rudroid.twofactor.a.r, "");
        eVar2.getClass();
        y1 c = n1.c(fl.e.b(bVar));
        this.x = c;
        f11.b bVar2 = (f11.b) a1Var.a("key_auth_request");
        String str = (String) a1Var.a("key_auth_user");
        oa.j h = str != null ? mVar.h(str) : null;
        fn.a aVar = (bVar2 == null || h == null) ? null : new fn.a(h, bVar2);
        if (aVar == null) {
            v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new p(this, null), 3);
        } else {
            c.k((Object) null, fl.e.c(new b(aVar, com.github.rudroid.twofactor.a.s, "")));
        }
        this.z = new i1(c);
    }

    public final void P() {
        fn.a aVar;
        b bVar;
        String str;
        y1 y1Var = this.x;
        b bVar2 = (b) ((fl.f) y1Var.getValue()).b;
        if (bVar2 != null && (aVar = bVar2.a) != null && (bVar = (b) ((fl.f) y1Var.getValue()).b) != null) {
            com.github.rudroid.twofactor.a aVar2 = bVar.b;
            b bVar3 = (b) ((fl.f) y1Var.getValue()).b;
            Integer G = (bVar3 == null || (str = bVar3.c) == null) ? null : t71.w.G(str);
            boolean z = aVar.b.v;
            if ((!z || G != null) && aVar2 == com.github.rudroid.twofactor.a.s) {
                if (!z || G == null) {
                    q1 q1Var = this.y;
                    if (q1Var == null || !q1Var.f()) {
                        this.y = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new o(this, aVar, new b(aVar, com.github.rudroid.twofactor.a.t, ""), null), 3);
                        return;
                    }
                    return;
                }
                int intValue = G.intValue();
                q1 q1Var2 = this.y;
                if (q1Var2 == null || !q1Var2.f()) {
                    this.y = v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new l(this, aVar, intValue, new b(aVar, com.github.rudroid.twofactor.a.t, String.valueOf(intValue)), null), 3);
                }
            }
        }
    }
}
