package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.v0 {
    public e0 a;
    public String b;
    public String c;

    public b0(e0 e0Var, String str, String str2) {
        this.a = e0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && k71.k.b(this.c, b0Var.c);
    }

    public final int hashCode() {
        e0 e0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((e0Var == null ? 0 : e0Var.hashCode()) * 31, this.b, 31);
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
