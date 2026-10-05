package com.github.rudroid.fileschanged.delete;

import android.app.Application;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import com.github.rudroid.utilities.h2;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.viewmodel.d;
import com.github.service.models.response.type.MobileEventContext;
import y71.i1;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class f0 extends androidx.lifecycle.a implements com.github.rudroid.utilities.viewmodel.d {
    public static final a Companion = new a();
    public final ql.b A;
    public final w B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String G;
    public final com.github.rudroid.fileeditor.c H;
    public final String I;
    public final MobileEventContext J;
    public String K;
    public final y1 L;
    public final i1 M;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d.a f13173t;

    /* renamed from: u, reason: collision with root package name */
    public final Application f13174u;

    /* renamed from: v, reason: collision with root package name */
    public final com.github.rudroid.activities.util.c f13175v;

    /* renamed from: w, reason: collision with root package name */
    public final sk.b f13176w;

    /* renamed from: x, reason: collision with root package name */
    public final ml.c f13177x;

    /* renamed from: y, reason: collision with root package name */
    public final ml.j f13178y;

    /* renamed from: z, reason: collision with root package name */
    public final nl.c f13179z;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Application application, a1 a1Var, com.github.rudroid.activities.util.c cVar, sk.b bVar, ml.c cVar2, ml.j jVar, nl.c cVar3, ql.b bVar2, w wVar) {
        super(application);
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(bVar, "createCommitCachedOnBranchUseCase");
        k71.k.g(cVar2, "fetchHeadRefAndBranchSuggestionUseCase");
        k71.k.g(jVar, "fetchRepositoryIdUseCase");
        k71.k.g(cVar3, "createBranchAndCommitUseCase");
        k71.k.g(bVar2, "fetchRepositoryFileUseCase");
        this.f13173t = new d.a();
        this.f13174u = application;
        this.f13175v = cVar;
        this.f13176w = bVar;
        this.f13177x = cVar2;
        this.f13178y = jVar;
        this.f13179z = cVar3;
        this.A = bVar2;
        this.B = wVar;
        this.C = (String) h2.a(a1Var, "EXTRA_REPOSITORY_OWNER");
        this.D = (String) h2.a(a1Var, "EXTRA_REPOSITORY_NAME");
        this.E = (String) h2.a(a1Var, "EXTRA_REF");
        String str = (String) h2.a(a1Var, "EXTRA_BRANCH_NAME");
        this.F = str;
        this.G = (String) h2.a(a1Var, "EXTRA_BASE_BRANCH_NAME");
        this.H = (com.github.rudroid.fileeditor.c) h2.a(a1Var, "EXTRA_EDIT_FILE_POLICY");
        String str2 = (String) h2.a(a1Var, "EXTRA_FILE_PATH");
        this.I = str2;
        r01.k kVar = MobileEventContext.Companion;
        String str3 = (String) a1Var.a("EXTRA_NAVIGATION_SOURCE");
        str3 = str3 == null ? "" : str3;
        kVar.getClass();
        this.J = r01.k.a(str3);
        this.K = "";
        g1.a aVar = g1.Companion;
        d0 d0Var = new d0(str2, 0, x61.r.r, false, false, str, str, null, null, null);
        aVar.getClass();
        y1 c10 = n1.c(new com.github.rudroid.utilities.ui.u0(d0Var));
        this.L = c10;
        this.M = new i1(c10);
        v71.b0.z(d1.k(this), (a71.h) null, (v71.a0) null, new m0(this, null), 3);
    }

    public final void Q(fl.b bVar) {
        k71.k.g(bVar, "executionError");
        this.f13173t.a(bVar);
    }
}
