package com.github.rudroid.settings.copilot.managesubscription;

import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 extends k1 {
    public final com.github.rudroid.activities.util.c s;
    public final nj.d0 t;
    public final com.github.rudroid.copilot.inapppurchase.usecases.f0 u;
    public final y1 v;
    public final i1 w;
    public q1 x;

    public b0(com.github.rudroid.activities.util.c cVar, nj.d0 d0Var, com.github.rudroid.copilot.inapppurchase.usecases.f0 f0Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(d0Var, "observeViewerCopilotPermissionsUseCase");
        k71.k.g(f0Var, "fetchSubscriptionManagementDataUseCase");
        this.s = cVar;
        this.t = d0Var;
        this.u = f0Var;
        y1 c = n1.c(g1.a.c(g1.Companion));
        this.v = c;
        this.w = new i1(c);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new v(this, null), 3);
    }

    public final void P() {
        y1 y1Var = this.v;
        cg.b bVar = (cg.b) ((g1) y1Var.getValue()).getData();
        if (bVar != null) {
            w0.p(y1Var, cg.b.a(bVar, null));
        }
    }
}
