package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z5 implements aaShadow.v0 {
    public final b6 a;
    public final String b;
    public final String c;

    public z5(b6 b6Var, String str, String str2) {
        this.a = b6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return k71.k.b(this.a, z5Var.a) && k71.k.b(this.b, z5Var.b) && k71.k.b(this.c, z5Var.c);
    }

    public final int hashCode() {
        b6 b6Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((b6Var == null ? 0 : b6Var.hashCode()) * 31, this.b, 31);
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
