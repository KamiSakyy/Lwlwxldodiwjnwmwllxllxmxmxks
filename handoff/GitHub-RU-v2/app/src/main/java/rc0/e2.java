package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 {
    public final String a;
    public final f2 b;

    public e2(String str, f2 f2Var) {
        this.a = str;
        this.b = f2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && k71.k.b(this.b, e2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnWorkflow(id=" + this.a + ", runs=" + this.b + ")";
    }
}
