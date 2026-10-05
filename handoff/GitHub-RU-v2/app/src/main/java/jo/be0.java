package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class be0 implements aa.m0 {
    public final de0 a;

    public be0(de0 de0Var) {
        this.a = de0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof be0) && k71.k.b(this.a, ((be0) obj).a);
    }

    public final int hashCode() {
        de0 de0Var = this.a;
        if (de0Var == null) {
            return 0;
        }
        return de0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
