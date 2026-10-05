package com.github.rudroid.discussions;

@c71.e(c = "com.github.rudroid.discussions.DiscussionDetailViewModel$scrollToAnswer$1$2", f = "DiscussionDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class w3 extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ jk.e f11977v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f11978w;

    public final Object f(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        w3 w3Var = new w3(3, (a71.c) obj3);
        w3Var.f11977v = (jk.e) obj;
        w3Var.f11978w = booleanValue;
        return w3Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        jk.e eVar = this.f11977v;
        boolean z10 = this.f11978w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        return new w61.k(eVar, Boolean.valueOf(z10));
    }
}
