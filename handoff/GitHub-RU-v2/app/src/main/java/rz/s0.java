package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 implements aa.v0 {
    public final u0 a;
    public final String b;
    public final String c;

    public s0(u0 u0Var, String str, String str2) {
        this.a = u0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b) && k71.k.b(this.c, s0Var.c);
    }

    public final int hashCode() {
        u0 u0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((u0Var == null ? 0 : u0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
