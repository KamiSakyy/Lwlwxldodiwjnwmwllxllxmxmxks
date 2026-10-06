package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i4 {
    public final String a;
    public final b5 b;
    public final String c;

    public i4(String str, b5 b5Var, String str2) {
        this.a = str;
        this.b = b5Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return k71.k.b(this.a, i4Var.a) && k71.k.b(this.b, i4Var.b) && k71.k.b(this.c, i4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b5 b5Var = this.b;
        return this.c.hashCode() + ((hashCode + (b5Var == null ? 0 : Boolean.hashCode(b5Var.a))) * 31);
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
