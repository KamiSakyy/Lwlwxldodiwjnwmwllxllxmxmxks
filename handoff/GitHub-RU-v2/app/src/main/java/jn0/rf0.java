package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rf0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public cp0.g e;

    public rf0(String str, String str2, String str3, String str4, cp0.g gVar) {
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
        if (!(obj instanceof rf0)) {
            return false;
        }
        rf0 rf0Var = (rf0) obj;
        return k71.k.b(this.a, rf0Var.a) && k71.k.b(this.b, rf0Var.b) && k71.k.b(this.c, rf0Var.c) && k71.k.b(this.d, rf0Var.d) && k71.k.b(this.e, rf0Var.e);
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
