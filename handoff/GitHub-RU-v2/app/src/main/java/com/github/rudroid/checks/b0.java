package com.github.rudroid.checks;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.ui.u0;
import com.github.rudroid.viewmodels.v3;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 extends k1 implements v3, com.github.rudroid.utilities.viewmodel.b {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f8752s;

    /* renamed from: t, reason: collision with root package name */
    public final dj.b f8753t;

    /* renamed from: u, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f8754u;

    /* renamed from: v, reason: collision with root package name */
    public final y1 f8755v;

    /* renamed from: w, reason: collision with root package name */
    public final a0 f8756w;

    /* renamed from: x, reason: collision with root package name */
    public x01.i f8757x;

    /* renamed from: y, reason: collision with root package name */
    public String f8758y;

    public b0(oa.m mVar, a1 a1Var, dj.b bVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(bVar, "fetchChecksUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f8752s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f8753t = bVar;
        this.f8754u = cVar;
        g1.Companion.getClass();
        y1 c10 = n1.c(new u0(x61.r.r));
        this.f8755v = c10;
        this.f8756w = new a0(new i1(c10), this);
        this.f8757x = new x01.i((String) null, false, true);
        this.f8758y = "";
    }

    public final void D() {
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new x(this, null), 3);
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f8752s.a(g1Var, bVar, z10);
    }

    public final boolean a() {
        return h1.g((g1) this.f8755v.getValue()) && this.f8757x.a();
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a0 {
        public a0() {
        }
    }
}
