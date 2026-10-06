package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t8 {
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;

    public t8(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return false;
        }
        t8 t8Var = (t8) obj;
        return k71.k.b(this.a, t8Var.a) && k71.k.b(this.b, t8Var.b) && k71.k.b(this.c, t8Var.c) && k71.k.b(this.d, t8Var.d) && this.e == t8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnUser(id=", this.a, ", login=", this.b, ", displayName=");
        f1.e.x(o, this.c, ", avatarUrl=", this.d, ", isViewer=");
        return jo.f4.s(o, this.e, ")");
    }
}
