package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ua {
    public String a;
    public String b;
    public va c;

    public ua(String str, String str2, va vaVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = vaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua)) {
            return false;
        }
        ua uaVar = (ua) obj;
        return k71.k.b(this.a, uaVar.a) && k71.k.b(this.b, uaVar.b) && k71.k.b(this.c, uaVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        va vaVar = this.c;
        return i + (vaVar == null ? 0 : vaVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
