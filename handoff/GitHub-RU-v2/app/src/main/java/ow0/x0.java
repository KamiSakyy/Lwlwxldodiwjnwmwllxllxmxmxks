package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 {
    public String a;
    public u0 b;
    public String c;

    public x0(String str, u0 u0Var, String str2) {
        this.a = str;
        this.b = u0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u0 u0Var = this.b;
        return this.c.hashCode() + ((hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
