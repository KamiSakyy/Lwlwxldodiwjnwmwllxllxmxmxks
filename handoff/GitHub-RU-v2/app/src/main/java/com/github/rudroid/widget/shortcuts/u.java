package com.github.rudroid.widget.shortcuts;

import com.github.rudroid.widget.shortcuts.a0;
import com.github.service.models.response.PullRequestState;
import com.google.android.gms.internal.measurement.i4;
import kotlin.NoWhenBranchMatchedException;
import yz0.d3;
import yz0.j3;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class u implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ j3 s;
    public final /* synthetic */ m6.e t;
    public final /* synthetic */ m6.e u;

    public /* synthetic */ u(j3 j3Var, m6.e eVar, m6.e eVar2, int i) {
        this.r = i;
        this.s = j3Var;
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
                j3 j3Var = this.s;
                PullRequestState pullRequestState = j3Var.q;
                boolean z = j3Var.p;
                boolean z2 = j3Var.t;
                int c = qh.b.c(pullRequestState, z, z2);
                if (z2) {
                    aVar = com.github.rudroid.widget.k.n;
                } else {
                    int i = a0.a.a[pullRequestState.ordinal()];
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
                com.google.common.util.concurrent.a.a((z5.n) null, 0, 0, r1.i.d(-865653753, new u(j3Var, this.t, this.u, 1), sVar), sVar, 3072, 7);
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.g) obj, "$this$Column");
                j3 j3Var2 = this.s;
                d3 d3Var = j3Var2.f;
                m71.a.d(i4.q0(2131953412, new Object[]{d3Var.a, d3Var.b, Integer.valueOf(j3Var2.l)}, sVar2), (z5.n) null, this.t, 1, sVar2, 3072, 2);
                m71.a.d(j3Var2.b, (z5.n) null, this.u, 2, sVar2, 3072, 2);
                break;
        }
        return w61.a0.a;
    }
}
