package wk0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public ud0.c e;

    public q0(String str, String str2, String str3, String str4, ud0.c cVar) {
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
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && k71.k.b(this.c, q0Var.c) && k71.k.b(this.d, q0Var.d) && k71.k.b(this.e, q0Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("SimpleUserListItemFragment(__typename=", this.a, ", id=", this.b, ", name=");
        f1.e.x(o, this.c, ", login=", this.d, ", avatarFragment=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
