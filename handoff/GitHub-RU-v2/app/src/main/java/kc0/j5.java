package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 implements aaShadow.v0 {
    public final l5 a;

    public j5(l5 l5Var) {
        this.a = l5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5) && k71.k.b(this.a, ((j5) obj).a);
    }

    public final int hashCode() {
        l5 l5Var = this.a;
        if (l5Var == null) {
            return 0;
        }
        return l5Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
