package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pc implements aaShadow.m0 {
    public final qc a;

    public pc(qc qcVar) {
        this.a = qcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pc) && k71.k.b(this.a, ((pc) obj).a);
    }

    public final int hashCode() {
        qc qcVar = this.a;
        if (qcVar == null) {
            return 0;
        }
        return qcVar.hashCode();
    }

    public final String toString() {
        return "Data(dismissPullRequestReview=" + this.a + ")";
    }
}
