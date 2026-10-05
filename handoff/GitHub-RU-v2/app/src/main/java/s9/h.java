package s9;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f31777c;

    /* renamed from: a, reason: collision with root package name */
    public final k41.b f31778a;

    /* renamed from: b, reason: collision with root package name */
    public final k41.b f31779b;

    static {
        b bVar = b.f31766a;
        f31777c = new h(bVar, bVar);
    }

    public h(k41.b bVar, k41.b bVar2) {
        this.f31778a = bVar;
        this.f31779b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.f31778a, hVar.f31778a) && k71.k.b(this.f31779b, hVar.f31779b);
    }

    public final int hashCode() {
        return this.f31779b.hashCode() + (this.f31778a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f31778a + ", height=" + this.f31779b + ')';
    }
}
