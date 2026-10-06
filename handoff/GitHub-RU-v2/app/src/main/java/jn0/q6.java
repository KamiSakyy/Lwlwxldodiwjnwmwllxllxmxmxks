package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q6 {
    public s6 a;

    public q6(s6 s6Var) {
        this.a = s6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6) && k71.k.b(this.a, ((q6) obj).a);
    }

    public final int hashCode() {
        s6 s6Var = this.a;
        if (s6Var == null) {
            return 0;
        }
        return s6Var.hashCode();
    }

    public final String toString() {
        return "Diff(patch=" + this.a + ")";
    }
}
