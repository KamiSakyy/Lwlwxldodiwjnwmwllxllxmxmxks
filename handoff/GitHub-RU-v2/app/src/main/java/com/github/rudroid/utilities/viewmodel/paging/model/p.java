package com.github.rudroid.utilities.viewmodel.paging.model;

import com.github.rudroid.utilities.ui.g1;
import java.util.List;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.i1;
import y71.n1;
import y71.w1;

/* loaded from: /home/user/work/p/classes3.dex */
public class p<T> implements r<x<T>>, w<T> {
    public static final a Companion = new a();
    public final j r;
    public final com.github.rudroid.searchandfilter.complexfilter.i0 s;

    public static final class a {
    }

    public p(j jVar, a0.m0 m0Var, com.github.rudroid.searchandfilter.complexfilter.i0 i0Var) {
        this.r = jVar;
        this.s = i0Var;
        i0Var.d((List) m0Var.a());
    }

    public final void a(v6.a aVar) {
        j jVar = this.r;
        String str = jVar.z;
        q1 q1Var = jVar.y;
        if ((q1Var == null || !q1Var.f()) && str != null) {
            jVar.y = v71.b0.z(aVar, (a71.h) null, (v71.a0) null, new c(jVar, str, null), 3);
        }
    }

    public final void b(v6.a aVar) {
        j jVar = this.r;
        q1 q1Var = jVar.y;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        jVar.y = v71.b0.z(aVar, (a71.h) null, (v71.a0) null, new f(jVar, null), 3);
    }

    public final w1 c(v6.a aVar) {
        return n1.G(new c00.g(new i1(this.r.w), this.s.b, new q(this, null), 27), aVar, y71.q1.b, g1.a.c(g1.Companion));
    }
}
