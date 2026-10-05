package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {541}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q extends c71.j implements j71.c {
    public int v;
    public final /* synthetic */ n w;
    public final /* synthetic */ j71.f x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a71.c cVar, n nVar, j71.f fVar) {
        super(1, cVar);
        this.w = nVar;
        this.x = fVar;
    }

    public final Object k(Object obj) {
        return new q((a71.c) obj, this.w, this.x).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            n nVar = this.w;
            m mVar = new m(nVar, 3);
            p pVar = new p(null, nVar, this.x);
            this.v = 1;
            if (l.a(mVar, pVar, this) == aVar) {
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
