package wk0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final ud0.c g;

    public c1(String str, String str2, String str3, String str4, String str5, boolean z, ud0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && k71.k.b(this.b, c1Var.b) && k71.k.b(this.c, c1Var.c) && k71.k.b(this.d, c1Var.d) && k71.k.b(this.e, c1Var.e) && this.f == c1Var.f && k71.k.b(this.g, c1Var.g);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.g.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31), this.e, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserListItemFragment(__typename=", this.a, ", id=", this.b, ", name=");
        f1.e.x(o, this.c, ", login=", this.d, ", bioHTML=");
        com.github.rudroid.m0.x(o, this.e, ", viewerIsFollowing=", this.f, ", avatarFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
