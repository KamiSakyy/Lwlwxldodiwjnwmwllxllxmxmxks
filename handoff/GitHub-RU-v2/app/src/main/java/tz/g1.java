package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 {
    public d0 a;
    public w b;

    public g1(d0 d0Var, w wVar) {
        this.a = d0Var;
        this.b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && k71.k.b(this.b, g1Var.b);
    }

    public final int hashCode() {
        d0 d0Var = this.a;
        return this.b.hashCode() + ((d0Var == null ? 0 : d0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldLabelValue(labels=" + this.a + ", field=" + this.b + ")";
    }
}
