package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o4 {
    public final i4 a;
    public final String b;
    public final String c;

    public o4(i4 i4Var, String str, String str2) {
        this.a = i4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return k71.k.b(this.a, o4Var.a) && k71.k.b(this.b, o4Var.b) && k71.k.b(this.c, o4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(commit=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
