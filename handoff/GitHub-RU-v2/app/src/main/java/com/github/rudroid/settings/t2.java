package com.github.rudroid.settings;

import java.util.concurrent.CancellationException;
import xn.g4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t2 extends androidx.lifecycle.k1 {
    public static final a Companion = new a();
    public v71.q1 A;
    public v71.q1 B;
    public v71.q1 C;
    public androidx.lifecycle.p0 D;
    public androidx.lifecycle.p0 E;
    public androidx.lifecycle.p0 F;
    public y71.y1 G;
    public y71.i1 H;
    public com.github.rudroid.notifications.domain.q s;
    public mm.c t;
    public mm.f u;
    public nj.d0 v;
    public com.github.rudroid.settings.copilot.m0 w;
    public com.github.rudroid.copilot.preferences.p x;
    public v71.z y;
    public com.github.rudroid.activities.util.c z;

    public static final class a {
    }

    public t2(com.github.rudroid.notifications.domain.q qVar, mm.c cVar, mm.f fVar, nj.d0 d0Var, com.github.rudroid.settings.copilot.m0 m0Var, com.github.rudroid.copilot.preferences.p pVar, v71.z zVar, com.github.rudroid.activities.util.c cVar2) {
        k71.k.g(qVar, "updateLocalNotificationWorkerStatusUseCase");
        k71.k.g(cVar, "fetchEnterpriseSupportContactUseCase");
        k71.k.g(fVar, "fetchViewerIsStaffUseCase");
        k71.k.g(d0Var, "observeViewerCopilotPermissionsUseCase");
        k71.k.g(pVar, "setIsCopilotUpsellBannerDismissedUseCase");
        k71.k.g(zVar, "applicationScope");
        k71.k.g(cVar2, "accountHolder");
        this.s = qVar;
        this.t = cVar;
        this.u = fVar;
        this.v = d0Var;
        this.w = m0Var;
        this.x = pVar;
        this.y = zVar;
        this.z = cVar2;
        this.D = new androidx.lifecycle.p0();
        this.E = new androidx.lifecycle.p0();
        this.F = new androidx.lifecycle.p0();
        y71.y1 c = y71.n1.c(new g4(255, false, false));
        this.G = c;
        this.H = com.github.rudroid.utilities.w0.f(c, androidx.lifecycle.d1.k(this), new o0(2, this));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new s2(this, null), 3);
    }

    public final void O() {
        this.s.a();
    }

    public final void P() {
        v71.q1 q1Var = this.C;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        if (this.z.d().f(com.github.rudroid.common.a.L)) {
            this.C = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new v2(this, null), 3);
        }
    }
}
