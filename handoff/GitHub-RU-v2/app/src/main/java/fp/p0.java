package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 {
    public q0 a;
    public String b;
    public String c;

    public p0(q0 q0Var, String str, String str2) {
        this.a = q0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b) && k71.k.b(this.c, p0Var.c);
    }

    public final int hashCode() {
        q0 q0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((q0Var == null ? 0 : q0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(viewerCopilotAgentTask=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
