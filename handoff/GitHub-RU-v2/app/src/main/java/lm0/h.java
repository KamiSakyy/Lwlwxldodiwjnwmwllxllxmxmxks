package lm0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final v01.d a;

    public h(v01.d dVar) {
        k71.k.g(dVar, "filterType");
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a == ((h) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopRepositoryParameters(filterType=" + this.a + ")";
    }
}
