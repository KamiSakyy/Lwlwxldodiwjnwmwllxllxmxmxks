package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rb0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public ud0.c e;

    public rb0(String str, String str2, String str3, String str4, ud0.c cVar) {
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
        if (!(obj instanceof rb0)) {
            return false;
        }
        rb0 rb0Var = (rb0) obj;
        return k71.k.b(this.a, rb0Var.a) && k71.k.b(this.b, rb0Var.b) && k71.k.b(this.c, rb0Var.c) && k71.k.b(this.d, rb0Var.d) && k71.k.b(this.e, rb0Var.e);
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
