package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tc implements aa.v0 {
    public final xc a;

    public tc(xc xcVar) {
        this.a = xcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc) && k71.k.b(this.a, ((tc) obj).a);
    }

    public final int hashCode() {
        xc xcVar = this.a;
        if (xcVar == null) {
            return 0;
        }
        return xcVar.hashCode();
    }

    public final String toString() {
        return "Data(topic=" + this.a + ")";
    }
}
