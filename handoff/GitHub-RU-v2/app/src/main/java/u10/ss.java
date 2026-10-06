package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ss {
    public String a;
    public String b;
    public ts c;

    public ss(String str, String str2, ts tsVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = tsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss)) {
            return false;
        }
        ss ssVar = (ss) obj;
        return k71.k.b(this.a, ssVar.a) && k71.k.b(this.b, ssVar.b) && k71.k.b(this.c, ssVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ts tsVar = this.c;
        return i + (tsVar == null ? 0 : tsVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
