package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v10 implements aaShadow.v0 {
    public final y10 a;
    public final String b;
    public final String c;

    public v10(y10 y10Var, String str, String str2) {
        this.a = y10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v10)) {
            return false;
        }
        v10 v10Var = (v10) obj;
        return k71.k.b(this.a, v10Var.a) && k71.k.b(this.b, v10Var.b) && k71.k.b(this.c, v10Var.c);
    }

    public final int hashCode() {
        y10 y10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((y10Var == null ? 0 : y10Var.hashCode()) * 31, this.b, 31);
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
