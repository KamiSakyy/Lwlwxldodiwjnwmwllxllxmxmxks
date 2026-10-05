package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pg {
    public final String a;
    public final String b;
    public final ja0.a c;

    public pg(String str, String str2, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return k71.k.b(this.a, pgVar.a) && k71.k.b(this.b, pgVar.b) && k71.k.b(this.c, pgVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ja0.a aVar = this.c;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return no.a.p(a0.s0.o("Owner(__typename=", this.a, ", login=", this.b, ", nodeIdFragment="), this.c, ")");
    }
}
