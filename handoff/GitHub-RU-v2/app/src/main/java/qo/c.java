package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final b b;
    public final boolean c;
    public final l d;
    public final o e;
    public final a f;
    public final String g;

    public c(String str, b bVar, boolean z, l lVar, o oVar, a aVar, String str2) {
        this.a = str;
        this.b = bVar;
        this.c = z;
        this.d = lVar;
        this.e = oVar;
        this.f = aVar;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b) && this.c == cVar.c && k71.k.b(this.d, cVar.d) && k71.k.b(this.e, cVar.e) && k71.k.b(this.f, cVar.f) && k71.k.b(this.g, cVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        b bVar = this.b;
        int hashCode2 = (this.d.hashCode() + x.i.e((hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.c)) * 31;
        o oVar = this.e;
        int hashCode3 = (hashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        a aVar = this.f;
        return this.g.hashCode() + ((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSuite(id=");
        sb.append(this.a);
        sb.append(", branch=");
        sb.append(this.b);
        sb.append(", rerunnable=");
        sb.append(this.c);
        sb.append(", repository=");
        sb.append(this.d);
        sb.append(", workflowRun=");
        sb.append(this.e);
        sb.append(", app=");
        sb.append(this.f);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.g, ")");
    }
}
