package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class he0 {
    public String a;
    public oe0 b;
    public String c;

    public he0(String str, oe0 oe0Var, String str2) {
        this.a = str;
        this.b = oe0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he0)) {
            return false;
        }
        he0 he0Var = (he0) obj;
        return k71.k.b(this.a, he0Var.a) && k71.k.b(this.b, he0Var.b) && k71.k.b(this.c, he0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        oe0 oe0Var = this.b;
        return this.c.hashCode() + ((hashCode + (oe0Var == null ? 0 : Boolean.hashCode(oe0Var.a))) * 31);
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
