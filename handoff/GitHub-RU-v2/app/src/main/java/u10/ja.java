package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ja {
    public final String a;
    public final hc0.fq b;
    public final ia c;
    public final boolean d;
    public final String e;

    public ja(String str, hc0.fq fqVar, ia iaVar, boolean z, String str2) {
        this.a = str;
        this.b = fqVar;
        this.c = iaVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja)) {
            return false;
        }
        ja jaVar = (ja) obj;
        return k71.k.b(this.a, jaVar.a) && this.b == jaVar.b && k71.k.b(this.c, jaVar.c) && this.d == jaVar.d && k71.k.b(this.e, jaVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hc0.fq fqVar = this.b;
        return this.e.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (fqVar == null ? 0 : fqVar.hashCode())) * 31, this.c.a, 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", viewerPermission=");
        sb.append(this.b);
        sb.append(", owner=");
        sb.append(this.c);
        sb.append(", hasNestedDiscussionAnswersEnabled=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
