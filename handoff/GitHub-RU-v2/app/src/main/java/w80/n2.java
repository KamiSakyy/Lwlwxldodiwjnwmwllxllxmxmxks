package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n2 {
    public String a;
    public String b;
    public String c;
    public e30.c d;

    public n2(String str, String str2, String str3, e30.c cVar) {
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
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return k71.k.b(this.a, n2Var.a) && k71.k.b(this.b, n2Var.b) && k71.k.b(this.c, n2Var.c) && k71.k.b(this.d, n2Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        e30.c cVar = this.d;
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
