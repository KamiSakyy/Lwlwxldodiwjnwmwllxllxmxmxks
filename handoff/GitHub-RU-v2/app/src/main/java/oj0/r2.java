package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r2 {
    public String a;
    public String b;
    public String c;
    public ud0.c d;

    public r2(String str, String str2, String str3, ud0.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.a, r2Var.a) && k71.k.b(this.b, r2Var.b) && k71.k.b(this.c, r2Var.c) && k71.k.b(this.d, r2Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        ud0.c cVar = this.d;
        return i + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", login=");
        o.append(this.c);
        o.append(", avatarFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
