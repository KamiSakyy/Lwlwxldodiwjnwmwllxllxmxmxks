package com.github.rudroid.viewmodels.notifications;

import kotlin.KotlinNothingValueException;
import y71.y1;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$startObservingForCache$1", f = "NotificationsViewModel.kt", l = {289}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(s sVar, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g1(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
        return b71.a.r;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            throw new KotlinNothingValueException();
        }
        sy.y.j(obj);
        s sVar = this.w;
        y1 y1Var = sVar.X;
        f1 f1Var = new f1(sVar);
        this.v = 1;
        y1Var.b(f1Var, this);
        return aVar;
    }
}
