package com.github.rudroid.cache;

@c71.e(c = "com.github.rudroid.cache.DefaultCacheDirProvider$provideCacheSubDir$$inlined$map$1$2", f = "DefaultCacheDirProvider.kt", l = {50}, m = "emit", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
public class b extends c71.c {

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f8733u;

    /* renamed from: v, reason: collision with root package name */
    public int f8734v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f8735w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, a71.c cVar2) {
        super(cVar2);
        this.f8735w = cVar;
    }

    public final Object v(Object obj) {
        this.f8733u = obj;
        this.f8734v |= Integer.MIN_VALUE;
        return this.f8735w.c(null, this);
    }
}
