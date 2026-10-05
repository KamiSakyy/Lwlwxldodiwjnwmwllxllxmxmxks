package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g7 {
    public final i7 a;

    public g7(i7 i7Var) {
        this.a = i7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7) && k71.k.b(this.a, ((g7) obj).a);
    }

    public final int hashCode() {
        i7 i7Var = this.a;
        if (i7Var == null) {
            return 0;
        }
        return i7Var.hashCode();
    }

    public final String toString() {
        return "CreateIssue(issue=" + this.a + ")";
    }
}
