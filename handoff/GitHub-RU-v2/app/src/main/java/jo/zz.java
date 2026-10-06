package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zz {
    public vz a;
    public yz b;
    public String c;
    public String d;

    public zz(vz vzVar, yz yzVar, String str, String str2) {
        this.a = vzVar;
        this.b = yzVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz)) {
            return false;
        }
        zz zzVar = (zz) obj;
        return k71.k.b(this.a, zzVar.a) && k71.k.b(this.b, zzVar.b) && k71.k.b(this.c, zzVar.c) && k71.k.b(this.d, zzVar.d);
    }

    public final int hashCode() {
        vz vzVar = this.a;
        int hashCode = (vzVar == null ? 0 : vzVar.hashCode()) * 31;
        yz yzVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (yzVar != null ? yzVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", refs=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
