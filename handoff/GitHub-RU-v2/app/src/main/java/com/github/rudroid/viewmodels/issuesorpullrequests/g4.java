package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.rudroid.viewmodels.issuesorpullrequests.w2;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$observeBannerDisplayState$1$displayedBannerState$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g4 extends c71.j implements j71.f {
    public /* synthetic */ com.github.rudroid.utilities.ui.g1 v;
    public /* synthetic */ d6 w;

    public final Object f(Object obj, Object obj2, Object obj3) {
        g4 g4Var = new g4(3, (a71.c) obj3);
        g4Var.v = (com.github.rudroid.utilities.ui.g1) obj;
        g4Var.w = (d6) obj2;
        return g4Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.ui.g1 g1Var = this.v;
        d6 d6Var = this.w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        yz0.i2 i2Var = (yz0.i2) g1Var.getData();
        if (!(g1Var instanceof com.github.rudroid.utilities.ui.t1) || i2Var == null) {
            return null;
        }
        if (vd.a.a(i2Var, d6Var)) {
            return w2.b.u;
        }
        if (wd.b.a(i2Var, d6Var)) {
            return w2.b.t;
        }
        boolean z = i2Var.a0;
        if (z && d6Var.k && d6Var.i) {
            return w2.b.s;
        }
        if (!z && d6Var.l && d6Var.j) {
            return w2.b.s;
        }
        return null;
    }
}
