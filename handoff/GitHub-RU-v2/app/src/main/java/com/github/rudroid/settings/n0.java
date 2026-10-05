package com.github.rudroid.settings;

import java.time.LocalTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class n0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ LocalTime s;
    public final /* synthetic */ LocalTime t;

    public /* synthetic */ n0(LocalTime localTime, LocalTime localTime2, int i) {
        this.r = i;
        this.s = localTime;
        this.t = localTime2;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                pm.c cVar = (pm.c) obj;
                k71.k.g(cVar, "$this$copy");
                LocalTime localTime = this.t;
                k71.k.d(localTime);
                return pm.c.a(cVar, null, this.s, localTime, false, 9);
            default:
                pm.c cVar2 = (pm.c) obj;
                k71.k.g(cVar2, "$this$copy");
                LocalTime localTime2 = this.t;
                k71.k.d(localTime2);
                return pm.c.a(cVar2, null, localTime2, this.s, false, 9);
        }
    }
}
