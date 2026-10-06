package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jb0 {
    public kb0 a;

    public jb0(kb0 kb0Var) {
        this.a = kb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb0) && k71.k.b(this.a, ((jb0) obj).a);
    }

    public final int hashCode() {
        kb0 kb0Var = this.a;
        if (kb0Var == null) {
            return 0;
        }
        return kb0Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserDashboardPins(user=" + this.a + ")";
    }
}
