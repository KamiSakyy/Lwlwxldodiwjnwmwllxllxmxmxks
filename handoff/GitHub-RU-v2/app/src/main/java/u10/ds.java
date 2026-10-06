package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ds {
    public String a;
    public String b;
    public es c;

    public ds(String str, String str2, es esVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = esVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds)) {
            return false;
        }
        ds dsVar = (ds) obj;
        return k71.k.b(this.a, dsVar.a) && k71.k.b(this.b, dsVar.b) && k71.k.b(this.c, dsVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        es esVar = this.c;
        return i + (esVar == null ? 0 : esVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
