package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s implements aa.h0 {
    public String a;
    public String b;
    public q c;
    public yh0.a d;

    public s(String str, String str2, q qVar, yh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c) && k71.k.b(this.d, sVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        q qVar = this.c;
        return this.d.hashCode() + ((i + (qVar == null ? 0 : qVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OrgBlockableIssueFragment(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", orgBlockableFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
