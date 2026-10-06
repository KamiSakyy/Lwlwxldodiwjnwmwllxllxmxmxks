package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tq {
    public int a;
    public String b;
    public pq c;
    public qq d;
    public String e;
    public String f;

    public tq(int i, String str, pq pqVar, qq qqVar, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = pqVar;
        this.d = qqVar;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq)) {
            return false;
        }
        tq tqVar = (tq) obj;
        return this.a == tqVar.a && k71.k.b(this.b, tqVar.b) && k71.k.b(this.c, tqVar.c) && k71.k.b(this.d, tqVar.d) && k71.k.b(this.e, tqVar.e) && k71.k.b(this.f, tqVar.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a) * 31, this.b, 31);
        pq pqVar = this.c;
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i((this.d.hashCode() + ((i + (pqVar == null ? 0 : pqVar.hashCode())) * 31)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "Discussion(number=", ", title=", this.b, ", author=");
        n.append(this.c);
        n.append(", category=");
        n.append(this.d);
        n.append(", id=");
        return x.i.k(n, this.e, ", __typename=", this.f, ")");
    }
}
