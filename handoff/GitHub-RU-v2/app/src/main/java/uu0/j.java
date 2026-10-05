package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final g f;
    public final k g;
    public final n h;

    public j(String str, String str2, String str3, String str4, String str5, g gVar, k kVar, n nVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = gVar;
        this.g = kVar;
        this.h = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && k71.k.b(this.e, jVar.e) && k71.k.b(this.f, jVar.f) && k71.k.b(this.g, jVar.g) && k71.k.b(this.h, jVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int i = com.github.rudroid.copilot.h1.i((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, this.e, 31);
        g gVar = this.f;
        int hashCode4 = (i + (gVar == null ? 0 : gVar.hashCode())) * 31;
        k kVar = this.g;
        int hashCode5 = (hashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        n nVar = this.h;
        return hashCode5 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueTemplate(name=", this.a, ", about=", this.b, ", title=");
        f1.e.x(o, this.c, ", body=", this.d, ", filename=");
        o.append(this.e);
        o.append(", assignees=");
        o.append(this.f);
        o.append(", labels=");
        o.append(this.g);
        o.append(", type=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
