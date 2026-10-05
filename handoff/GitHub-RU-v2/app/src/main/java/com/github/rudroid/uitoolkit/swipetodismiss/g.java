package com.github.rudroid.uitoolkit.swipetodismiss;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableKt$restartable$2$1$2", f = "AnchoredDraggable.kt", l = {754}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ j71.e w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ v71.z y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j71.e eVar, Object obj, v71.z zVar, a71.c cVar) {
        super(2, cVar);
        this.w = eVar;
        this.x = obj;
        this.y = zVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            if (this.w.s(this.x, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        v71.b0.i(this.y, new AnchoredDragFinishedSignal());
        return w61.a0.a;
    }
}
