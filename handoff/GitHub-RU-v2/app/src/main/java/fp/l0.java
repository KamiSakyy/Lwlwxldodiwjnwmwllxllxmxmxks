package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public final String a;
    public final String b;
    public final hp.y c;

    public l0(String str, String str2, hp.y yVar) {
        this.a = str;
        this.b = str2;
        this.c = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ViewerCopilotAgentSession(__typename=", this.a, ", sessionId=", this.b, ", viewerAgentSessionFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object Q(Object p1) { return null; }
}
