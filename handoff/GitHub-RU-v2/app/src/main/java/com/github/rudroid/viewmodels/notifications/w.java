package com.github.rudroid.viewmodels.notifications;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$enableNotifications$1", f = "NotificationsViewModel.kt", l = {1068}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ s w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(s sVar, a71.c cVar) {
        super(2, cVar);
        this.w = sVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new w(this.w, cVar);
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
            mm.a aVar2 = sVar.y;
            oa.j d = sVar.N.d();
            com.github.rudroid.utilities.ui.emojipicker.e eVar = new com.github.rudroid.utilities.ui.emojipicker.e(7);
            aVar2.getClass();
            y71.y J = b31.b.J(((z01.u0) aVar2.a.a(d)).l(), d, eVar);
            v vVar = new v(sVar);
            this.v = 1;
            if (J.b(vVar, this) == aVar) {
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
