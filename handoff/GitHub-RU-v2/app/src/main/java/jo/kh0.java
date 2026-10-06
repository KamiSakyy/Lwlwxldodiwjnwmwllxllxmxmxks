package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kh0 {
    public final ih0 a;
    public final String b;
    public final String c;

    public kh0(ih0 ih0Var, String str, String str2) {
        this.a = ih0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh0)) {
            return false;
        }
        kh0 kh0Var = (kh0) obj;
        return k71.k.b(this.a, kh0Var.a) && k71.k.b(this.b, kh0Var.b) && k71.k.b(this.c, kh0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(contributionsCollection=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
