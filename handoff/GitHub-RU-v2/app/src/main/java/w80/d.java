package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public a f;
    public e g;

    public d(String str, String str2, String str3, String str4, String str5, a aVar, e eVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = aVar;
        this.g = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d) && k71.k.b(this.e, dVar.e) && k71.k.b(this.f, dVar.f) && k71.k.b(this.g, dVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int i = com.github.rudroid.copilot.h1.i((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, this.e, 31);
        a aVar = this.f;
        int hashCode4 = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.g;
        return hashCode4 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueTemplate(name=", this.a, ", about=", this.b, ", title=");
        f1.e.x(o, this.c, ", body=", this.d, ", filename=");
        o.append(this.e);
        o.append(", assignees=");
        o.append(this.f);
        o.append(", labels=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
