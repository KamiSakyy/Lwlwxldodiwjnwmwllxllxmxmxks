package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e10 {
    public final String a;
    public final d10 b;
    public final String c;

    public e10(String str, d10 d10Var, String str2) {
        this.a = str;
        this.b = d10Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e10)) {
            return false;
        }
        e10 e10Var = (e10) obj;
        return k71.k.b(this.a, e10Var.a) && k71.k.b(this.b, e10Var.b) && k71.k.b(this.c, e10Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        d10 d10Var = this.b;
        return this.c.hashCode() + ((hashCode + (d10Var == null ? 0 : d10Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", mergeQueue=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
