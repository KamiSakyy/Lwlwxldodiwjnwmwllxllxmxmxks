package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v {
    public final String a;
    public final q b;

    public v(String str, q qVar) {
        this.a = str;
        this.b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q qVar = this.b;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "OnCheckSuite(id=" + this.a + ", checkRuns=" + this.b + ")";
    }
}
