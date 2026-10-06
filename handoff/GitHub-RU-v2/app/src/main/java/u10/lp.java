package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lp {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public lp(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp)) {
            return false;
        }
        lp lpVar = (lp) obj;
        return k71.k.b(this.a, lpVar.a) && k71.k.b(this.b, lpVar.b) && k71.k.b(this.c, lpVar.c) && k71.k.b(this.d, lpVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(a0.s0.o("TagCommit(id=", this.a, ", oid=", this.b, ", abbreviatedOid="), this.c, ", __typename=", this.d, ")");
    }
}
