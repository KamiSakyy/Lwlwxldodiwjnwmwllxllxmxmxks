package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c6 {
    public v5 a;

    public c6(v5 v5Var) {
        this.a = v5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c6) && k71.k.b(this.a, ((c6) obj).a);
    }

    public final int hashCode() {
        v5 v5Var = this.a;
        if (v5Var == null) {
            return 0;
        }
        return v5Var.hashCode();
    }

    public final String toString() {
        return "OnRepository(gitObject=" + this.a + ")";
    }
}
