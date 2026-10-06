package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", l = {588}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class t extends c71.j implements j71.c {
    public int v;
    public final /* synthetic */ n w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ j71.g y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n nVar, Object obj, j71.g gVar, a71.c cVar) {
        super(1, cVar);
        this.w = nVar;
        this.x = obj;
        this.y = gVar;
    }

    public final Object k(Object obj) {
        Object obj2 = this.x;
        j71.g gVar = this.y;
        return new t(this.w, obj2, gVar, (a71.c) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            Object obj2 = this.x;
            n nVar = this.w;
            nVar.g(obj2);
            m mVar = new m(nVar, 4);
            s sVar = new s(this.y, nVar, null);
            this.v = 1;
            if (l.a(mVar, sVar, this) == aVar) {
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
    public static Object B(Object p1) { return null; }
    public static Object E(Object p1, Object p2) { return null; }
    public static Object I(Object p1, Object p2, Object p3) { return null; }
    public static Object J(Object p1) { return null; }
    public static Object L(Object p1) { return null; }
    public static Object s(Object p1) { return null; }
    public static Object w(Object p1, Object p2, Object p3) { return null; }
    public Object r(Object p1, Object p2) { return null; }
}
