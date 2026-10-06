package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m6 {
    public final o6 a;

    public m6(o6 o6Var) {
        this.a = o6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m6) && k71.k.b(this.a, ((m6) obj).a);
    }

    public final int hashCode() {
        o6 o6Var = this.a;
        if (o6Var == null) {
            return 0;
        }
        return o6Var.hashCode();
    }

    public final String toString() {
        return "CreateDiscussion(discussion=" + this.a + ")";
    }
}
