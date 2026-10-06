package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kt {
    public String a;
    public String b;
    public w80.h0 c;

    public kt(String str, String str2, w80.h0 h0Var) {
        this.a = str;
        this.b = str2;
        this.c = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt)) {
            return false;
        }
        kt ktVar = (kt) obj;
        return k71.k.b(this.a, ktVar.a) && k71.k.b(this.b, ktVar.b) && k71.k.b(this.c, ktVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("BranchInfo(__typename=", this.a, ", id=", this.b, ", repositoryBranchInfoFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
