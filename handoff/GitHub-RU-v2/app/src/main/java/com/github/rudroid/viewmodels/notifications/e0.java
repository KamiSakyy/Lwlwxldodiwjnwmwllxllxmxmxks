package com.github.rudroid.viewmodels.notifications;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$markAsDone$5", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class e0 extends c71.j implements j71.f {
    public /* synthetic */ List v;
    public /* synthetic */ j71.c w;
    public final /* synthetic */ s x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(s sVar, a71.c cVar) {
        super(3, cVar);
        this.x = sVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        e0 e0Var = new e0(this.x, (a71.c) obj3);
        e0Var.v = (List) obj;
        e0Var.w = (j71.c) obj2;
        return e0Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        List list = this.v;
        j71.c cVar = this.w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        s sVar = this.x;
        mm.m mVar = sVar.D;
        oa.j d = sVar.N.d();
        c0 c0Var = new c0(sVar, cVar, list, 0);
        mVar.getClass();
        k71.k.g(list, "ids");
        return new y71.y(new d0(sVar, list, null), b31.b.J(((a11.a) mVar.a.a(d)).i(list), d, c0Var));
    }
}
