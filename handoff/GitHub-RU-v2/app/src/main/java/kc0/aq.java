package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aq implements aaShadow.v0 {
    public final nq a;

    public aq(nq nqVar) {
        this.a = nqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aq) && k71.k.b(this.a, ((aq) obj).a);
    }

    public final int hashCode() {
        nq nqVar = this.a;
        if (nqVar == null) {
            return 0;
        }
        return nqVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
