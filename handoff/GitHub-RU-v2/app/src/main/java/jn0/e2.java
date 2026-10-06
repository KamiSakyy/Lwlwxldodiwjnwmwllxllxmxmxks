package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 implements aaShadow.m0 {
    public c2 a;

    public e2(c2 c2Var) {
        this.a = c2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && k71.k.b(this.a, ((e2) obj).a);
    }

    public final int hashCode() {
        c2 c2Var = this.a;
        if (c2Var == null) {
            return 0;
        }
        return c2Var.hashCode();
    }

    public final String toString() {
        return "Data(addUpvote=" + this.a + ")";
    }
}
