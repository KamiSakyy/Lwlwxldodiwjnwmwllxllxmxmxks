package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 implements aa.v0 {
    public final p0 a;
    public final String b;
    public final String c;

    public l0(p0 p0Var, String str, String str2) {
        this.a = p0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c);
    }

    public final int hashCode() {
        p0 p0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((p0Var == null ? 0 : p0Var.hashCode()) * 31, this.b, 31);
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
