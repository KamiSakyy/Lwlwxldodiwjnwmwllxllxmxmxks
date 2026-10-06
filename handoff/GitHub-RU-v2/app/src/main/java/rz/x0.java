package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 implements aa.v0 {
    public a1 a;
    public String b;
    public String c;

    public x0(a1 a1Var, String str, String str2) {
        this.a = a1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c);
    }

    public final int hashCode() {
        a1 a1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((a1Var == null ? 0 : a1Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repositoryOwner=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
