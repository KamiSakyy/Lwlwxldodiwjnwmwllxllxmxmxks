package com.github.rudroid.actions.repositoryworkflows.composables;

import com.github.rudroid.actions.checklog.t;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f5149r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f5150s;

    public g(t tVar, List list) {
        this.f5149r = tVar;
        this.f5150s = list;
    }

    public final Object k(Object obj) {
        return this.f5149r.k(this.f5150s.get(((Number) obj).intValue()));
    }
}
