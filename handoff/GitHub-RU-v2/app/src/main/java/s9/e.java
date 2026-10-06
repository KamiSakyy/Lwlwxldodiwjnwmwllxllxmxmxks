package s9;

/* loaded from: /home/user/work/p/classes.dex */
public final class e implements i {

    /* renamed from: r, reason: collision with root package name */
    public h f31772r;

    public e(h hVar) {
        this.f31772r = hVar;
    }

    @Override // s9.i
    public final Object d(g9.f fVar) {
        return this.f31772r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return k71.k.b(this.f31772r, ((e) obj).f31772r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31772r.hashCode();
    }
}
