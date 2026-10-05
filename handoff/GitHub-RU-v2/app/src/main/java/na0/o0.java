package na0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public final String a;
    public final l0 b;
    public final String c;

    public o0(String str, l0 l0Var, String str2) {
        this.a = str;
        this.b = l0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b) && k71.k.b(this.c, o0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l0 l0Var = this.b;
        return this.c.hashCode() + ((hashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31);
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
