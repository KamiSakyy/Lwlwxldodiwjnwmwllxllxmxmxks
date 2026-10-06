package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e3 {
    public String a;
    public vo.w1 b;

    public e3(String str, vo.w1 w1Var) {
        this.a = str;
        this.b = w1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return k71.k.b(this.a, e3Var.a) && k71.k.b(this.b, e3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Workflows(__typename=" + this.a + ", workflowConnectionFragment=" + this.b + ")";
    }
}
