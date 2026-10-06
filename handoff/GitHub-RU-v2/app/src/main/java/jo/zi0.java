package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zi0 implements aaShadow.v0 {
    public final aj0 a;
    public final String b;
    public final String c;

    public zi0(aj0 aj0Var, String str, String str2) {
        this.a = aj0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi0)) {
            return false;
        }
        zi0 zi0Var = (zi0) obj;
        return k71.k.b(this.a, zi0Var.a) && k71.k.b(this.b, zi0Var.b) && k71.k.b(this.c, zi0Var.c);
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
