package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t6 {
    public String a;
    public o6 b;
    public String c;

    public t6(String str, o6 o6Var, String str2) {
        this.a = str;
        this.b = o6Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6)) {
            return false;
        }
        t6 t6Var = (t6) obj;
        return k71.k.b(this.a, t6Var.a) && k71.k.b(this.b, t6Var.b) && k71.k.b(this.c, t6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o6 o6Var = this.b;
        return this.c.hashCode() + ((hashCode + (o6Var == null ? 0 : o6Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", comparison=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
