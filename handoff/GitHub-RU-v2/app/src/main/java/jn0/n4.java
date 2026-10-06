package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n4 {
    public String a;
    public c4 b;
    public String c;

    public n4(String str, c4 c4Var, String str2) {
        this.a = str;
        this.b = c4Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return k71.k.b(this.a, n4Var.a) && k71.k.b(this.b, n4Var.b) && k71.k.b(this.c, n4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(id=");
        sb.append(this.a);
        sb.append(", contexts=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
