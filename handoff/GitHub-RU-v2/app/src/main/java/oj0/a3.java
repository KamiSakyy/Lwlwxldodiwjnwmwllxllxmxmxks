package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a3 {
    public String a;
    public String b;
    public ud0.c c;

    public a3(String str, String str2, ud0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return k71.k.b(this.a, a3Var.a) && k71.k.b(this.b, a3Var.b) && k71.k.b(this.c, a3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Author(__typename=", this.a, ", login=", this.b, ", avatarFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
