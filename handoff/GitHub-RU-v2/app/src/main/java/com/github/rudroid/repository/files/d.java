package com.github.rudroid.repository.files;

import android.os.Parcelable;
import com.github.rudroid.repository.files.b;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends androidx.lifecycle.k1 {
    public static final a Companion = new a();

    /* renamed from: s, reason: collision with root package name */
    public final y1 f19541s;

    /* renamed from: t, reason: collision with root package name */
    public final y71.i1 f19542t;

    /* renamed from: u, reason: collision with root package name */
    public final y1 f19543u;

    /* renamed from: v, reason: collision with root package name */
    public final y71.i1 f19544v;

    public static final class a {
    }

    public d(androidx.lifecycle.a1 a1Var) {
        k71.k.g(a1Var, "savedStateHandle");
        Parcelable parcelable = (b) a1Var.a("EXTRA_BROWSING_MODE");
        parcelable = parcelable == null ? b.a.f19534r : parcelable;
        y1 c10 = y71.n1.c((Object) null);
        this.f19541s = c10;
        this.f19542t = new y71.i1(c10);
        y1 c11 = y71.n1.c((Object) null);
        this.f19543u = c11;
        this.f19544v = new y71.i1(c11);
        if (parcelable instanceof b.C0062b) {
            b.C0062b c0062b = (b.C0062b) parcelable;
            P(c0062b.f19535r, c0062b.f19536s);
        }
    }

    public final void P(String str, String str2) {
        k71.k.g(str, "baseBranch");
        k71.k.g(str2, "headBranch");
        com.github.rudroid.repository.files.a aVar = new com.github.rudroid.repository.files.a(str, str2);
        y1 y1Var = this.f19543u;
        y1Var.getClass();
        y1Var.k((Object) null, aVar);
    }
}
