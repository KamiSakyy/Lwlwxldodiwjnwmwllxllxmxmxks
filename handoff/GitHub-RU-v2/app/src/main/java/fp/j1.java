package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 {
    public i1 a;
    public String b;
    public String c;

    public j1(i1 i1Var, String str, String str2) {
        this.a = i1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return k71.k.b(this.a, j1Var.a) && k71.k.b(this.b, j1Var.b) && k71.k.b(this.c, j1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(repositoryCustomAgents=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
