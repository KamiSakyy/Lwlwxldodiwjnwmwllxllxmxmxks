package com.github.rudroid.uitoolkit.swipetodismiss;

import t00.f8;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableKt$restartable$2", f = "AnchoredDraggable.kt", l = {748}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class j extends c71.j implements j71.e {
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ j71.a x;
    public final /* synthetic */ j71.e y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(j71.a aVar, j71.e eVar, a71.c cVar) {
        super(2, cVar);
        this.x = aVar;
        this.y = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        j jVar = new j(this.x, this.y, cVar);
        jVar.w = obj;
        return jVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        v71.z zVar = (v71.z) this.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            k71.w wVar = new k71.w();
            f8 J = androidx.compose.runtime.t.J(this.x);
            i iVar = new i(wVar, zVar, this.y);
            this.w = null;
            this.v = 1;
            if (J.b(iVar, this) == aVar) {
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
