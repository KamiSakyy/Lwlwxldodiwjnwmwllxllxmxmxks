package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t70 {
    public final u70 a;

    public t70(u70 u70Var) {
        this.a = u70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t70) && k71.k.b(this.a, ((t70) obj).a);
    }

    public final int hashCode() {
        u70 u70Var = this.a;
        if (u70Var == null) {
            return 0;
        }
        return u70Var.hashCode();
    }

    public final String toString() {
        return "UnfollowUser(user=" + this.a + ")";
    }
}
