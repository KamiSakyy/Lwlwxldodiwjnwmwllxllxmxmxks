package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public String b;
    public e c;
    public String d;

    public h(String str, String str2, e eVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        e eVar = this.c;
        return this.d.hashCode() + ((i + (eVar == null ? 0 : eVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Commit(id=", this.a, ", abbreviatedOid=", this.b, ", associatedPullRequests=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
