package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements aa.v0 {
    public k0 a;
    public String b;
    public String c;

    public j0(k0 k0Var, String str, String str2) {
        this.a = k0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && k71.k.b(this.b, j0Var.b) && k71.k.b(this.c, j0Var.c);
    }

    public final int hashCode() {
        k0 k0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((k0Var == null ? 0 : k0Var.hashCode()) * 31, this.b, 31);
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
