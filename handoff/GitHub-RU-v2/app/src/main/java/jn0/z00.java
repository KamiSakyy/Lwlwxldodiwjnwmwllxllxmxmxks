package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z00 {
    public final String a;
    public final y00 b;
    public final String c;

    public z00(String str, y00 y00Var, String str2) {
        this.a = str;
        this.b = y00Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z00)) {
            return false;
        }
        z00 z00Var = (z00) obj;
        return k71.k.b(this.a, z00Var.a) && k71.k.b(this.b, z00Var.b) && k71.k.b(this.c, z00Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        y00 y00Var = this.b;
        return this.c.hashCode() + ((hashCode + (y00Var == null ? 0 : y00Var.hashCode())) * 31);
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
