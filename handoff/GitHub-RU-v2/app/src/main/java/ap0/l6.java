package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l6 {
    public final i6 a;
    public final String b;
    public final String c;

    public l6(i6 i6Var, String str, String str2) {
        this.a = i6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return k71.k.b(this.a, l6Var.a) && k71.k.b(this.b, l6Var.b) && k71.k.b(this.c, l6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(commit=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
