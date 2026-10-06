package y3;

import androidx.compose.ui.layout.b0;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements b0 {

    /* renamed from: r, reason: collision with root package name */
    public final d f34208r;

    /* renamed from: s, reason: collision with root package name */
    public final j71.c f34209s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f34210t;

    public h(d dVar, j71.c cVar) {
        this.f34208r = dVar;
        this.f34209s = cVar;
        this.f34210t = dVar.f34195b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.f34208r.f34195b, hVar.f34208r.f34195b) && this.f34209s == hVar.f34209s;
    }

    public final int hashCode() {
        return this.f34209s.hashCode() + (this.f34208r.f34195b.hashCode() * 31);
    }

    @Override // androidx.compose.ui.layout.b0
    public final Object o() {
        return this.f34210t;
    }
}
