package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xx {
    public final String a;
    public final yx b;
    public final wx c;
    public final vx d;
    public final String e;

    public xx(String str, yx yxVar, wx wxVar, vx vxVar, String str2) {
        this.a = str;
        this.b = yxVar;
        this.c = wxVar;
        this.d = vxVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx)) {
            return false;
        }
        xx xxVar = (xx) obj;
        return k71.k.b(this.a, xxVar.a) && k71.k.b(this.b, xxVar.b) && k71.k.b(this.c, xxVar.c) && k71.k.b(this.d, xxVar.d) && k71.k.b(this.e, xxVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yx yxVar = this.b;
        int hashCode2 = (hashCode + (yxVar == null ? 0 : yxVar.hashCode())) * 31;
        wx wxVar = this.c;
        int hashCode3 = (hashCode2 + (wxVar == null ? 0 : Integer.hashCode(wxVar.a))) * 31;
        vx vxVar = this.d;
        return this.e.hashCode() + ((hashCode3 + (vxVar != null ? vxVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeQueue(id=");
        sb.append(this.a);
        sb.append(", mergingEntries=");
        sb.append(this.b);
        sb.append(", entriesCount=");
        sb.append(this.c);
        sb.append(", entries=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }



}
