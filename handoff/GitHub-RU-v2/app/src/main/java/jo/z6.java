package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z6 implements aaShadow.v0 {
    public d7 a;
    public String b;
    public String c;

    public z6(d7 d7Var, String str, String str2) {
        this.a = d7Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return k71.k.b(this.a, z6Var.a) && k71.k.b(this.b, z6Var.b) && k71.k.b(this.c, z6Var.c);
    }

    public final int hashCode() {
        d7 d7Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((d7Var == null ? 0 : d7Var.hashCode()) * 31, this.b, 31);
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
