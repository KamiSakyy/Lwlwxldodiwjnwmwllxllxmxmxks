package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hc implements aaShadow.v0 {
    public final ic a;

    public hc(ic icVar) {
        this.a = icVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc) && k71.k.b(this.a, ((hc) obj).a);
    }

    public final int hashCode() {
        ic icVar = this.a;
        if (icVar == null) {
            return 0;
        }
        return icVar.hashCode();
    }

    public final String toString() {
        return "Data(enterpriseSupportContact=" + this.a + ")";
    }
}
