package com.github.rudroid.shortcuts;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.shortcuts.navigation.ShortcutViewRoute;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w extends k1 {
    public tm.i s;
    public com.github.rudroid.activities.util.c t;
    public ShortcutViewRoute u;
    public y1 v;
    public i1 w;

    public w(a1 a1Var, tm.b bVar, tm.i iVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(bVar, "fetchLocalShortcutUseCase");
        k71.k.g(iVar, "removeShortcutUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = iVar;
        this.t = cVar;
        this.u = (ShortcutViewRoute) sy.y.m(a1Var, k71.xShadow.a(ShortcutViewRoute.class), x61.s.r);
        y1 s = com.github.rudroid.m0.s(fl.f.Companion, (Object) null);
        this.v = s;
        this.w = new i1(s);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new t(bVar, this, null), 3);
    }

    public final y1 P() {
        fl.f.Companion.getClass();
        y1 c = n1Shadow.c(fl.e.b(w61.a0.a));
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0Shadow) null, new v(this, c, null), 3);
        return c;
    }
}
