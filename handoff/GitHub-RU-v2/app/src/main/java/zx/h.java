package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.v0 {
    public j a;
    public i b;
    public String c;
    public String d;

    public h(j jVar, i iVar, String str, String str2) {
        this.a = jVar;
        this.b = iVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i iVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
