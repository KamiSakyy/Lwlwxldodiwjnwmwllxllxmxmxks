package com.github.rudroid.viewmodels.notifications;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$runInLiveData$1", f = "NotificationsViewModel.kt", l = {1088}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class b1 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ j71.c w;
    public final /* synthetic */ s x;
    public final /* synthetic */ androidx.lifecycle.p0 y;
    public final /* synthetic */ q1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j71.c cVar, s sVar, androidx.lifecycle.p0 p0Var, q1 q1Var, a71.c cVar2) {
        super(2, cVar2);
        this.w = cVar;
        this.x = sVar;
        this.y = p0Var;
        this.z = q1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b1(this.w, this.x, this.y, this.z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            androidx.lifecycle.p0 p0Var = this.y;
            s sVar = this.x;
            y71.i iVar = (y71.i) this.w.k(new com.github.rudroid.repositories.repositoryownerrepositories.d(25, p0Var, sVar));
            a1 a1Var = new a1(p0Var, sVar, this.z);
            this.v = 1;
            if (iVar.b(a1Var, this) == aVar) {
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
