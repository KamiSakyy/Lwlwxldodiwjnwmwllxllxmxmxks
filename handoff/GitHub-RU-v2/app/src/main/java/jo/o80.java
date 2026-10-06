package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o80 implements aaShadow.m0 {
    public p80 a;

    public o80(p80 p80Var) {
        this.a = p80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o80) && k71.k.b(this.a, ((o80) obj).a);
    }

    public final int hashCode() {
        p80 p80Var = this.a;
        if (p80Var == null) {
            return 0;
        }
        return p80Var.hashCode();
    }

    public final String toString() {
        return "Data(subscribeToCopilotLimited=" + this.a + ")";
    }
}
