package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k6 implements aaShadow.v0 {
    public final p6 a;
    public final String b;
    public final String c;

    public k6(p6 p6Var, String str, String str2) {
        this.a = p6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6)) {
            return false;
        }
        k6 k6Var = (k6) obj;
        return k71.k.b(this.a, k6Var.a) && k71.k.b(this.b, k6Var.b) && k71.k.b(this.c, k6Var.c);
    }

    public final int hashCode() {
        p6 p6Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((p6Var == null ? 0 : p6Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
