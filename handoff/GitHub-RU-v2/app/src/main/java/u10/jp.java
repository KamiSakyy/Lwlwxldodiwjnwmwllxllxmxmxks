package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jp {
    public final String a;
    public final ep b;
    public final gp c;
    public final hp d;
    public final String e;

    public jp(String str, ep epVar, gp gpVar, hp hpVar, String str2) {
        this.a = str;
        this.b = epVar;
        this.c = gpVar;
        this.d = hpVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp)) {
            return false;
        }
        jp jpVar = (jp) obj;
        return k71.k.b(this.a, jpVar.a) && k71.k.b(this.b, jpVar.b) && k71.k.b(this.c, jpVar.c) && k71.k.b(this.d, jpVar.d) && k71.k.b(this.e, jpVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gp gpVar = this.c;
        int hashCode2 = (hashCode + (gpVar == null ? 0 : gpVar.hashCode())) * 31;
        hp hpVar = this.d;
        return this.e.hashCode() + ((hashCode2 + (hpVar != null ? hpVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", ref=");
        sb.append(this.c);
        sb.append(", release=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
