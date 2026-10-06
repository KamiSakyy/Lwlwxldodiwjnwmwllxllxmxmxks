package com.github.rudroid.utilities;

import kotlinx.coroutines.TimeoutCancellationException;

@c71.e(c = "com.github.rudroid.utilities.MotionLayoutExtensionsKt", f = "MotionLayoutExtensions.kt", l = {14}, m = "awaitTransitionComplete", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p1 extends c71.c {
    public k71.w u;
    public /* synthetic */ Object v;
    public int w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final Object v(Object obj) {
        this.v = obj;
        k71.w wVar = (this.w | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.w = wVar;
        b71.a aVar = b71.a.r;
        try {
            if (wVar == 0) {
                sy.y.j(obj);
                k71.w wVar2 = new k71.w();
                r1 r1Var = new r1(wVar2, null);
                this.u = wVar2;
                this.w = 1;
                wVar = wVar2;
                if (v71.b0.M(0L, r1Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (wVar != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k71.w wVar3 = this.u;
                sy.y.j(obj);
                wVar = wVar3;
            }
            return w61.a0.a;
        } catch (TimeoutCancellationException e) {
            if (((i4.x) wVar.r) != null) {
                throw null;
            }
            throw v71.b0.a("Transition to state with id: 0 did not complete in timeout.", e);
        }
    }
    public Object d(Object p1, Object p2) { return null; }
}
