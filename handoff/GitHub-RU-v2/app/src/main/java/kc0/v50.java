package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v50 implements aaShadow.m0 {
    public x50 a;

    public v50(x50 x50Var) {
        this.a = x50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v50) && k71.k.b(this.a, ((v50) obj).a);
    }

    public final int hashCode() {
        x50 x50Var = this.a;
        if (x50Var == null) {
            return 0;
        }
        return x50Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
