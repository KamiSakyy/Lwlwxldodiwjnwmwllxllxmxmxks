package com.github.rudroid.settings.copilot;

import androidx.lifecycle.k1;
import com.github.rudroid.copilot.inapppurchase.usecases.r0;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import java.util.concurrent.CancellationException;
import nj.d1;
import v71.q1;
import xn.e1;
import xn.g4;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends k1 {
    public static final a Companion = new a();
    public y1 A;
    public y1 B;
    public y1 C;
    public y1 D;
    public y1 E;
    public i1 F;
    public q1 G;
    public q1 H;
    public q1 I;
    public com.github.rudroid.copilot.preferences.k s;
    public nj.d0 t;
    public com.github.rudroid.copilot.preferences.n u;
    public com.github.rudroid.copilot.inapppurchase.usecases.d v;
    public d1 w;
    public r0 x;
    public com.github.rudroid.activities.util.c y;
    public qe.a z;

    public static final class a {
    }

    public o(com.github.rudroid.copilot.preferences.k kVar, nj.d0 d0Var, com.github.rudroid.copilot.preferences.n nVar, com.github.rudroid.copilot.inapppurchase.usecases.d dVar, d1 d1Var, r0 r0Var, com.github.rudroid.activities.util.c cVar, qe.a aVar) {
        k71.k.g(kVar, "observeCopilotChatPreferencesUseCase");
        k71.k.g(d0Var, "observeViewerCopilotPermissionsUseCase");
        k71.k.g(nVar, "setIsCopilotEnabledByUserUseCase");
        k71.k.g(dVar, "fetchCopilotMonthlyLicenseDetailsUseCase");
        k71.k.g(d1Var, "subscribeUserToCopilotLimitedUseCase");
        k71.k.g(r0Var, "getActivePlayStoreSubscriptionsUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = kVar;
        this.t = d0Var;
        this.u = nVar;
        this.v = dVar;
        this.w = d1Var;
        this.x = r0Var;
        this.y = cVar;
        this.z = aVar;
        y71.i c = n1Shadow.c(new com.github.rudroid.copilot.preferences.f((String) null, true));
        this.A = c;
        y71.i c2 = n1Shadow.c(new g4(255, false, false));
        this.B = c2;
        y71.i c3 = n1Shadow.c(new eg.a());
        this.C = c3;
        g1.a aVar2 = g1.Companion;
        Boolean bool = Boolean.FALSE;
        aVar2.getClass();
        y71.i c4 = n1Shadow.c(new t1(bool));
        this.D = c4;
        y71.i c5 = n1Shadow.c(x61.rShadow.r);
        this.E = c5;
        y71.d1 d1Var2 = new y71.d1(new y71.i[]{c, c2, c3, c4, c5}, new p(this, null));
        v6.a k = androidx.lifecycle.d1.k(this);
        g1.a aVar3 = g1.Companion;
        Boolean bool2 = Boolean.FALSE;
        aVar3.getClass();
        this.F = n1Shadow.G(d1Var2, k, y71.q1.a, new eg.c(new t1(bool2), (2 & 1023) != 0 ? e1.s : null, x61.rShadow.r, (1023 & 8) == 0, false, (1023 & 32) == 0, (1023 & 64) != 0 ? "" : "octocat", null, new eg.a(), false));
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new x(this, null), 3);
    }

    public final void P(oa.j jVar) {
        k71.k.g(jVar, "user");
        q1 q1Var = this.H;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        if (jVar.f(com.github.rudroid.common.a.L)) {
            this.H = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new a0(this, jVar, null), 3);
        }
    }

}
