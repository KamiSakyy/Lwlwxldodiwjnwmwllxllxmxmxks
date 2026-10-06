package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kz {
    public final String a;
    public final boolean b;
    public final String c;
    public final w80.q3 d;

    public kz(String str, boolean z, String str2, w80.q3 q3Var) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz)) {
            return false;
        }
        kz kzVar = (kz) obj;
        return k71.k.b(this.a, kzVar.a) && this.b == kzVar.b && k71.k.b(this.c, kzVar.c) && k71.k.b(this.d, kzVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Node(__typename=", this.a, ", isArchived=", ", id=", this.b);
        o.append(this.c);
        o.append(", simpleRepositoryFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
