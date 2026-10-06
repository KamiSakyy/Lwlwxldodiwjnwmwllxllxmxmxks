package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mz {
    public String a;
    public dz b;
    public String c;

    public mz(String str, dz dzVar, String str2) {
        this.a = str;
        this.b = dzVar;
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
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", activePullRequests=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
