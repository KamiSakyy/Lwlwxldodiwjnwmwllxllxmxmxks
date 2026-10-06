package com.github.rudroid.viewmodels.notifications;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$runAndCollect$1", f = "NotificationsViewModel.kt", l = {1105}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ y71.y w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ s y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(y71.y yVar, boolean z, s sVar, a71.c cVar) {
        super(2, cVar);
        this.w = yVar;
        this.x = z;
        this.y = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new x0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            w0 w0Var = new w0(this.y, this.x);
            this.v = 1;
            if (this.w.b(w0Var, this) == aVar) {
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
    public Object a(Object p1) { return null; }
    public Object a(Object) { return null; }
}
