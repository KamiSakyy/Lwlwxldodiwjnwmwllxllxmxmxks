package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", l = {591}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class s extends c71.j implements j71.e {
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ j71.g x;
    public final /* synthetic */ n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(j71.g gVar, n nVar, a71.c cVar) {
        super(2, cVar);
        this.x = gVar;
        this.y = nVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        s sVar = new s(this.x, this.y, cVar);
        sVar.w = obj;
        return sVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (w61.k) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        w61.k kVar = (w61.k) this.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            y yVar = (y) kVar.r;
            Object obj2 = kVar.s;
            u uVar = this.y.m;
            this.w = null;
            this.v = 1;
            if (this.x.n(uVar, yVar, obj2, this) == aVar) {
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
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object c0(Object p1) { return null; }
    public Object e0(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g(Object p1) { return null; }
    public Object g0() { return null; }
    public Object k(Object p1) { return null; }
    public Object l() { return null; }
    public Object q(Object p1) { return null; }
    public Object q0() { return null; }
    public Object t() { return null; }
    public Object S = null;
    public Object T = null;
    public Object S(int p1, boolean p2) { return null; }
    public Object c0(int p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g(boolean p1) { return null; }
    public Object j(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object q(boolean p1) { return null; }
}
