package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", l = {277}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v extends c71.j implements j71.f {
    public int v;
    public final /* synthetic */ x w;
    public final /* synthetic */ a61.o x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, a61.o oVar, a71.c cVar) {
        super(3, cVar);
        this.w = xVar;
        this.x = oVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        return new v(this.w, this.x, (a71.c) obj3).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            w wVar = this.w.r;
            this.v = 1;
            if (this.x.s(wVar, this) == aVar) {
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
}
