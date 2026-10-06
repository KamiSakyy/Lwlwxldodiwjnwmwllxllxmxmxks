package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ji implements aaShadow.v0 {
    public ki a;
    public yi b;
    public zi c;
    public aj d;
    public wi e;
    public hi f;
    public String g;
    public String h;

    public ji(ki kiVar, yi yiVar, zi ziVar, aj ajVar, wi wiVar, hi hiVar, String str, String str2) {
        this.a = kiVar;
        this.b = yiVar;
        this.c = ziVar;
        this.d = ajVar;
        this.e = wiVar;
        this.f = hiVar;
        this.g = str;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji)) {
            return false;
        }
        ji jiVar = (ji) obj;
        return k71.k.b(this.a, jiVar.a) && k71.k.b(this.b, jiVar.b) && k71.k.b(this.c, jiVar.c) && k71.k.b(this.d, jiVar.d) && k71.k.b(this.e, jiVar.e) && k71.k.b(this.f, jiVar.f) && k71.k.b(this.g, jiVar.g) && k71.k.b(this.h, jiVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        hi hiVar = this.f;
        return this.h.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (hiVar == null ? 0 : hiVar.hashCode())) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(issues=");
        sb.append(this.a);
        sb.append(", pullRequests=");
        sb.append(this.b);
        sb.append(", repos=");
        sb.append(this.c);
        sb.append(", users=");
        sb.append(this.d);
        sb.append(", organizations=");
        sb.append(this.e);
        sb.append(", code=");
        sb.append(this.f);
        sb.append(", id=");
        return x.i.k(sb, this.g, ", __typename=", this.h, ")");
    }
}
