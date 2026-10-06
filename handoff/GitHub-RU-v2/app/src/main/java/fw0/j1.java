package fw0;

import pz0.p20;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 {
    public String a;
    public p20 b;
    public String c;

    public j1(String str, p20 p20Var, String str2) {
        this.a = str;
        this.b = p20Var;
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
        return k71.k.b(this.a, j1Var.a) && this.b == j1Var.b && k71.k.b(this.c, j1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(displayName=");
        sb.append(this.a);
        sb.append(", provider=");
        sb.append(this.b);
        sb.append(", url=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
