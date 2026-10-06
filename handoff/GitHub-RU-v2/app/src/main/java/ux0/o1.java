package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o1 {
    public l1 a;
    public String b;
    public String c;

    public o1(l1 l1Var, String str, String str2) {
        this.a = l1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return k71.k.b(this.a, o1Var.a) && k71.k.b(this.b, o1Var.b) && k71.k.b(this.c, o1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(allProjectsV2=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
