package com.github.rudroid.fragments.ui.comment;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.k1;
import com.github.rudroid.utilities.ui.g1;
import v71.a0Shadow;
import v71.b0;
import y71.i1;
import y71.n1Shadow;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public com.github.rudroid.activities.util.c f14475s;

    /* renamed from: t, reason: collision with root package name */
    public cl.a f14476t;

    /* renamed from: u, reason: collision with root package name */
    public String f14477u;

    /* renamed from: v, reason: collision with root package name */
    public String f14478v;

    /* renamed from: w, reason: collision with root package name */
    public y1 f14479w;

    /* renamed from: x, reason: collision with root package name */
    public i1 f14480x;

    /* renamed from: y, reason: collision with root package name */
    public String f14481y;

    public static final class a {
    }

    public i(com.github.rudroid.activities.util.c cVar, cl.a aVar, a1 a1Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(aVar, "fetchMarkdownPreviewUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        this.f14475s = cVar;
        this.f14476t = aVar;
        this.f14477u = (String) a1Var.a("EXTRA_REPOSITORY_NAME");
        this.f14478v = (String) a1Var.a("EXTRA_REPOSITORY_OWNER");
        g1.Companion.getClass();
        y1 c10 = n1Shadow.c(g1.a.a());
        this.f14479w = c10;
        this.f14480x = new i1(c10);
        this.f14481y = "";
    }

    public final void P(String str) {
        k71.k.g(str, "text");
        if (str.length() == 0 || str.equals(this.f14481y)) {
            return;
        }
        this.f14481y = str;
        b0.z(d1.k(this), (a71.h) null, (a0Shadow) null, new l(this, str, null), 3);
    }
}
