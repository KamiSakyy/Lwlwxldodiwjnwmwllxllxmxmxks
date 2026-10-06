package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v8 {
    public final String a;
    public final String b;
    public final w8 c;

    public v8(String str, String str2, w8 w8Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = w8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return k71.k.b(this.a, v8Var.a) && k71.k.b(this.b, v8Var.b) && k71.k.b(this.c, v8Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        w8 w8Var = this.c;
        return i + (w8Var == null ? 0 : w8Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
