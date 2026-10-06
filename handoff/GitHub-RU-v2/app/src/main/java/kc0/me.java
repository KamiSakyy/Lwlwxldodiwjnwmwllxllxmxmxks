package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class me implements aaShadow.v0 {
    public final qe a;

    public me(qe qeVar) {
        this.a = qeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof me) && k71.k.b(this.a, ((me) obj).a);
    }

    public final int hashCode() {
        qe qeVar = this.a;
        if (qeVar == null) {
            return 0;
        }
        return qeVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
