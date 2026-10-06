package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ep {
    public final String a;
    public final String b;
    public final e30.c c;

    public ep(String str, String str2, e30.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return k71.k.b(this.a, epVar.a) && k71.k.b(this.b, epVar.b) && k71.k.b(this.c, epVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        e30.c cVar = this.c;
        return i + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Owner(__typename=", this.a, ", id=", this.b, ", avatarFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
