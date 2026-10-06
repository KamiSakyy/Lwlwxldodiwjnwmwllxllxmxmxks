package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ks {
    public String a;
    public String b;
    public ls c;

    public ks(String str, String str2, ls lsVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = lsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks)) {
            return false;
        }
        ks ksVar = (ks) obj;
        return k71.k.b(this.a, ksVar.a) && k71.k.b(this.b, ksVar.b) && k71.k.b(this.c, ksVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ls lsVar = this.c;
        return i + (lsVar == null ? 0 : lsVar.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onRepository=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
