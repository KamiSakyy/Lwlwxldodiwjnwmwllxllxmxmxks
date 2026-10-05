package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k extends c71.j implements j71.g {
    public /* synthetic */ a v;
    public /* synthetic */ y w;
    public /* synthetic */ Object x;

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        k kVar = new k(4, (a71.c) obj4);
        kVar.v = (a) obj;
        kVar.w = (y) obj2;
        kVar.x = obj3;
        w61.a0 a0Var = w61.a0.a;
        kVar.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        a aVar = this.v;
        y yVar = this.w;
        Object obj2 = this.x;
        b71.a aVar2 = b71.a.r;
        sy.y.j(obj);
        float d = yVar.d(obj2);
        if (!Float.isNaN(d)) {
            aVar.a(d, 0.0f);
        }
        return w61.a0.a;
    }
}
