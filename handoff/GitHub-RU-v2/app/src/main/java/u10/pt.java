package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pt {
    public String a;
    public String b;
    public w80.h0 c;

    public pt(String str, String str2, w80.h0 h0Var) {
        this.a = str;
        this.b = str2;
        this.c = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt)) {
            return false;
        }
        pt ptVar = (pt) obj;
        return k71.k.b(this.a, ptVar.a) && k71.k.b(this.b, ptVar.b) && k71.k.b(this.c, ptVar.c);
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
