package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m2 {
    public String a;
    public a3 b;

    public m2(String str, a3 a3Var) {
        this.a = str;
        this.b = a3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return k71.k.b(this.a, m2Var.a) && k71.k.b(this.b, m2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlanRow(__typename=" + this.a + ", planRowFragment=" + this.b + ")";
    }
}
