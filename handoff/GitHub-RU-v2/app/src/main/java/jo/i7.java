package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i7 implements aaShadow.m0 {
    public final h7 a;

    public i7(h7 h7Var) {
        this.a = h7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i7) && k71.k.b(this.a, ((i7) obj).a);
    }

    public final int hashCode() {
        h7 h7Var = this.a;
        if (h7Var == null) {
            return 0;
        }
        return h7Var.hashCode();
    }

    public final String toString() {
        return "Data(createCommitOnBranch=" + this.a + ")";
    }
}
