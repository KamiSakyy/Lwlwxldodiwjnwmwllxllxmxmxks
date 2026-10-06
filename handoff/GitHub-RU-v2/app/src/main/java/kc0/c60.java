package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c60 {
    public b60 a;

    public c60(b60 b60Var) {
        this.a = b60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c60) && k71.k.b(this.a, ((c60) obj).a);
    }

    public final int hashCode() {
        b60 b60Var = this.a;
        if (b60Var == null) {
            return 0;
        }
        return b60Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
