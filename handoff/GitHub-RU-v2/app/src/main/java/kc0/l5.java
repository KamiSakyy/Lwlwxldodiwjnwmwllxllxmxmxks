package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l5 {
    public final String a;
    public final k5 b;
    public final String c;

    public l5(String str, k5 k5Var, String str2) {
        this.a = str;
        this.b = k5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5)) {
            return false;
        }
        l5 l5Var = (l5) obj;
        return k71.k.b(this.a, l5Var.a) && k71.k.b(this.b, l5Var.b) && k71.k.b(this.c, l5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k5 k5Var = this.b;
        return this.c.hashCode() + ((hashCode + (k5Var == null ? 0 : k5Var.hashCode())) * 31);
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
