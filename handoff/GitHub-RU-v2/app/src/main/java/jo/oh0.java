package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oh0 implements aa.v0 {
    public final ph0 a;
    public final String b;
    public final String c;

    public oh0(ph0 ph0Var, String str, String str2) {
        this.a = ph0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh0)) {
            return false;
        }
        oh0 oh0Var = (oh0) obj;
        return k71.k.b(this.a, oh0Var.a) && k71.k.b(this.b, oh0Var.b) && k71.k.b(this.c, oh0Var.c);
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
