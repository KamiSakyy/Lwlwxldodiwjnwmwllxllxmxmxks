package com.github.rudroid.viewmodels.notifications;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$markAsDone$5$2", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d0 extends c71.j implements j71.e {
    public final /* synthetic */ s v;
    public final /* synthetic */ List w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(s sVar, List list, a71.c cVar) {
        super(2, cVar);
        this.v = sVar;
        this.w = list;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new d0(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        d0 r = r((a71.c) obj2, (y71.j) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        com.github.rudroid.utilities.w0.r(this.v.X, new com.github.rudroid.searchandfilter.filterbar.j(3, this.w));
        return w61.a0.a;
    }
}
