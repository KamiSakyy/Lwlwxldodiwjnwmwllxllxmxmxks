package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c2 {
    public final f2 a;

    public c2(f2 f2Var) {
        this.a = f2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && k71.k.b(this.a, ((c2) obj).a);
    }

    public final int hashCode() {
        f2 f2Var = this.a;
        if (f2Var == null) {
            return 0;
        }
        return f2Var.hashCode();
    }

    public final String toString() {
        return "AddUpvote(subject=" + this.a + ")";
    }
}
