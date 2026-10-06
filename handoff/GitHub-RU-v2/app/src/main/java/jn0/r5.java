package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r5 {
    public String a;
    public q5 b;
    public String c;

    public r5(String str, q5 q5Var, String str2) {
        this.a = str;
        this.b = q5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return k71.k.b(this.a, r5Var.a) && k71.k.b(this.b, r5Var.b) && k71.k.b(this.c, r5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q5 q5Var = this.b;
        return this.c.hashCode() + ((hashCode + (q5Var == null ? 0 : q5Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", gitObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
