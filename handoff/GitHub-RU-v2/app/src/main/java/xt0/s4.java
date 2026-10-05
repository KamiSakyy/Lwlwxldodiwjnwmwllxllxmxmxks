package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s4 {
    public final String a;
    public final k5 b;
    public final String c;

    public s4(String str, k5 k5Var, String str2) {
        this.a = str;
        this.b = k5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return k71.k.b(this.a, s4Var.a) && k71.k.b(this.b, s4Var.b) && k71.k.b(this.c, s4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k5 k5Var = this.b;
        return this.c.hashCode() + ((hashCode + (k5Var == null ? 0 : Boolean.hashCode(k5Var.a))) * 31);
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
