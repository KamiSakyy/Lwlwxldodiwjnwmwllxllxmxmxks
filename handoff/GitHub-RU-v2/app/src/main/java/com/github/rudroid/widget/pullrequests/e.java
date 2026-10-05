package com.github.rudroid.widget.pullrequests;

import a0.d0;
import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f0;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity;
import java.util.List;
import w61.a0;
import z.n0;
import z.s0;
import z.t0;
import z.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.f {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ f1 s;
    public final /* synthetic */ List t;
    public final /* synthetic */ String u;
    public final /* synthetic */ f1 v;

    public /* synthetic */ e(f1 f1Var, List list, String str, f1 f1Var2) {
        this.s = f1Var;
        this.t = list;
        this.u = str;
        this.v = f1Var2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        a0 a0Var = a0.a;
        int i2 = 9;
        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
        boolean z = false;
        f1 f1Var = this.v;
        List<oa.j> list = this.t;
        f1 f1Var2 = this.s;
        switch (i) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                PullRequestsWidgetSettingsActivity.a aVar = PullRequestsWidgetSettingsActivity.Companion;
                k71.k.g((f0) obj, "$this$PrimaryDialog");
                if (sVar.S(intValue & 1, (intValue & 17) != 16)) {
                    e0 a = c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r rVar = w1.o.a;
                    w1.r c = w1.a.c(sVar, rVar);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, v2.g.f, a);
                    androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar, v2.g.h);
                    androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                    sVar.c0(-201259359);
                    for (oa.j jVar : list) {
                        boolean f = sVar.f(f1Var2) | sVar.h(jVar) | sVar.f(f1Var);
                        Object N = sVar.N();
                        Object obj4 = N;
                        if (f || N == iVar) {
                            com.github.rudroid.actions.workflowruns.ui.e eVar = new com.github.rudroid.actions.workflowruns.ui.e(f1Var2, jVar, f1Var, i2);
                            sVar.n0(eVar);
                            obj4 = eVar;
                        }
                        w1.r m = f0.o.m(rVar, false, this.u, (d3.k) null, (j71.a) obj4, 13);
                        w1.r rVar2 = rVar;
                        String str = jVar.c;
                        String d = jVar.d();
                        String b = jVar.b();
                        if (b == null) {
                            b = "";
                        }
                        androidx.compose.runtime.s sVar2 = sVar;
                        com.github.rudroid.accounts.o.a(m, str, d, b, jVar.b, 0, k71.k.b(f1Var2.getValue(), jVar.a), false, jVar.o, sVar2, 12779520, 0);
                        rVar = rVar2;
                        sVar = sVar2;
                        i2 = 9;
                        z = false;
                    }
                    androidx.compose.runtime.s sVar3 = sVar;
                    sVar3.q(z);
                    sVar3.q(true);
                    break;
                } else {
                    sVar.V();
                    break;
                }
            default:
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((m0.b) obj, "$this$item");
                if (sVar4.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean z2 = ((sf.u) f1Var2.getValue()) == sf.u.r;
                    s0 e = n0.e((d0) null, 3);
                    Object N2 = sVar4.N();
                    if (N2 == iVar) {
                        N2 = new s5.a(12);
                        sVar4.n0(N2);
                    }
                    s0 a2 = e.a(n0.c(5, (j71.c) N2));
                    t0 f2 = n0.f((d0) null, 3);
                    Object N3 = sVar4.N();
                    if (N3 == iVar) {
                        N3 = new s5.a(9);
                        sVar4.n0(N3);
                    }
                    x.e(z2, (w1.r) null, a2, f2.a(n0.j(5, (j71.c) N3)), "CommitDiffInformation", r1.i.d(1683952715, new dc.p(list, this.u, f1Var, 3), sVar4), sVar4, 224640, 2);
                    break;
                } else {
                    sVar4.V();
                    break;
                }
        }
        return a0Var;
    }

    public /* synthetic */ e(List list, String str, f1 f1Var, f1 f1Var2) {
        this.t = list;
        this.u = str;
        this.s = f1Var;
        this.v = f1Var2;
    }
}
