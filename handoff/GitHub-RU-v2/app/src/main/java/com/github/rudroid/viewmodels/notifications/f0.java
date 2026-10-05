package com.github.rudroid.viewmodels.notifications;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$markAsRead$4", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f0 extends c71.j implements j71.e {
    public final /* synthetic */ s v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(s sVar, String str, a71.c cVar) {
        super(2, cVar);
        this.v = sVar;
        this.w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new f0(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        f0 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        com.github.rudroid.utilities.w0.r(this.v.X, new com.github.rudroid.uitoolkit.listitems.z(this.w, 16));
        return w61.a0.a;
    }
}
