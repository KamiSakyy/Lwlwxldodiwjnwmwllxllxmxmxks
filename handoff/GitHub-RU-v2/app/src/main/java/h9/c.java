package h9;

/* loaded from: /home/user/work/p/classes.dex */
public final class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public i2.b f25554a;

    public c(i2.b bVar) {
        this.f25554a = bVar;
    }

    @Override // h9.e
    public final i2.b a() {
        return this.f25554a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k71.k.b(this.f25554a, ((c) obj).f25554a);
    }

    public final int hashCode() {
        i2.b bVar = this.f25554a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f25554a + ')';
    }
}
