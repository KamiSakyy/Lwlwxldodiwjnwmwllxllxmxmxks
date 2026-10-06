package com.github.rudroid.uitoolkit.swipetodismiss;

import f0.j1;

@c71.e(c = "com.github.rudroid.uitoolkit.swipetodismiss.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", l = {170}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class c extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ n w;
    public final /* synthetic */ float x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n nVar, float f, a71.c cVar) {
        super(2, cVar);
        this.w = nVar;
        this.x = f;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new c(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r8 != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0064, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r8 == r0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Object b;
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        this.v = 1;
        n nVar = this.w;
        Object value = nVar.f.getValue();
        float e = nVar.e();
        float f = this.x;
        Object c = nVar.c(e, f, value);
        if (((Boolean) nVar.c.k(c)).booleanValue()) {
            b = nVar.b(c, j1.r, new e(nVar, f, null), this);
            if (b != aVar) {
                b = a0Var;
            }
        } else {
            b = nVar.b(value, j1.r, new e(nVar, f, null), this);
            if (b != aVar) {
                b = a0Var;
            }
        }
    }
    public Object v(Object) { return null; }
}
