package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w30 {
    public final x30 a;

    public w30(x30 x30Var) {
        this.a = x30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w30) && k71.k.b(this.a, ((w30) obj).a);
    }

    public final int hashCode() {
        x30 x30Var = this.a;
        if (x30Var == null) {
            return 0;
        }
        return x30Var.hashCode();
    }

    public final String toString() {
        return "UnfollowUser(user=" + this.a + ")";
    }
}
