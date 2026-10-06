package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t7 implements aaShadow.m0 {
    public u7 a;

    public t7(u7 u7Var) {
        this.a = u7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7) && k71.k.b(this.a, ((t7) obj).a);
    }

    public final int hashCode() {
        u7 u7Var = this.a;
        if (u7Var == null) {
            return 0;
        }
        return u7Var.hashCode();
    }

    public final String toString() {
        return "Data(deleteDiscussionComment=" + this.a + ")";
    }
}
