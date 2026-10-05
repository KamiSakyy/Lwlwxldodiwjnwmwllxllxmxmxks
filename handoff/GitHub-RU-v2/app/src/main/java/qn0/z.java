package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z implements aa.v0 {
    public final b0 a;
    public final String b;
    public final String c;

    public z(b0 b0Var, String str, String str2) {
        this.a = b0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b) && k71.k.b(this.c, zVar.c);
    }

    public final int hashCode() {
        b0 b0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((b0Var == null ? 0 : b0Var.hashCode()) * 31, this.b, 31);
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
