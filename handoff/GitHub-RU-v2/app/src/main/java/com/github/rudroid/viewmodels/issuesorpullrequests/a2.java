package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.rudroid.viewmodels.y7;
import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.IssueOrPullRequestViewModel$uiModel$7", f = "IssueOrPullRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class a2 extends c71.j implements j71.g {
    public /* synthetic */ w61.q v;
    public /* synthetic */ w61.q w;
    public /* synthetic */ com.github.rudroid.utilities.ui.g1 x;
    public final /* synthetic */ l y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(l lVar, a71.c cVar) {
        super(4, cVar);
        this.y = lVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        a2 a2Var = new a2(this.y, (a71.c) obj4);
        a2Var.v = (w61.q) obj;
        a2Var.w = (w61.q) obj2;
        a2Var.x = (com.github.rudroid.utilities.ui.g1) obj3;
        return a2Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.ui.g1 h;
        w61.q qVar = this.v;
        w61.q qVar2 = this.w;
        final com.github.rudroid.utilities.ui.g1 g1Var = this.x;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        List list = (List) qVar.r;
        com.github.rudroid.utilities.ui.g1 g1Var2 = (com.github.rudroid.utilities.ui.g1) qVar.s;
        final d6 d6Var = (d6) qVar.t;
        final a6 a6Var = (a6) qVar2.r;
        final m01.b bVar = (m01.b) qVar2.s;
        final y7 y7Var = (y7) qVar2.t;
        boolean z = g1Var2 instanceof com.github.rudroid.utilities.ui.n0;
        final l lVar = this.y;
        if (z) {
            final int i = 0;
            h = com.github.rudroid.utilities.ui.h1.h(g1Var2, new j71.c() { // from class: com.github.rudroid.viewmodels.issuesorpullrequests.z1
                public final Object k(Object obj2) {
                    switch (i) {
                        case 0:
                            return l.R(lVar, (yz0.i2) obj2, d6Var, a6Var, bVar, y7Var, (tz0.b) g1Var.getData());
                        default:
                            return l.R(lVar, (yz0.i2) obj2, d6Var, a6Var, bVar, y7Var, (tz0.b) g1Var.getData());
                    }
                }
            });
        } else if (g1Var2.getData() == null) {
            com.github.rudroid.utilities.ui.g1.Companion.getClass();
            h = new com.github.rudroid.utilities.ui.u0(list);
        } else {
            final int i2 = 1;
            h = com.github.rudroid.utilities.ui.h1.h(g1Var2, new j71.c() { // from class: com.github.rudroid.viewmodels.issuesorpullrequests.z1
                public final Object k(Object obj2) {
                    switch (i2) {
                        case 0:
                            return l.R(lVar, (yz0.i2) obj2, d6Var, a6Var, bVar, y7Var, (tz0.b) g1Var.getData());
                        default:
                            return l.R(lVar, (yz0.i2) obj2, d6Var, a6Var, bVar, y7Var, (tz0.b) g1Var.getData());
                    }
                }
            });
        }
        lVar.X.getClass();
        return new g(h, com.github.rudroid.issueorpullrequest.q1.a(bVar));
    }
}
