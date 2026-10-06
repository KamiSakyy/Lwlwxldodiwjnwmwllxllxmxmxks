package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v4 {
    public final String a;
    public final String b;
    public final String c;

    public v4(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4)) {
            return false;
        }
        v4 v4Var = (v4) obj;
        return k71.k.b(this.a, v4Var.a) && k71.k.b(this.b, v4Var.b) && k71.k.b(this.c, v4Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("OnUser(__typename=", this.a, ", id=", this.b, ", name="), this.c, ")");
    }
}
