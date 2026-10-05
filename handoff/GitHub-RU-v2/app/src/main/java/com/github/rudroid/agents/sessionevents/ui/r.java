package com.github.rudroid.agents.sessionevents.ui;

import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class r implements j71.e {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8097r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Set f8098s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j71.c f8099t;

    public /* synthetic */ r(Set set, j71.c cVar, int i) {
        this.f8097r = i;
        this.f8098s = set;
        this.f8099t = cVar;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.f8097r;
        String str = (String) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        switch (i) {
            case k5.f.J /* 0 */:
                k71.k.g(str, "id");
                Set set = this.f8098s;
                this.f8099t.k(booleanValue ? sy.f0.n(set, str) : sy.f0.k(set, str));
                break;
            default:
                k71.k.g(str, "id");
                Set set2 = this.f8098s;
                this.f8099t.k(booleanValue ? sy.f0.n(set2, str) : sy.f0.k(set2, str));
                break;
        }
        return w61.a0.a;
    }
}
