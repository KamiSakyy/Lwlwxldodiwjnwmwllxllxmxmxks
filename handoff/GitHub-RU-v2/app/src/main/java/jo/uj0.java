package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uj0 implements aaShadow.v0 {
    public yj0 a;
    public String b;
    public String c;

    public uj0(yj0 yj0Var, String str, String str2) {
        this.a = yj0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj0)) {
            return false;
        }
        uj0 uj0Var = (uj0) obj;
        return k71.k.b(this.a, uj0Var.a) && k71.k.b(this.b, uj0Var.b) && k71.k.b(this.c, uj0Var.c);
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
