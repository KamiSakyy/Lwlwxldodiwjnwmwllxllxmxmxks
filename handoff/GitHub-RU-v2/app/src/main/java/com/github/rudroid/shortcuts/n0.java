package com.github.rudroid.shortcuts;

import android.app.Application;
import androidx.lifecycle.d1;
import java.util.ArrayList;
import java.util.Collection;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 extends androidx.lifecycle.a {
    public final y1 A;
    public final i1 B;
    public q1 C;
    public final e0 t;
    public final tm.d u;
    public final tm.g v;
    public final tm.c w;
    public final tm.k x;
    public final com.github.rudroid.activities.util.c y;
    public final y1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Application application, e0 e0Var, tm.d dVar, tm.g gVar, tm.c cVar, tm.k kVar, com.github.rudroid.activities.util.c cVar2) {
        super(application);
        k71.k.g(e0Var, "shortcutsOverviewParser");
        k71.k.g(dVar, "fetchPredefinedSuggestionsUseCase");
        k71.k.g(gVar, "generateUserSuggestionsUseCase");
        k71.k.g(cVar, "fetchLocalShortcutsUseCase");
        k71.k.g(kVar, "setShortcutsUseCase");
        k71.k.g(cVar2, "accountHolder");
        this.t = e0Var;
        this.u = dVar;
        this.v = gVar;
        this.w = cVar;
        this.x = kVar;
        this.y = cVar2;
        x61.r rVar = x61.r.r;
        this.z = n1.c(rVar);
        fl.f.Companion.getClass();
        y1 c = n1.c(fl.e.b(rVar));
        this.A = c;
        this.B = new i1(c);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new i0(this, null), 3);
    }

    public final void Q(wm.b bVar) {
        k71.k.g(bVar, "shortcut");
        y1 y1Var = this.z;
        y1Var.k((Object) null, x61.m.m0((Collection) y1Var.getValue(), bVar));
    }

    public final void R(wm.b bVar, wm.b bVar2) {
        k71.k.g(bVar, "old");
        k71.k.g(bVar2, "new");
        y1 y1Var = this.z;
        Iterable<wm.b> iterable = (Iterable) y1Var.getValue();
        ArrayList arrayList = new ArrayList(x61.n.F(iterable, 10));
        for (wm.b bVar3 : iterable) {
            if (k71.k.b(bVar3, bVar)) {
                bVar3 = bVar2;
            }
            arrayList.add(bVar3);
        }
        y1Var.getClass();
        y1Var.k((Object) null, arrayList);
    }

    public final y1 S() {
        fl.f.Companion.getClass();
        y1 c = n1.c(fl.e.b(w61.a0.a));
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new m0(this, c, null), 3);
        return c;
    }
}
