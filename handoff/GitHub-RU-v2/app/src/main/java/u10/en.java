package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class en {
    public String a;
    public String b;
    public fn c;

    public en(String str, String str2, fn fnVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = fnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en)) {
            return false;
        }
        en enVar = (en) obj;
        return k71.k.b(this.a, enVar.a) && k71.k.b(this.b, enVar.b) && k71.k.b(this.c, enVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        fn fnVar = this.c;
        return i + (fnVar == null ? 0 : fnVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequestReview=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
