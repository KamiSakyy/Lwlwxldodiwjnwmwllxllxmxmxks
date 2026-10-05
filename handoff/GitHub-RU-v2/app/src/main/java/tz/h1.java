package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h1 {
    public final e0 a;
    public final x b;

    public h1(e0 e0Var, x xVar) {
        this.a = e0Var;
        this.b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b);
    }

    public final int hashCode() {
        e0 e0Var = this.a;
        return this.b.hashCode() + ((e0Var == null ? 0 : e0Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldMilestoneValue(milestone=" + this.a + ", field=" + this.b + ")";
    }
}
