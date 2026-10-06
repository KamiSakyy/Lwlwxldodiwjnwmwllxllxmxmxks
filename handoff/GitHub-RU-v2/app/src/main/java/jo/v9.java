package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v9 implements aaShadow.m0 {
    public final w9 a;

    public v9(w9 w9Var) {
        this.a = w9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9) && k71.k.b(this.a, ((v9) obj).a);
    }

    public final int hashCode() {
        w9 w9Var = this.a;
        if (w9Var == null) {
            return 0;
        }
        return w9Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteIssueComment=" + this.a + ")";
    }
}
