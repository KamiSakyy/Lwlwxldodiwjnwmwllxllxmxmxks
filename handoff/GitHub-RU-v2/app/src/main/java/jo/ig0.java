package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ig0 implements aaShadow.m0 {
    public kg0 a;

    public ig0(kg0 kg0Var) {
        this.a = kg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ig0) && k71.k.b(this.a, ((ig0) obj).a);
    }

    public final int hashCode() {
        kg0 kg0Var = this.a;
        if (kg0Var == null) {
            return 0;
        }
        return kg0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDashboardSearchShortcut=" + this.a + ")";
    }
}
