package er;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 {
    public String a;
    public String b;
    public String c;
    public j1 d;

    public g1(String str, String str2, String str3, j1 j1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return k71.k.b(this.a, g1Var.a) && k71.k.b(this.b, g1Var.b) && k71.k.b(this.c, g1Var.c) && k71.k.b(this.d, g1Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        j1 j1Var = this.d;
        return hashCode + (j1Var != null ? j1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", avatarUrl=", this.b, ", name=");
        o.append(this.c);
        o.append(", user=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
