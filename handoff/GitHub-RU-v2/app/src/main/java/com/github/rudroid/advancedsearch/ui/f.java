package com.github.rudroid.advancedsearch.ui;

import com.github.rudroid.actions.checklog.t;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f6320r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f6321s;

    public f(t tVar, List list) {
        this.f6320r = tVar;
        this.f6321s = list;
    }

    public final Object k(Object obj) {
        return this.f6320r.k(this.f6321s.get(((Number) obj).intValue()));
    }
}
