package com.github.rudroid.viewmodels.notifications;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$markSubjectAsRead$1", f = "NotificationsViewModel.kt", l = {779}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class r0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s w;
    public final /* synthetic */ String x;
    public final /* synthetic */ Boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s sVar, String str, Boolean bool, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
        this.x = str;
        this.y = bool;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new r0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            s sVar = this.w;
            mm.q qVar = sVar.G;
            oa.j d = sVar.N.d();
            String str = this.x;
            c6.b bVar = new c6.b(sVar, str, this.y, 28);
            qVar.getClass();
            k71.k.g(str, "id");
            y71.y yVar = new y71.y(new q0(sVar, str, null), b31.b.J(((a11.a) qVar.a.a(d)).f(str), d, bVar));
            this.v = 1;
            if (y71.n1Shadow.j(yVar, this) == aVar) {
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
