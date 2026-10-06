package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yz {
    public String a;
    public wz b;
    public ja0.a c;

    public yz(String str, wz wzVar, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = wzVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return k71.k.b(this.a, yzVar.a) && k71.k.b(this.b, yzVar.b) && k71.k.b(this.c, yzVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wz wzVar = this.b;
        int hashCode2 = (hashCode + (wzVar == null ? 0 : wzVar.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryOwner(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
