package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l50 implements aaShadow.m0 {
    public n50 a;

    public l50(n50 n50Var) {
        this.a = n50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l50) && k71.k.b(this.a, ((l50) obj).a);
    }

    public final int hashCode() {
        n50 n50Var = this.a;
        if (n50Var == null) {
            return 0;
        }
        return n50Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
