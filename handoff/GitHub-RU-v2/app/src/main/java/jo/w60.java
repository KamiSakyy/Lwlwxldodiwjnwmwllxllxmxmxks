package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w60 implements aaShadow.v0 {
    public a70 a;
    public String b;
    public String c;

    public w60(a70 a70Var, String str, String str2) {
        this.a = a70Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w60)) {
            return false;
        }
        w60 w60Var = (w60) obj;
        return k71.k.b(this.a, w60Var.a) && k71.k.b(this.b, w60Var.b) && k71.k.b(this.c, w60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
