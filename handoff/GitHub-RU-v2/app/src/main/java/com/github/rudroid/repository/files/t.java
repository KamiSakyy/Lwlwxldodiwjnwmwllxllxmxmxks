package com.github.rudroid.repository.files;

import com.github.rudroid.repository.files.z;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class t extends androidx.lifecycle.k1 {

    /* renamed from: s, reason: collision with root package name */
    public ql.a f19679s;

    /* renamed from: t, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f19680t;

    /* renamed from: u, reason: collision with root package name */
    public y1 f19681u;

    public t(ql.a aVar, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(aVar, "fetchRepositoryFileExistsUseCase");
        k71.k.g(cVar, "accountHolder");
        this.f19679s = aVar;
        this.f19680t = cVar;
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        this.f19681u = y71.n1.c(new com.github.rudroid.utilities.ui.t1(z.d.f19702a));
    }

    public final void P(String str, String str2, String str3, String str4) {
        k71.k.g(str, "repoOwner");
        k71.k.g(str2, "repoName");
        k71.k.g(str4, "path");
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new s(this, str, str2, str3, str4, null), 3);
    }

    public final void Q() {
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        com.github.rudroid.utilities.ui.t1 t1Var = new com.github.rudroid.utilities.ui.t1(z.d.f19702a);
        y1 y1Var = this.f19681u;
        y1Var.getClass();
        y1Var.k((Object) null, t1Var);
    }
}
