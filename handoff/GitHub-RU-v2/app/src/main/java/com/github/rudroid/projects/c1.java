package com.github.rudroid.projects;

import android.app.Application;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class c1 extends androidx.lifecycle.a implements com.github.rudroid.utilities.viewmodel.d {
    public static final a Companion = new a();
    public String A;
    public y71.y1 B;
    public y71.i1 C;
    public y71.y1 D;
    public y71.i1 E;
    public b1 F;
    public v71.q1 G;
    public v71.q1 H;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d.a f17660t;

    /* renamed from: u, reason: collision with root package name */
    public il.q f17661u;

    /* renamed from: v, reason: collision with root package name */
    public il.i f17662v;

    /* renamed from: w, reason: collision with root package name */
    public il.v f17663w;

    /* renamed from: x, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f17664x;

    /* renamed from: y, reason: collision with root package name */
    public l0 f17665y;

    /* renamed from: z, reason: collision with root package name */
    public String f17666z;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(il.q qVar, il.i iVar, il.v vVar, com.github.rudroid.activities.util.c cVar, l0 l0Var, Application application, androidx.lifecycle.a1 a1Var) {
        super(application);
        k71.k.g(qVar, "observeRepositoryProjectsUseCase");
        k71.k.g(iVar, "loadRepositoryProjectsUseCase");
        k71.k.g(vVar, "refreshRepositoryProjectsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f17660t = new d.a();
        this.f17661u = qVar;
        this.f17662v = iVar;
        this.f17663w = vVar;
        this.f17664x = cVar;
        this.f17665y = l0Var;
        String str = (String) a1Var.a("repo_owner");
        if (str == null) {
            throw new IllegalStateException("Invalid initialization. Call applyProjectViewModelParameters please.");
        }
        this.f17666z = str;
        String str2 = (String) a1Var.a("repo_name");
        if (str2 == null) {
            throw new IllegalStateException("Invalid initialization. Call applyProjectViewModelParameters please.");
        }
        this.A = str2;
        y71.y1 c10 = y71.n1.c("");
        this.B = c10;
        this.C = new y71.i1(c10);
        y71.y1 c11 = y71.n1.c(g1.a.c(com.github.rudroid.utilities.ui.g1.Companion));
        this.D = c11;
        this.E = com.github.rudroid.utilities.w0.f(c11, androidx.lifecycle.d1.k(this), new b1(this, 0));
        this.F = new b1(this, 1);
        Q();
        y71.n1.A(new y71.y(y71.n1.o(c10, 250L), new i1(this, null), 6), androidx.lifecycle.d1.k(this));
    }

    public final void Q() {
        v71.q1 q1Var = this.G;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        this.G = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new h1(this, null), 3);
    }

    public final void R(String str) {
        k71.k.g(str, "query");
        y71.y1 y1Var = this.B;
        y1Var.getClass();
        y1Var.k((Object) null, str);
    }
}
