package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fi0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public eq.g e;

    public fi0(String str, String str2, String str3, String str4, eq.g gVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi0)) {
            return false;
        }
        fi0 fi0Var = (fi0) obj;
        return k71.k.b(this.a, fi0Var.a) && k71.k.b(this.b, fi0Var.b) && k71.k.b(this.c, fi0Var.c) && k71.k.b(this.d, fi0Var.d) && k71.k.b(this.e, fi0Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return this.e.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", login=", this.b, ", id=");
        f1.e.x(o, this.c, ", name=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
