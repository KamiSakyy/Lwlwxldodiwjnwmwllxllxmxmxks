package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v30 implements aaShadow.m0 {
    public final w30 a;

    public v30(w30 w30Var) {
        this.a = w30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v30) && k71.k.b(this.a, ((v30) obj).a);
    }

    public final int hashCode() {
        w30 w30Var = this.a;
        if (w30Var == null) {
            return 0;
        }
        return w30Var.hashCode();
    }

    public final String toString() {
        return "Data(unfollowUser=" + this.a + ")";
    }
}
