package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public String a;
    public f0 b;
    public String c;

    public e0(String str, f0 f0Var, String str2) {
        this.a = str;
        this.b = f0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && k71.k.b(this.c, e0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f0 f0Var = this.b;
        return this.c.hashCode() + ((hashCode + (f0Var == null ? 0 : f0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", viewerCodingAgents=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
