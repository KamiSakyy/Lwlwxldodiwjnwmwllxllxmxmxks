package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k1 implements aa.v0 {
    public final l1 a;
    public final String b;
    public final String c;

    public k1(l1 l1Var, String str, String str2) {
        this.a = l1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return k71.k.b(this.a, k1Var.a) && k71.k.b(this.b, k1Var.b) && k71.k.b(this.c, k1Var.c);
    }

    public final int hashCode() {
        l1 l1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((l1Var == null ? 0 : l1Var.hashCode()) * 31, this.b, 31);
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
