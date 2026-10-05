package com.github.rudroid.repository;

/* loaded from: /home/user/work/p/classes.dex */
public final class h1 extends k71.l implements j71.a {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f19825s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(w61.h hVar) {
        super(0);
        this.f19825s = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final Object a() {
        androidx.lifecycle.u1 u1Var = (androidx.lifecycle.u1) this.f19825s.getValue();
        androidx.lifecycle.r rVar = u1Var instanceof androidx.lifecycle.r ? (androidx.lifecycle.r) u1Var : null;
        return rVar != null ? rVar.g0() : t6.a.f32099b;
    }
}
