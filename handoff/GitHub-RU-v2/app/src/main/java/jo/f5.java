package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f5 {
    public j5 a;

    public f5(j5 j5Var) {
        this.a = j5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5) && k71.k.b(this.a, ((f5) obj).a);
    }

    public final int hashCode() {
        j5 j5Var = this.a;
        if (j5Var == null) {
            return 0;
        }
        return j5Var.hashCode();
    }

    public final String toString() {
        return "CloseIssue(issue=" + this.a + ")";
    }
}
