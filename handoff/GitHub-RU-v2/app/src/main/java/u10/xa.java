package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xa {
    public String a;
    public String b;
    public ya c;

    public xa(String str, String str2, ya yaVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = yaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa)) {
            return false;
        }
        xa xaVar = (xa) obj;
        return k71.k.b(this.a, xaVar.a) && k71.k.b(this.b, xaVar.b) && k71.k.b(this.c, xaVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ya yaVar = this.c;
        return i + (yaVar == null ? 0 : yaVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onDiscussion=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
