package com.github.rudroid.factories.actions;

import k71.k;
import y71.y;

/* loaded from: /home/user/work/p/classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public com.github.rudroid.cache.f f12298a;

    public e(com.github.rudroid.cache.f fVar) {
        k.g(fVar, "cacheDirProvider");
        this.f12298a = fVar;
    }

    public static final String a(e eVar, String str, int i) {
        return str + "_" + i + ".log";
    }

    public final c b(String str, int i) {
        k.g(str, "checkRunId");
        return new c(new y(this.f12298a.b(), new d(this, str, i, null), 6), this, str, i);
    }
}
