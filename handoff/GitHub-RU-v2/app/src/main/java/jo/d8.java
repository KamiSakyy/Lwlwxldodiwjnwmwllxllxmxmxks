package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d8 {
    public final f8 a;

    public d8(f8 f8Var) {
        this.a = f8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d8) && k71.k.b(this.a, ((d8) obj).a);
    }

    public final int hashCode() {
        f8 f8Var = this.a;
        if (f8Var == null) {
            return 0;
        }
        return f8Var.hashCode();
    }

    public final String toString() {
        return "CreateIssue(issue=" + this.a + ")";
    }
}
