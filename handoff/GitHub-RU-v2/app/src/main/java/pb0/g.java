package pb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public v01.d a;

    public g(v01.d dVar) {
        k71.k.g(dVar, "filterType");
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a == ((g) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopRepositoryParameters(filterType=" + this.a + ")";
    }
}
