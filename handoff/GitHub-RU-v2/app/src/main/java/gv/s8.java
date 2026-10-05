package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public s8(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8)) {
            return false;
        }
        s8 s8Var = (s8) obj;
        return k71.k.b(this.a, s8Var.a) && k71.k.b(this.b, s8Var.b) && k71.k.b(this.c, s8Var.c) && k71.k.b(this.d, s8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("OnBot(id=", this.a, ", login=", this.b, ", displayName="), this.c, ", avatarUrl=", this.d, ")");
    }
}
