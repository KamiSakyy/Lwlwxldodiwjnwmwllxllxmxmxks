package we0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 {
    public final String a;
    public final String b;
    public final String c;
    public final k1 d;

    public h1(String str, String str2, String str3, k1 k1Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b) && k71.k.b(this.c, h1Var.c) && k71.k.b(this.d, h1Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        k1 k1Var = this.d;
        return hashCode + (k1Var != null ? k1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Committer(__typename=", this.a, ", avatarUrl=", this.b, ", name=");
        o.append(this.c);
        o.append(", user=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
