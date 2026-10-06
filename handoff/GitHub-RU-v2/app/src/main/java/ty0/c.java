package ty0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public v01.d a;

    public c(v01.d dVar) {
        k.g(dVar, "filterType");
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TopRepositoryParameters(filterType=" + this.a + ")";
    }
}
