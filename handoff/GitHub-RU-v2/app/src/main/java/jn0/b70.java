package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b70 implements aaShadow.m0 {
    public d70 a;

    public b70(d70 d70Var) {
        this.a = d70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b70) && k71.k.b(this.a, ((b70) obj).a);
    }

    public final int hashCode() {
        d70 d70Var = this.a;
        if (d70Var == null) {
            return 0;
        }
        return d70Var.hashCode();
    }

    public final String toString() {
        return "Data(unresolveReviewThread=" + this.a + ")";
    }
}
