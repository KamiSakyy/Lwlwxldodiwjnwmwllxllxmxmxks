package com.github.rudroid.viewmodels.notifications;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$runBatchedApiAction$1$batches$1$1", f = "NotificationsViewModel.kt", l = {936, 938}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ c71.j w;
    public final /* synthetic */ List x;
    public final /* synthetic */ k71.w y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j71.f fVar, List list, k71.w wVar, a71.c cVar) {
        super(2, cVar);
        this.w = (c71.j) fVar;
        this.x = list;
        this.y = wVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new y0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 == r0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            androidx.compose.foundation.lazy.layout.p1 p1Var = new androidx.compose.foundation.lazy.layout.p1(this.y, 4);
            this.v = 1;
            obj = this.w.f(this.x, p1Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return obj;
            }
            sy.y.j(obj);
        }
        this.v = 2;
        Object F = y71.n1Shadow.F((y71.i) obj, this);
        return F == aVar ? aVar : F;
    }
}
