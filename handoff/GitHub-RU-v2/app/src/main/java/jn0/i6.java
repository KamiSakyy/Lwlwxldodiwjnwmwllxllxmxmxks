package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i6 {
    public b6 a;

    public i6(b6 b6Var) {
        this.a = b6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i6) && k71.k.b(this.a, ((i6) obj).a);
    }

    public final int hashCode() {
        b6 b6Var = this.a;
        if (b6Var == null) {
            return 0;
        }
        return b6Var.hashCode();
    }

    public final String toString() {
        return "OnRepository(gitObject=" + this.a + ")";
    }
}
