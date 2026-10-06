package com.github.rudroid.widget.shortcuts;

import com.github.rudroid.widget.shortcuts.a0;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;
import com.google.android.gms.internal.measurement.i4;
import kotlin.NoWhenBranchMatchedException;
import yz0.d3;
import yz0.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class x implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ y1 s;
    public final /* synthetic */ m6.e t;
    public final /* synthetic */ m6.e u;

    public /* synthetic */ x(y1 y1Var, m6.e eVar, m6.e eVar2, int i) {
        this.r = i;
        this.s = y1Var;
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
                y1 y1Var = this.s;
                IssueState issueState = y1Var.o;
                CloseReason closeReason = y1Var.q;
                int b = qh.a.b(issueState, closeReason);
                int i = a0.a.b[issueState.ordinal()];
                if (i == 1) {
                    aVar = com.github.rudroid.widget.k.i;
                } else if (i == 2) {
                    aVar = (closeReason == CloseReason.NotPlanned || closeReason == CloseReason.Duplicate) ? com.github.rudroid.widget.k.o : com.github.rudroid.widget.k.m;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = com.github.rudroid.widget.k.kShadow;
                }
                sy.rShadow.a(new z5.a(b), k41.b.M(ih.a.N), 0, new z5.d(new z5.q(aVar)), sVar, 32816, 8);
                m7.y.f(k41.b.c0(ih.a.l), sVar, 0);
                com.google.common.util.concurrent.a.a((z5.n) null, 0, 0, r1.i.d(1476517031, new x(y1Var, this.t, this.u, 1), sVar), sVar, 3072, 7);
                break;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.g) obj, "$this$Column");
                y1 y1Var2 = this.s;
                d3 d3Var = y1Var2.f;
                m71.a.d(i4.q0(2131953412, new Object[]{d3Var.a, d3Var.b, Integer.valueOf(y1Var2.l)}, sVar2), (z5.n) null, this.t, 1, sVar2, 3072, 2);
                m71.a.d(y1Var2.b, (z5.n) null, this.u, 2, sVar2, 3072, 2);
                break;
        }
        return w61.a0.a;
    }
}
