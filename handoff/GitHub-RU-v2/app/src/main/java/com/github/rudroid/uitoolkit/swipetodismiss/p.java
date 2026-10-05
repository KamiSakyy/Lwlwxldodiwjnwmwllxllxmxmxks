package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", l = {542}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ j71.f x;
    public final /* synthetic */ n y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a71.c cVar, n nVar, j71.f fVar) {
        super(2, cVar);
        this.x = fVar;
        this.y = nVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        p pVar = new p(cVar, this.y, this.x);
        pVar.w = obj;
        return pVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (y) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        y yVar = (y) this.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            u uVar = this.y.m;
            this.w = null;
            this.v = 1;
            if (this.x.f(uVar, yVar, this) == aVar) {
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
