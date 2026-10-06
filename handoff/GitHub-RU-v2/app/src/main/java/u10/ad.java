package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ad {
    public String a;
    public String b;
    public w80.v3 c;

    public ad(String str, String str2, w80.v3 v3Var) {
        this.a = str;
        this.b = str2;
        this.c = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return k71.k.b(this.a, adVar.a) && k71.k.b(this.b, adVar.b) && k71.k.b(this.c, adVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", userListMetadataForRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
