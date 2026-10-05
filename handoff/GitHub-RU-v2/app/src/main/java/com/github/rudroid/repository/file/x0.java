package com.github.rudroid.repository.file;

import y71.y1;
import yz0.b4;

/* loaded from: /home/user/work/p/classes.dex */
final class x0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f19498r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u0 f19499s;

    public x0(boolean z10, u0 u0Var) {
        this.f19498r = z10;
        this.f19499s = u0Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        b4 b4Var = (b4) obj;
        boolean z10 = this.f19498r;
        u0 u0Var = this.f19499s;
        if (z10) {
            u0Var.B = new c(u0Var.C, u0Var.D, u0Var.Q(), u0Var.E, b4Var);
        } else {
            u0Var.A = new c(u0Var.C, u0Var.D, u0Var.Q(), u0Var.E, b4Var);
        }
        y1 y1Var = u0Var.f19483y;
        fl.f.Companion.getClass();
        fl.f c10 = fl.e.c(b4Var);
        y1Var.getClass();
        y1Var.k((Object) null, c10);
        return w61.a0.a;
    }
}
