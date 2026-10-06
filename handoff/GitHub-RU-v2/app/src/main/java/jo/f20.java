package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f20 implements aaShadow.v0 {
    public j20 a;
    public String b;
    public String c;

    public f20(j20 j20Var, String str, String str2) {
        this.a = j20Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f20)) {
            return false;
        }
        f20 f20Var = (f20) obj;
        return k71.k.b(this.a, f20Var.a) && k71.k.b(this.b, f20Var.b) && k71.k.b(this.c, f20Var.c);
    }

    public final int hashCode() {
        j20 j20Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((j20Var == null ? 0 : j20Var.hashCode()) * 31, this.b, 31);
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
