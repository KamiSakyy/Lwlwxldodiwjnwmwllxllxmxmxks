package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2 extends sy.s {
    public final String a;
    public final z1 b;

    public g2(String str, z1 z1Var) {
        this.a = str;
        this.b = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return k71.k.b(this.a, g2Var.a) && k71.k.b(this.b, g2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // sy.s
    public final String j() {
        return this.a;
    }

    public final String toString() {
        return "ExitPlanModePrompt(requestId=" + this.a + ", exitPlanModeInfo=" + this.b + ")";
    }
}
