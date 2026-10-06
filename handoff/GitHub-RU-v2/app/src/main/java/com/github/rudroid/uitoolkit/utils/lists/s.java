package com.github.rudroid.uitoolkit.utils.lists;

import androidx.compose.runtime.m1;

@c71.e(c = "com.github.rudroid.uitoolkit.utils.lists.LazyListStateExtensionsKt$scrollVerticalTopBarOffset$1$1", f = "LazyListStateExtensions.kt", l = {113}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class s extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ m0.s w;
    public final /* synthetic */ int x;
    public final /* synthetic */ m1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(m0.s sVar, int i, m1 m1Var, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
        this.x = i;
        this.y = m1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            r rVar = new r(androidx.compose.runtime.t.J(new ah.f(this.w, 12)));
            o oVar = new o(this.x, this.y);
            this.v = 1;
            if (rVar.b(oVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }

    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object c(Object p1) { return null; }
    public Object c0(Object p1) { return null; }
    public Object d(Object p1) { return null; }
    public Object e0(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object h() { return null; }
    public Object h(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object t() { return null; }
}
