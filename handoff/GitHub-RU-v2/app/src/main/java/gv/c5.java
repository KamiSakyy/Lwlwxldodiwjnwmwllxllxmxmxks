package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c5 {
    public final String a;
    public final w5 b;
    public final String c;

    public c5(String str, w5 w5Var, String str2) {
        this.a = str;
        this.b = w5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return k71.k.b(this.a, c5Var.a) && k71.k.b(this.b, c5Var.b) && k71.k.b(this.c, c5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w5 w5Var = this.b;
        return this.c.hashCode() + ((hashCode + (w5Var == null ? 0 : Boolean.hashCode(w5Var.a))) * 31);
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
