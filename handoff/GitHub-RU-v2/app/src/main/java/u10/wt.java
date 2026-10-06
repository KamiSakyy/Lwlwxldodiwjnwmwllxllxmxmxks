package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wt {
    public String a;
    public String b;
    public String c;

    public wt(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt)) {
            return false;
        }
        wt wtVar = (wt) obj;
        return k71.k.b(this.a, wtVar.a) && k71.k.b(this.b, wtVar.b) && k71.k.b(this.c, wtVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("DefaultBranchRef(name=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
