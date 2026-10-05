package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lo implements aa.v0 {
    public final qo a;

    public lo(qo qoVar) {
        this.a = qoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo) && k71.k.b(this.a, ((lo) obj).a);
    }

    public final int hashCode() {
        qo qoVar = this.a;
        if (qoVar == null) {
            return 0;
        }
        return qoVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
