package com.github.rudroid.viewmodels.notifications;

import java.util.List;

@c71.e(c = "com.github.rudroid.viewmodels.notifications.NotificationsViewModel$notificationListModel$1", f = "NotificationsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class s0 extends c71.j implements j71.h {
    public /* synthetic */ dd.a v;
    public /* synthetic */ com.github.rudroid.utilities.ui.g1 w;
    public /* synthetic */ List x;
    public /* synthetic */ boolean y;
    public final /* synthetic */ s z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(s sVar, a71.c cVar) {
        super(5, cVar);
        this.z = sVar;
    }

    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj4).booleanValue();
        s0 s0Var = new s0(this.z, (a71.c) obj5);
        s0Var.v = (dd.a) obj;
        s0Var.w = (com.github.rudroid.utilities.ui.g1) obj2;
        s0Var.x = (List) obj3;
        s0Var.y = booleanValue;
        return s0Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        dd.a aVar = this.v;
        com.github.rudroid.utilities.ui.g1 g1Var = this.w;
        List list = this.x;
        boolean z = this.y;
        b71.a aVar2 = b71.a.r;
        sy.y.j(obj);
        return new a(aVar, com.github.rudroid.utilities.ui.h1.h(g1Var, new com.github.rudroid.searchandfilter.filterbar.j(this.z, list)), z);
    }
}
