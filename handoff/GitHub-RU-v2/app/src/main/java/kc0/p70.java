package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p70 {
    public String a;
    public w70 b;
    public String c;

    public p70(String str, w70 w70Var, String str2) {
        this.a = str;
        this.b = w70Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p70)) {
            return false;
        }
        p70 p70Var = (p70) obj;
        return k71.k.b(this.a, p70Var.a) && k71.k.b(this.b, p70Var.b) && k71.k.b(this.c, p70Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w70 w70Var = this.b;
        return this.c.hashCode() + ((hashCode + (w70Var == null ? 0 : Boolean.hashCode(w70Var.a))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeadRef(id=");
        sb.append(this.a);
        sb.append(", refUpdateRule=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
