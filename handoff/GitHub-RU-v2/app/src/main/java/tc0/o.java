package tc0;

import aa.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements v0 {
    public final p a;

    public o(p pVar) {
        this.a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && k71.k.b(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        p pVar = this.a;
        if (pVar == null) {
            return 0;
        }
        return pVar.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
