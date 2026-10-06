package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n8 implements aaShadow.m0 {
    public o8 a;

    public n8(o8 o8Var) {
        this.a = o8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8) && k71.k.b(this.a, ((n8) obj).a);
    }

    public final int hashCode() {
        o8 o8Var = this.a;
        if (o8Var == null) {
            return 0;
        }
        return o8Var.hashCode();
    }

    public final String toString() {
        return "Data(deleteDiscussionComment=" + this.a + ")";
    }
}
