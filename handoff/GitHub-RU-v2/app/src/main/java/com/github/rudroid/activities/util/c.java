package com.github.rudroid.activities.util;

import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f5918a;

    /* renamed from: b, reason: collision with root package name */
    public final y00.l f5919b;

    public c() {
        y1 c10 = n1.c((Object) null);
        this.f5918a = c10;
        this.f5919b = new y00.l(c10, 10);
    }

    @Override // com.github.rudroid.activities.util.a
    public final y00.l b() {
        return this.f5919b;
    }

    @Override // com.github.rudroid.activities.util.a
    public final oa.j d() {
        oa.j jVar = (oa.j) this.f5918a.getValue();
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("no activity user returned");
    }

    public final void e(oa.j jVar) {
        k71.k.g(jVar, "user");
        y1 y1Var = this.f5918a;
        y1Var.getClass();
        y1Var.k((Object) null, jVar);
    }
}
