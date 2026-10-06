package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.f {
    public /* synthetic */ v71.z v;
    public /* synthetic */ float w;
    public final /* synthetic */ n x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n nVar, a71.c cVar) {
        super(3, cVar);
        this.x = nVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        d dVar = new d(this.x, (a71.c) obj3);
        dVar.v = (v71.z) obj;
        dVar.w = floatValue;
        w61.a0 a0Var = w61.a0.a;
        dVar.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        v71.z zVar = this.v;
        float f = this.w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        v71.b0.z(zVar, (a71.h) null, (v71.a0Shadow) null, new c(this.x, f, null), 3);
        return w61.a0.a;
    }
}
