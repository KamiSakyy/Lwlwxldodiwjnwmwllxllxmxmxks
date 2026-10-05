package com.github.rudroid.cache;

import c71.j;
import java.io.File;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.cache.DefaultCacheDirProvider$provideCacheSubDir$2", f = "DefaultCacheDirProvider.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class e extends j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8738v;

    public final a71.c r(a71.c cVar, Object obj) {
        e eVar = new e(2, cVar);
        eVar.f8738v = obj;
        return eVar;
    }

    public final Object s(Object obj, Object obj2) {
        e r10 = r((a71.c) obj2, (File) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        File file = (File) this.f8738v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        if (!file.exists()) {
            file.mkdirs();
        }
        return a0.a;
    }
}
