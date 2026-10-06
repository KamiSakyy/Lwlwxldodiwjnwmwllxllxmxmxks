package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e6 implements aaShadow.v0 {
    public f6 a;
    public String b;
    public String c;

    public e6(f6 f6Var, String str, String str2) {
        this.a = f6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return k71.k.b(this.a, e6Var.a) && k71.k.b(this.b, e6Var.b) && k71.k.b(this.c, e6Var.c);
    }

    public final int hashCode() {
        f6 f6Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((f6Var == null ? 0 : f6Var.hashCode()) * 31, this.b, 31);
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
