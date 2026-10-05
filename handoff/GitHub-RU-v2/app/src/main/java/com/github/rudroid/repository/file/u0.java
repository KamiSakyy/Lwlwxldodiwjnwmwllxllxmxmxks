package com.github.rudroid.repository.file;

import android.app.Application;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.viewmodel.d;
import y71.n1;
import y71.y1;
import yz0.b4;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0 extends androidx.lifecycle.a implements com.github.rudroid.viewmodels.b, com.github.rudroid.utilities.viewmodel.d {
    public static final a Companion = new a();
    public c A;
    public c B;
    public final String C;
    public final String D;
    public final String E;
    public final w61.k F;
    public final Integer G;
    public final y1 H;
    public boolean I;
    public String J;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.viewmodels.c f19478t;

    /* renamed from: u, reason: collision with root package name */
    public final v71.v f19479u;

    /* renamed from: v, reason: collision with root package name */
    public final ql.b f19480v;

    /* renamed from: w, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f19481w;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.a1 f19482x;

    /* renamed from: y, reason: collision with root package name */
    public final y1 f19483y;

    /* renamed from: z, reason: collision with root package name */
    public final c1 f19484z;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Application application, v71.v vVar, ql.b bVar, com.github.rudroid.activities.util.c cVar, androidx.lifecycle.a1 a1Var) {
        super(application);
        k71.k.g(vVar, "defaultDispatcher");
        k71.k.g(bVar, "fetchRepositoryFileUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.f19478t = new com.github.rudroid.viewmodels.c(application);
        new d.a();
        this.f19479u = vVar;
        this.f19480v = bVar;
        this.f19481w = cVar;
        this.f19482x = a1Var;
        y1 s2 = com.github.rudroid.m0.s(fl.f.Companion, null);
        this.f19483y = s2;
        this.f19484z = new c1(new y71.i1(s2), this);
        this.C = (String) h2.a(a1Var, "REPO_OWNER_");
        this.D = (String) h2.a(a1Var, "REPO_NAME");
        this.E = (String) h2.a(a1Var, "PATH");
        this.F = (w61.k) a1Var.a("SELECTION");
        Integer num = (Integer) a1Var.a("JUMP_TO_LINE_NUMBER");
        this.G = num;
        this.H = n1.c(Boolean.FALSE);
        boolean z10 = false;
        if (num != null && num.intValue() > 0) {
            z10 = true;
        }
        this.I = z10;
        this.J = Q();
    }

    public final String Q() {
        return (String) h2.a(this.f19482x, "BRANCH");
    }

    public final b4 R() {
        return (b4) ((fl.f) this.f19483y.getValue()).b;
    }

    public final String S() {
        return t0.a(this.f19481w.d(), this.C, this.D, Q(), this.E);
    }
}
