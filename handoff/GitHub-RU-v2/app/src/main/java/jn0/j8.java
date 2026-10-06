package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j8 {
    public final String a;
    public final q8 b;
    public final String c;

    public j8(String str, q8 q8Var, String str2) {
        this.a = str;
        this.b = q8Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8)) {
            return false;
        }
        j8 j8Var = (j8) obj;
        return k71.k.b(this.a, j8Var.a) && k71.k.b(this.b, j8Var.b) && k71.k.b(this.c, j8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q8 q8Var = this.b;
        return this.c.hashCode() + ((hashCode + (q8Var == null ? 0 : q8Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Answer(id=");
        sb.append(this.a);
        sb.append(", replyTo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
