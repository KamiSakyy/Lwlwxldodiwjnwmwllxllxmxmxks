package dl0;

import aa.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements v0 {
    public final c a;

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
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
