package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w00 implements aaShadow.v0 {
    public b10 a;
    public String b;
    public String c;

    public w00(b10 b10Var, String str, String str2) {
        this.a = b10Var;
        this.b = str;
        this.c = str2;
    }

    public static w00 a(w00 w00Var, b10 b10Var) {
        String str = w00Var.b;
        String str2 = w00Var.c;
        w00Var.getClass();
        return new w00(b10Var, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00Var = (w00) obj;
        return k71.k.b(this.a, w00Var.a) && k71.k.b(this.b, w00Var.b) && k71.k.b(this.c, w00Var.c);
    }

    public final int hashCode() {
        b10 b10Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((b10Var == null ? 0 : b10Var.hashCode()) * 31, this.b, 31);
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
