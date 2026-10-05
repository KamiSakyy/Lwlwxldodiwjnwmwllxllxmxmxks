package com.github.rudroid.viewmodels.notifications;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class t0 implements j71.c {
    public final /* synthetic */ dd.a r;
    public final /* synthetic */ boolean s;

    public t0(dd.a aVar, boolean z) {
        this.r = aVar;
        this.s = z;
    }

    public final Object k(Object obj) {
        List list = (List) obj;
        k71.k.g(list, "notifications");
        return new i(this.r, list, this.s, false);
    }
}
