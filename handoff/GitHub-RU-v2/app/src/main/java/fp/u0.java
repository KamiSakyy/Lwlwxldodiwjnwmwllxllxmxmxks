package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 {
    public final String a;
    public final String b;
    public final hp.o c;

    public u0(String str, String str2, hp.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && k71.k.b(this.b, u0Var.b) && k71.k.b(this.c, u0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", taskId=", this.b, ", copilotAgentTaskFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
