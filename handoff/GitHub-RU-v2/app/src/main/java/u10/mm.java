package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mm {
    public final String a;
    public final String b;
    public final ea0.j c;

    public mm(String str, String str2, ea0.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return k71.k.b(this.a, mmVar.a) && k71.k.b(this.b, mmVar.b) && k71.k.b(this.c, mmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", homePinnedItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
