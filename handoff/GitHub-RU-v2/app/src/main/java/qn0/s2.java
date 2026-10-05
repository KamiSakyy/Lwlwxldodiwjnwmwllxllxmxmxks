package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s2 {
    public final String a;
    public final t2 b;

    public s2(String str, t2 t2Var) {
        this.a = str;
        this.b = t2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return k71.k.b(this.a, s2Var.a) && k71.k.b(this.b, s2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnWorkflow(id=" + this.a + ", runs=" + this.b + ")";
    }
}
