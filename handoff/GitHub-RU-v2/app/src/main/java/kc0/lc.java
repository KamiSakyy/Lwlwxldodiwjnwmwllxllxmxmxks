package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lc implements aa.v0 {
    public final qc a;

    public lc(qc qcVar) {
        this.a = qcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc) && k71.k.b(this.a, ((lc) obj).a);
    }

    public final int hashCode() {
        qc qcVar = this.a;
        if (qcVar == null) {
            return 0;
        }
        return qcVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
