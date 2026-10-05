package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e2 {
    public final String a;
    public final String b;
    public final vo.h2 c;

    public e2(String str, String str2, vo.h2 h2Var) {
        this.a = str;
        this.b = str2;
        this.c = h2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && k71.k.b(this.b, e2Var.b) && k71.k.b(this.c, e2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnWorkflow(__typename=", this.a, ", id=", this.b, ", workflowInputsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
