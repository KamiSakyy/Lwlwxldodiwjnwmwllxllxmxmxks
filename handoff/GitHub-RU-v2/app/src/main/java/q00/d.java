package q00;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public v01.d a;

    public d(v01.d dVar) {
        k.g(dVar, "filterType");
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopRepositoryParameters(filterType=" + this.a + ")";
    }
}
