package com.github.rudroid.uitoolkit.swipetodismiss;

import a0.f1;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {709}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class e extends c71.j implements j71.g {
    public final /* synthetic */ float A;
    public int v;
    public /* synthetic */ a w;
    public /* synthetic */ y x;
    public /* synthetic */ Object y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, float f, a71.c cVar) {
        super(4, cVar);
        this.z = nVar;
        this.A = f;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        e eVar = new e(this.z, this.A, (a71.c) obj4);
        eVar.w = (a) obj;
        eVar.x = (y) obj2;
        eVar.y = obj3;
        return eVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        a aVar = this.w;
        y yVar = this.x;
        Object obj2 = this.y;
        b71.a aVar2 = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            float d = yVar.d(obj2);
            if (!Float.isNaN(d)) {
                k71.t tVar = new k71.t();
                n nVar = this.z;
                float y = Float.isNaN(nVar.i.y()) ? 0.0f : nVar.i.y();
                tVar.r = y;
                f1 f1Var = b.a;
                com.github.rudroid.settings.copilot.debug.q qVar = new com.github.rudroid.settings.copilot.debug.q((Object) aVar, (Object) tVar, false, 10);
                this.w = null;
                this.x = null;
                this.y = null;
                this.v = 1;
                if (a0.f.c(y, d, this.A, f1Var, qVar, this) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
    public Object t(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
