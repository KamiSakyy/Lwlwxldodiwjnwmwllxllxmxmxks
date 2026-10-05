package com.github.rudroid.viewmodels.notifications;

import com.github.service.models.response.type.SubscriptionState;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class l implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ s s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ SubscriptionState v;

    public /* synthetic */ l(s sVar, String str, String str2, SubscriptionState subscriptionState, int i) {
        this.r = i;
        this.s = sVar;
        this.t = str;
        this.u = str2;
        this.v = subscriptionState;
    }

    public final Object k(Object obj) {
        j71.c cVar = (j71.c) obj;
        switch (this.r) {
            case 0:
                k71.k.g(cVar, "onError");
                return this.s.p0(this.t, this.u, this.v, cVar);
            default:
                k71.k.g(cVar, "onError");
                return this.s.q0(this.t, this.u, this.v, cVar);
        }
    }
}
