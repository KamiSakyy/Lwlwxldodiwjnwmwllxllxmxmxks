package p8;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final n8.b f30421a;

    /* renamed from: b, reason: collision with root package name */
    public final b f30422b;

    /* renamed from: c, reason: collision with root package name */
    public final b f30423c;

    public c(n8.b bVar, b bVar2, b bVar3) {
        this.f30421a = bVar;
        this.f30422b = bVar2;
        this.f30423c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f29648a != 0 && bVar.f29649b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        k71.k.e(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return k71.k.b(this.f30421a, cVar.f30421a) && k71.k.b(this.f30422b, cVar.f30422b) && k71.k.b(this.f30423c, cVar.f30423c);
    }

    public final int hashCode() {
        return this.f30423c.hashCode() + ((this.f30422b.hashCode() + (this.f30421a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f30421a + ", type=" + this.f30422b + ", state=" + this.f30423c + " }";
    }
}
