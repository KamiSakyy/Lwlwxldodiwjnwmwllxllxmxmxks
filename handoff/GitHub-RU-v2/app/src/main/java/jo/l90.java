package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l90 {
    public k90 a;
    public String b;
    public String c;

    public l90(k90 k90Var, String str, String str2) {
        this.a = k90Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l90)) {
            return false;
        }
        l90 l90Var = (l90) obj;
        return k71.k.b(this.a, l90Var.a) && k71.k.b(this.b, l90Var.b) && k71.k.b(this.c, l90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(topRepositories=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
