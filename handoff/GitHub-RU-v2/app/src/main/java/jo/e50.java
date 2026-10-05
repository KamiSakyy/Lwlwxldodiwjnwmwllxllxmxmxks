package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e50 implements aa.v0 {
    public final i50 a;
    public final String b;
    public final String c;

    public e50(i50 i50Var, String str, String str2) {
        this.a = i50Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e50)) {
            return false;
        }
        e50 e50Var = (e50) obj;
        return k71.k.b(this.a, e50Var.a) && k71.k.b(this.b, e50Var.b) && k71.k.b(this.c, e50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(search=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
