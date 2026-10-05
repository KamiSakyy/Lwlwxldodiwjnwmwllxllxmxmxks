package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pv implements aa.v0 {
    public final qv a;

    public pv(qv qvVar) {
        this.a = qvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv) && k71.k.b(this.a, ((pv) obj).a);
    }

    public final int hashCode() {
        qv qvVar = this.a;
        if (qvVar == null) {
            return 0;
        }
        return qvVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
