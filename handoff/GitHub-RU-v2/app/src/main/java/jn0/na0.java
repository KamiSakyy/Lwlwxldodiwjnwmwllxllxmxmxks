package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class na0 {
    public final String a;
    public final oa0 b;
    public final String c;

    public na0(String str, oa0 oa0Var, String str2) {
        this.a = str;
        this.b = oa0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na0)) {
            return false;
        }
        na0 na0Var = (na0) obj;
        return k71.k.b(this.a, na0Var.a) && k71.k.b(this.b, na0Var.b) && k71.k.b(this.c, na0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oa0 oa0Var = this.b;
        return this.c.hashCode() + ((hashCode + (oa0Var == null ? 0 : oa0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Issue(id=");
        sb.append(this.a);
        sb.append(", issueType=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
