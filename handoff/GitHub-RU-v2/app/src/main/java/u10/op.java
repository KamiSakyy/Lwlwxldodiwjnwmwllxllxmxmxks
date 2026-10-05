package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class op {
    public final String a;
    public final String b;
    public final dp c;

    public op(String str, String str2, dp dpVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = dpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op)) {
            return false;
        }
        op opVar = (op) obj;
        return k71.k.b(this.a, opVar.a) && k71.k.b(this.b, opVar.b) && k71.k.b(this.c, opVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        dp dpVar = this.c;
        return i + (dpVar == null ? 0 : dpVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onTag=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
