package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 {
    public final x0 a;
    public final String b;
    public final String c;

    public w0(x0 x0Var, String str, String str2) {
        this.a = x0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return k71.k.b(this.a, w0Var.a) && k71.k.b(this.b, w0Var.b) && k71.k.b(this.c, w0Var.c);
    }

    public final int hashCode() {
        x0 x0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((x0Var == null ? 0 : x0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(viewerCopilotAgentTasks=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
