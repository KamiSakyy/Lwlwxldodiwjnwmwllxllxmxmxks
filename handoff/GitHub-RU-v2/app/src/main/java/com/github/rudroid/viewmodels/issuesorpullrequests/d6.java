package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.rudroid.utilities.ui.g1;
import zd.b;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d6 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final com.github.rudroid.utilities.ui.g1 e;
    public final zd.b f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final com.github.rudroid.utilities.ui.g1 m;

    public d6(boolean z, boolean z2, boolean z3, boolean z4, com.github.rudroid.utilities.ui.g1 g1Var, zd.b bVar, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z11, com.github.rudroid.utilities.ui.g1 g1Var2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = g1Var;
        this.f = bVar;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z11;
        this.m = g1Var2;
    }

    public static d6 a(d6 d6Var, boolean z, boolean z2, boolean z3, com.github.rudroid.utilities.ui.g1 g1Var, zd.b bVar, boolean z4, boolean z5, com.github.rudroid.utilities.ui.g1 g1Var2, int i) {
        boolean z6 = (i & 1) != 0 ? d6Var.a : true;
        boolean z7 = (i & 2) != 0 ? d6Var.b : z;
        boolean z8 = (i & 4) != 0 ? d6Var.c : z2;
        boolean z9 = (i & 8) != 0 ? d6Var.d : z3;
        d6Var.getClass();
        d6Var.getClass();
        com.github.rudroid.utilities.ui.g1 g1Var3 = (i & 64) != 0 ? d6Var.e : g1Var;
        zd.b bVar2 = (i & 128) != 0 ? d6Var.f : bVar;
        boolean z11 = d6Var.g;
        boolean z12 = d6Var.h;
        boolean z13 = (i & 1024) != 0 ? d6Var.i : z4;
        boolean z14 = (i & 2048) != 0 ? d6Var.j : z5;
        boolean z15 = (i & 4096) != 0 ? d6Var.k : true;
        boolean z16 = (i & 8192) != 0 ? d6Var.l : true;
        com.github.rudroid.utilities.ui.g1 g1Var4 = (i & 16384) != 0 ? d6Var.m : g1Var2;
        d6Var.getClass();
        k71.k.g(g1Var3, "mergeBoxActionState");
        k71.k.g(bVar2, "mergeBoxUiState");
        k71.k.g(g1Var4, "copilotRequestReviewState");
        return new d6(z6, z7, z8, z9, g1Var3, bVar2, z11, z12, z13, z14, z15, z16, g1Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6)) {
            return false;
        }
        d6 d6Var = (d6) obj;
        return this.a == d6Var.a && this.b == d6Var.b && this.c == d6Var.c && this.d == d6Var.d && k71.k.b(this.e, d6Var.e) && k71.k.b(this.f, d6Var.f) && this.g == d6Var.g && this.h == d6Var.h && this.i == d6Var.i && this.j == d6Var.j && this.k == d6Var.k && this.l == d6Var.l && k71.k.b(this.m, d6Var.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e((this.f.hashCode() + ((this.e.hashCode() + x.i.e(x.i.e(x.i.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 29791, this.d)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder u = com.github.rudroid.copilot.h1.u("UserViewConfiguration(isPullRequestBodyExpanded=", this.a, ", isChecksExpanded=", this.b, ", isReviewsExpanded=");
        com.github.rudroid.m0.A(u, this.c, ", isDeleteRefPending=", this.d, ", mergeQueueOption=null, overrideUpdateBranchOption=null, mergeBoxActionState=");
        u.append(this.e);
        u.append(", mergeBoxUiState=");
        u.append(this.f);
        u.append(", mergeBoxDiscrepanciesEnabled=");
        com.github.rudroid.m0.A(u, this.g, ", consolidatedStatusChecksEnabled=", this.h, ", copilotReviewBannerDismissed=");
        com.github.rudroid.m0.A(u, this.i, ", copilotCodingAgentBannerDismissed=", this.j, ", copilotReviewBannerDismissedStateLoaded=");
        com.github.rudroid.m0.A(u, this.k, ", copilotCodingAgentBannerDismissedStateLoaded=", this.l, ", copilotRequestReviewState=");
        u.append(this.m);
        u.append(")");
        return u.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ d6(boolean z, boolean z2) {
        this(false, false, false, false, r6, b.c.a, z, z2, true, true, false, false, g1.a.a());
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        aVar.getClass();
        com.github.rudroid.utilities.ui.h0 a = g1.a.a();
        aVar.getClass();
    }

    public Object i;
}
