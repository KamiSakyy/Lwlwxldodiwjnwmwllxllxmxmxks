package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gc0 implements aaShadow.m0 {
    public ic0 a;

    public gc0(ic0 ic0Var) {
        this.a = ic0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gc0) && k71.k.b(this.a, ((gc0) obj).a);
    }

    public final int hashCode() {
        ic0 ic0Var = this.a;
        if (ic0Var == null) {
            return 0;
        }
        return ic0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
