package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 {
    public String a;
    public String b;
    public hp.o c;

    public q0(String str, String str2, hp.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && k71.k.b(this.c, q0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ViewerCopilotAgentTask(__typename=", this.a, ", taskId=", this.b, ", copilotAgentTaskFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
