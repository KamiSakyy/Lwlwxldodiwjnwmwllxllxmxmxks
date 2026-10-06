package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a8 implements aaShadow.m0 {
    public final b8 a;

    public a8(b8 b8Var) {
        this.a = b8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a8) && k71.k.b(this.a, ((a8) obj).a);
    }

    public final int hashCode() {
        b8 b8Var = this.a;
        if (b8Var == null) {
            return 0;
        }
        return b8Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteDiscussion=" + this.a + ")";
    }
}
