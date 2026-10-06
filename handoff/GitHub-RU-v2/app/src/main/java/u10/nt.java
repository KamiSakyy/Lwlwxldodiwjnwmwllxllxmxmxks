package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nt {
    public final String a;
    public final kt b;
    public final String c;

    public nt(String str, kt ktVar, String str2) {
        this.a = str;
        this.b = ktVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt)) {
            return false;
        }
        nt ntVar = (nt) obj;
        return k71.k.b(this.a, ntVar.a) && k71.k.b(this.b, ntVar.b) && k71.k.b(this.c, ntVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kt ktVar = this.b;
        return this.c.hashCode() + ((hashCode + (ktVar == null ? 0 : ktVar.hashCode())) * 31);
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
