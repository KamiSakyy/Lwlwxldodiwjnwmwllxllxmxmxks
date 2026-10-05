package com.github.rudroid.actions.checkssummary.ui;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ cd0.d f5091r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f5092s;

    public l(cd0.d dVar, List list) {
        this.f5091r = dVar;
        this.f5092s = list;
    }

    public final Object k(Object obj) {
        int intValue = ((Number) obj).intValue();
        return this.f5091r.s(Integer.valueOf(intValue), this.f5092s.get(intValue));
    }
}
