package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r90 {
    public String a;
    public String b;
    public String c;
    public String d;
    public e30.c e;

    public r90(String str, String str2, String str3, String str4, e30.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r90)) {
            return false;
        }
        r90 r90Var = (r90) obj;
        return k71.k.b(this.a, r90Var.a) && k71.k.b(this.b, r90Var.b) && k71.k.b(this.c, r90Var.c) && k71.k.b(this.d, r90Var.d) && k71.k.b(this.e, r90Var.e);
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
