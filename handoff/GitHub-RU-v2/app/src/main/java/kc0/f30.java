package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f30 {
    public e30 a;
    public String b;
    public String c;

    public f30(e30 e30Var, String str, String str2) {
        this.a = e30Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return k71.k.b(this.a, f30Var.a) && k71.k.b(this.b, f30Var.b) && k71.k.b(this.c, f30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(topRepositories=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
