package com.github.rudroid.widget.shortcuts.viewmodel;

import android.app.Application;
import androidx.lifecycle.a1;
import b6.q0;
import com.github.rudroid.utilities.ui.g1;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import oa.m;
import v71.q1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends androidx.lifecycle.a {
    public q1 A;
    public final com.github.rudroid.widget.shortcuts.g t;
    public final tm.c u;
    public final qe.a v;
    public final ArrayList w;
    public final z5.k x;
    public final y1 y;
    public final y1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Application application, m mVar, a1 a1Var, com.github.rudroid.widget.shortcuts.g gVar, tm.c cVar, qe.a aVar) {
        super(application);
        a aVar2;
        a aVar3;
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(gVar, "preferences");
        k71.k.g(cVar, "fetchLocalShortcutsUseCase");
        this.t = gVar;
        this.u = cVar;
        this.v = aVar;
        this.w = mVar.e();
        Integer num = (Integer) a1Var.a("appWidgetId");
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == -1) {
                aVar3 = new a();
            } else {
                try {
                    aVar3 = new q0(application).b(intValue);
                } catch (Exception unused) {
                    aVar3 = null;
                }
            }
            aVar2 = aVar3;
        } else {
            aVar2 = null;
        }
        this.x = aVar2;
        y1 c = n1.c(new b(aVar2, null, this.w, null, g1.a.c(g1.Companion), 0.0f));
        this.y = c;
        this.z = c;
        if (aVar2 != null) {
            th.a.a(this, null, this.v, new c(this, null), 27);
        }
    }

    public final void Q(float f) {
        y1 y1Var = this.y;
        b a = b.a((b) y1Var.getValue(), null, null, null, f, 31);
        y1Var.getClass();
        y1Var.k((Object) null, a);
    }

    public final void R() {
        q1 q1Var = this.A;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        oa.j jVar = ((b) this.y.getValue()).b;
        if (jVar != null) {
            this.A = th.a.a(this, null, this.v, new e(this, jVar, null), 27);
        }
    }

}
