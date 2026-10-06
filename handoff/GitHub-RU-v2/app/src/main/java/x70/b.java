package x70;

import aa.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements v0 {
    public e a;

    public b(e eVar) {
        this.a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k71.k.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        e eVar = this.a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
