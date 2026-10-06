package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j70 implements aaShadow.m0 {
    public final l70 a;

    public j70(l70 l70Var) {
        this.a = l70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j70) && k71.k.b(this.a, ((j70) obj).a);
    }

    public final int hashCode() {
        l70 l70Var = this.a;
        if (l70Var == null) {
            return 0;
        }
        return l70Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
