package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nu {
    public String a;
    public iu b;
    public ku c;
    public lu d;
    public String e;

    public nu(String str, iu iuVar, ku kuVar, lu luVar, String str2) {
        this.a = str;
        this.b = iuVar;
        this.c = kuVar;
        this.d = luVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu)) {
            return false;
        }
        nu nuVar = (nu) obj;
        return k71.k.b(this.a, nuVar.a) && k71.k.b(this.b, nuVar.b) && k71.k.b(this.c, nuVar.c) && k71.k.b(this.d, nuVar.d) && k71.k.b(this.e, nuVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ku kuVar = this.c;
        int hashCode2 = (hashCode + (kuVar == null ? 0 : kuVar.hashCode())) * 31;
        lu luVar = this.d;
        return this.e.hashCode() + ((hashCode2 + (luVar != null ? luVar.hashCode() : 0)) * 31);
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
