package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h90 implements aa.v0 {
    public final l90 a;
    public final String b;
    public final String c;

    public h90(l90 l90Var, String str, String str2) {
        this.a = l90Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h90)) {
            return false;
        }
        h90 h90Var = (h90) obj;
        return k71.k.b(this.a, h90Var.a) && k71.k.b(this.b, h90Var.b) && k71.k.b(this.c, h90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
