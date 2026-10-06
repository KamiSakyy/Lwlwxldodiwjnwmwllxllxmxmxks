package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements aaShadow.m0 {
    public o0 a;

    public r0(o0 o0Var) {
        this.a = o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && k71.k.b(this.a, ((r0) obj).a);
    }

    public final int hashCode() {
        o0 o0Var = this.a;
        if (o0Var == null) {
            return 0;
        }
        return o0Var.hashCode();
    }

    public final String toString() {
        return "Data(addPullRequestReviewThread=" + this.a + ")";
    }
}
