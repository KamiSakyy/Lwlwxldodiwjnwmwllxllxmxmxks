package we0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public String b;
    public String c;
    public a0 d;

    public d(String str, String str2, String str3, a0 a0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.d;
        return hashCode + (a0Var != null ? a0Var.hashCode() : 0);
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
