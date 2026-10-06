package com.github.rudroid.widget.agenttasks;

import com.github.rudroid.widget.agenttasks.r;
import com.github.service.models.response.PullRequestState;
import com.google.android.gms.internal.measurement.i4;
import kotlin.NoWhenBranchMatchedException;
import yz0.o3;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ com.github.rudroid.widget.agenttasks.model.a s;
    public final /* synthetic */ m6.e t;
    public final /* synthetic */ m6.e u;

    public /* synthetic */ o(com.github.rudroid.widget.agenttasks.model.a aVar, m6.e eVar, m6.e eVar2, int i) {
        this.r = i;
        this.s = aVar;
        this.t = eVar;
        this.u = eVar2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        h6.a aVar;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.q) obj, "$this$Row");
                o3 o3Var = PullRequestState.Companion;
                com.github.rudroid.widget.agenttasks.model.a aVar2 = this.s;
                String str = aVar2.d;
                o3Var.getClass();
                PullRequestState b = o3.b(str);
                boolean z = aVar2.e;
                boolean z2 = aVar2.f;
                int c = qh.b.c(b, z, z2);
                if (z2) {
                    aVar = com.github.rudroid.widget.k.n;
                } else {
                    int i = r.a.a[b.ordinal()];
                    if (i == 1) {
                        aVar = z ? com.github.rudroid.widget.k.kShadow : com.github.rudroid.widget.k.i;
                    } else if (i == 2) {
                        aVar = com.github.rudroid.widget.k.l;
                    } else if (i == 3) {
                        aVar = com.github.rudroid.widget.k.m;
                    } else {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        aVar = com.github.rudroid.widget.k.kShadow;
                    }
                }
                sy.rShadow.a(new z5.a(c), k41.b.M(ih.a.N), 0, new z5.d(new z5.q(aVar)), sVar, 32816, 8);
                m7.y.f(k41.b.c0(ih.a.l), sVar, 0);
                com.google.common.util.concurrent.a.a((z5.n) null, 0, 0, r1.i.d(451786928, new o(aVar2, this.t, this.u, 1), sVar), sVar, 3072, 7);
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.g) obj, "$this$Column");
                com.github.rudroid.widget.agenttasks.model.a aVar3 = this.s;
                m71.a.d(i4.q0(2131953412, new Object[]{aVar3.h, aVar3.i, Integer.valueOf(aVar3.j)}, sVar2), (z5.n) null, this.t, 1, sVar2, 3072, 2);
                m71.a.d(aVar3.a, (z5.n) null, this.u, 2, sVar2, 3072, 2);
                break;
        }
        return w61.a0.a;
    }
}
