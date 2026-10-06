package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hb {
    public String a;
    public boolean b;
    public eb c;
    public lb d;
    public String e;

    public hb(String str, boolean z, eb ebVar, lb lbVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = ebVar;
        this.d = lbVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return k71.k.b(this.a, hbVar.a) && this.b == hbVar.b && k71.k.b(this.c, hbVar.c) && k71.k.b(this.d, hbVar.d) && k71.k.b(this.e, hbVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        eb ebVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((e + (ebVar == null ? 0 : ebVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Discussion(id=", this.a, ", locked=", ", author=", this.b);
        o.append(this.c);
        o.append(", repository=");
        o.append(this.d);
        o.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(o, this.e, ")");
    }
}
