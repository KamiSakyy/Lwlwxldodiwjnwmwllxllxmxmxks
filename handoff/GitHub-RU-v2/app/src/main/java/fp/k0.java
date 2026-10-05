package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    public final l0 a;
    public final String b;
    public final String c;

    public k0(l0 l0Var, String str, String str2) {
        this.a = l0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && k71.k.b(this.b, k0Var.b) && k71.k.b(this.c, k0Var.c);
    }

    public final int hashCode() {
        l0 l0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((l0Var == null ? 0 : l0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(viewerCopilotAgentSession=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
