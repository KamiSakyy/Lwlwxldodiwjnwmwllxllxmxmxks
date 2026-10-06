package com.github.rudroid.projects.triagesheet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class s0 extends androidx.lifecycle.k1 {
    public static final a Companion = new a();
    public y1 A;
    public y71.i1 B;
    public y1 C;
    public y71.i1 D;

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.projects.domain.a f18084s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f18085t;

    /* renamed from: u, reason: collision with root package name */
    public com.github.rudroid.projects.triagesheet.a f18086u;

    /* renamed from: v, reason: collision with root package name */
    public String f18087v;

    /* renamed from: w, reason: collision with root package name */
    public int f18088w;

    /* renamed from: x, reason: collision with root package name */
    public List f18089x;

    /* renamed from: y, reason: collision with root package name */
    public x71.h f18090y;

    /* renamed from: z, reason: collision with root package name */
    public y71.d f18091z;

    public static final class a {
    }

    public s0(androidx.lifecycle.a1 a1Var, com.github.rudroid.projects.domain.a aVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(aVar, "saveProjectConfigurationUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f18084s = aVar;
        this.f18085t = cVar;
        com.github.rudroid.projects.triagesheet.a aVar2 = (com.github.rudroid.projects.triagesheet.a) a1Var.a("project_owner_type");
        if (aVar2 == null) {
            throw new IllegalStateException("Please call [applyViewModelParameters] first");
        }
        this.f18086u = aVar2;
        String str = (String) a1Var.a("issue_or_pr_id");
        if (str == null) {
            throw new IllegalStateException("Please call [applyViewModelParameters] first");
        }
        this.f18087v = str;
        m[] mVarArr = (m[]) a1Var.a("projects_next");
        if (mVarArr == null) {
            throw new IllegalStateException("Please call [applyViewModelParameters] first");
        }
        List g02 = x61.l.g0(mVarArr);
        this.f18089x = g02;
        x71.h a10 = t.e.a(0, 6, null);
        this.f18090y = a10;
        this.f18091z = new y71.d(a10);
        y1 c10 = y71.n1.c(g02);
        this.A = c10;
        this.B = new y71.i1(c10);
        y1 c11 = y71.n1.c("");
        this.C = c11;
        this.D = y71.n1.G(y71.n1.o(c11, 250L), androidx.lifecycle.d1.k(this), y71.q1.b, "");
    }

    public final void P(d dVar) {
        k71.k.g(dVar, "project");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new t0(this, null), 3);
        y1 y1Var = this.A;
        ArrayList m02 = x61.m.m0((Collection) y1Var.getValue(), dVar);
        y1Var.getClass();
        y1Var.k((Object) null, m02);
    }
}
