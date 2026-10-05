package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n10 {
    public final String a;
    public final m10 b;
    public final g10 c;
    public final List d;
    public final String e;

    public n10(String str, m10 m10Var, g10 g10Var, List list, String str2) {
        this.a = str;
        this.b = m10Var;
        this.c = g10Var;
        this.d = list;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n10)) {
            return false;
        }
        n10 n10Var = (n10) obj;
        return k71.k.b(this.a, n10Var.a) && k71.k.b(this.b, n10Var.b) && k71.k.b(this.c, n10Var.c) && k71.k.b(this.d, n10Var.d) && k71.k.b(this.e, n10Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m10 m10Var = this.b;
        int hashCode2 = (hashCode + (m10Var == null ? 0 : m10Var.hashCode())) * 31;
        g10 g10Var = this.c;
        int hashCode3 = (hashCode2 + (g10Var == null ? 0 : g10Var.hashCode())) * 31;
        List list = this.d;
        return this.e.hashCode() + ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", comparison=");
        sb.append(this.c);
        sb.append(", pullRequestTemplates=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
