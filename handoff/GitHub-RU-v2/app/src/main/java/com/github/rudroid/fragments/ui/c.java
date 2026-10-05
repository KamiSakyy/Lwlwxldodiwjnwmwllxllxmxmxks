package com.github.rudroid.fragments.ui;

@c71.e(c = "com.github.rudroid.fragments.ui.BannerImageKt$BannerImage$1$1", f = "BannerImage.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class c extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.runtime.f1 f14451v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.compose.runtime.f1 f1Var, a71.c cVar) {
        super(2, cVar);
        this.f14451v = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c(this.f14451v, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        c r10 = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.f14451v.setValue(Boolean.valueOf(!((Boolean) r2.getValue()).booleanValue()));
        return w61.a0.a;
    }
}
