package com.github.rudroid.createrepository;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h0;
import rm0.r3Shadow;
import v71.q1;
import y71.i1;
import y71.n1Shadow;
import y71.v1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class q extends k1 implements com.github.rudroid.utilities.viewmodel.b {
    public static final a Companion = new a();
    public y1 A;
    public i1 B;
    public q1 C;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.utilities.viewmodel.c f10599s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f10600t;

    /* renamed from: u, reason: collision with root package name */
    public ml.j f10601u;

    /* renamed from: v, reason: collision with root package name */
    public vl.c f10602v;

    /* renamed from: w, reason: collision with root package name */
    public vl.b f10603w;

    /* renamed from: x, reason: collision with root package name */
    public com.github.rudroid.createrepository.model.f f10604x;

    /* renamed from: y, reason: collision with root package name */
    public y1 f10605y;

    /* renamed from: z, reason: collision with root package name */
    public y1 f10606z;

    public static final class a {
    }

    public q(com.github.rudroid.activities.util.c cVar, ml.j jVar, vl.c cVar2, vl.b bVar, com.github.rudroid.createrepository.model.f fVar, oa.m mVar, a1 a1Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(jVar, "fetchRepositoryIdUseCase");
        k71.k.g(cVar2, "createRepositoryUseCase");
        k71.k.g(bVar, "cloneTemplateRepositoryUseCase");
        k71.k.g(fVar, "repositoryNameSanitizer");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "savedStateHandle");
        this.f10599s = new com.github.rudroid.utilities.viewmodel.c(a1Var, mVar);
        this.f10600t = cVar;
        this.f10601u = jVar;
        this.f10602v = cVar2;
        this.f10603w = bVar;
        this.f10604x = fVar;
        String str = cVar.d().f30109c;
        String b10 = cVar.d().b();
        y1 c10 = n1Shadow.c(new com.github.rudroid.createrepository.model.a((1020 & 1) != 0 ? "" : str, (1020 & 2) != 0 ? "" : b10 == null ? "" : b10, (1020 & 4) != 0 ? "" : null, (1020 & 8) == 0 ? "A short description of my new repository" : "", (1020 & 16) != 0, (1020 & 32) != 0 ? null : null, (1020 & 64) == 0, (1020 & 128) != 0 ? null : "Kotlin", (1020 & 256) == 0 ? null : null, (1020 & 512) == 0));
        this.f10605y = c10;
        g1.Companion.getClass();
        y1 c11 = n1Shadow.c(g1.a.a());
        this.f10606z = c11;
        y1 c12 = n1Shadow.c(g1.a.a());
        this.A = c12;
        h0 h0Var = null;
        r3Shadow l = n1Shadow.l(c10, c11, c12, new b0(this, null));
        v6.a k10 = d1.k(this);
        v1 a10 = y71.q1.a(3);
        com.github.rudroid.createrepository.model.a aVar = (com.github.rudroid.createrepository.model.a) c10.getValue();
        if ((14 & 2) != 0) {
            g1.Companion.getClass();
            h0Var = g1.a.a();
        }
        g1.Companion.getClass();
        this.B = n1Shadow.G(l, k10, a10, new com.github.rudroid.createrepository.model.d(aVar, h0Var, g1.a.a(), ""));
    }

    public final void P(y71.g1 g1Var, fl.b bVar, boolean z10) {
        k71.k.g(g1Var, "<this>");
        k71.k.g(bVar, "executionError");
        this.f10599s.a(g1Var, bVar, z10);
    }
}
