package com.github.rudroid.viewmodels.notifications;

import com.github.service.models.response.type.SubscriptionState;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class m implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ s s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ SubscriptionState v;
    public final /* synthetic */ boolean w;

    public /* synthetic */ m(s sVar, String str, String str2, SubscriptionState subscriptionState, boolean z, int i) {
        this.r = i;
        this.s = sVar;
        this.t = str;
        this.u = str2;
        this.v = subscriptionState;
        this.w = z;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                s sVar = this.s;
                sVar.l0(sVar.q0(this.t, this.u, this.v, new o(sVar, 1)), this.w);
                break;
            default:
                s sVar2 = this.s;
                sVar2.l0(sVar2.p0(this.t, this.u, this.v, new o(sVar2, 2)), this.w);
                break;
        }
        return w61.a0.a;
    }
}
