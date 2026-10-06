package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mz {
    public String a;
    public jz b;
    public String c;

    public mz(String str, jz jzVar, String str2) {
        this.a = str;
        this.b = jzVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz)) {
            return false;
        }
        mz mzVar = (mz) obj;
        return k71.k.b(this.a, mzVar.a) && k71.k.b(this.b, mzVar.b) && k71.k.b(this.c, mzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        jz jzVar = this.b;
        return this.c.hashCode() + ((hashCode + (jzVar == null ? 0 : jzVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", branchInfo=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
