package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t4 {
    public String a;
    public o5 b;
    public String c;

    public t4(String str, o5 o5Var, String str2) {
        this.a = str;
        this.b = o5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return k71.k.b(this.a, t4Var.a) && k71.k.b(this.b, t4Var.b) && k71.k.b(this.c, t4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o5 o5Var = this.b;
        return this.c.hashCode() + ((hashCode + (o5Var == null ? 0 : Boolean.hashCode(o5Var.a))) * 31);
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
