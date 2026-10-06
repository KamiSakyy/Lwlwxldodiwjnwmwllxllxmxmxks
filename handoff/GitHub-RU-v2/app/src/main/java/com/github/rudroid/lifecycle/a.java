package com.github.rudroid.lifecycle;

import androidx.lifecycle.c0;
import androidx.lifecycle.i;
import k71.k;
import sb.a;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements i, sb.a {

    /* renamed from: r, reason: collision with root package name */
    public y1 f16785r;

    /* renamed from: s, reason: collision with root package name */
    public y1 f16786s;

    public a() {
        y1 c10 = n1.c(a.EnumC0089a.f31788s);
        this.f16785r = c10;
        this.f16786s = c10;
    }

    @Override // sb.a
    public final y1 a() {
        return this.f16786s;
    }

    @Override // androidx.lifecycle.i
    public final void f(c0 c0Var) {
        k.g(c0Var, "owner");
        a.EnumC0089a enumC0089a = a.EnumC0089a.f31788s;
        y1 y1Var = this.f16785r;
        y1Var.getClass();
        y1Var.k((Object) null, enumC0089a);
    }

    @Override // androidx.lifecycle.i
    public final void r(c0 c0Var) {
        a.EnumC0089a enumC0089a = a.EnumC0089a.f31787r;
        y1 y1Var = this.f16785r;
        y1Var.getClass();
        y1Var.k((Object) null, enumC0089a);
    }
}
