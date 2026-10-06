package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ks {
    public String a;
    public String b;
    public cp0.g c;

    public ks(String str, String str2, cp0.g gVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = gVar;
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
        cp0.g gVar = this.c;
        return i + (gVar == null ? 0 : gVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", avatarFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
