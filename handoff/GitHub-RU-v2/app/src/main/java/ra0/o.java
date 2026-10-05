package ra0;

import aa.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o implements v0 {
    public final q a;

    public o(q qVar) {
        this.a = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && k71.k.b(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        q qVar = this.a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public final String toString() {
        return "Data(list=" + this.a + ")";
    }
}
