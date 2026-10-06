package pb0;

import aa.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements v0 {
    public c a;

    public b(c cVar) {
        this.a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k71.k.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        c cVar = this.a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
