package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jz {
    public String a;
    public String b;
    public dw.l1 c;

    public jz(String str, String str2, dw.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return k71.k.b(this.a, jzVar.a) && k71.k.b(this.b, jzVar.b) && k71.k.b(this.c, jzVar.c);
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
