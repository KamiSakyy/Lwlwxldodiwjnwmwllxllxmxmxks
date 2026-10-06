package com.github.rudroid.home;

/* loaded from: /home/user/work/p/classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final xk.g f14916a;

    /* renamed from: b, reason: collision with root package name */
    public final jd.a f14917b;

    /* renamed from: c, reason: collision with root package name */
    public final hd.b f14918c;

    public c(xk.g gVar, jd.a aVar, hd.b bVar) {
        k71.k.g(aVar, "notificationsBannerData");
        k71.k.g(bVar, "inAppUpdateStateData");
        this.f14916a = gVar;
        this.f14917b = aVar;
        this.f14918c = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.f14916a, cVar.f14916a) && k71.k.b(this.f14917b, cVar.f14917b) && k71.k.b(this.f14918c, cVar.f14918c);
    }

    public final int hashCode() {
        xk.g gVar = this.f14916a;
        return this.f14918c.hashCode() + ((this.f14917b.hashCode() + ((gVar == null ? 0 : gVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "HomeBanners(ghesDeprecationData=" + this.f14916a + ", notificationsBannerData=" + this.f14917b + ", inAppUpdateStateData=" + this.f14918c + ")";
    }
    public Object name() { return null; }
    public Object v(Object p1) { return null; }
}
