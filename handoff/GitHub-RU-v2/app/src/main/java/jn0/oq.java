package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oq implements aa.v0 {
    public final nq a;
    public final lq b;
    public final pq c;
    public final uq d;
    public final String e;
    public final String f;

    public oq(nq nqVar, lq lqVar, pq pqVar, uq uqVar, String str, String str2) {
        this.a = nqVar;
        this.b = lqVar;
        this.c = pqVar;
        this.d = uqVar;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq)) {
            return false;
        }
        oq oqVar = (oq) obj;
        return k71.k.b(this.a, oqVar.a) && k71.k.b(this.b, oqVar.b) && k71.k.b(this.c, oqVar.c) && k71.k.b(this.d, oqVar.d) && k71.k.b(this.e, oqVar.e) && k71.k.b(this.f, oqVar.f);
    }

    public final int hashCode() {
        nq nqVar = this.a;
        int hashCode = (nqVar == null ? 0 : nqVar.hashCode()) * 31;
        lq lqVar = this.b;
        int hashCode2 = (hashCode + (lqVar == null ? 0 : lqVar.hashCode())) * 31;
        pq pqVar = this.c;
        int hashCode3 = (hashCode2 + (pqVar == null ? 0 : pqVar.hashCode())) * 31;
        uq uqVar = this.d;
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i((hashCode3 + (uqVar != null ? uqVar.hashCode() : 0)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(created=");
        sb.append(this.a);
        sb.append(", assigned=");
        sb.append(this.b);
        sb.append(", mentioned=");
        sb.append(this.c);
        sb.append(", requested=");
        sb.append(this.d);
        sb.append(", id=");
        return x.i.k(sb, this.e, ", __typename=", this.f, ")");
    }
}
