package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a60 implements aaShadow.m0 {
    public c60 a;

    public a60(c60 c60Var) {
        this.a = c60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a60) && k71.k.b(this.a, ((a60) obj).a);
    }

    public final int hashCode() {
        c60 c60Var = this.a;
        if (c60Var == null) {
            return 0;
        }
        return c60Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
