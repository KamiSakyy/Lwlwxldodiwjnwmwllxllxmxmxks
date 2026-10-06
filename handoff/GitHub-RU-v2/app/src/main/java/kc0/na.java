package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class na {
    public String a;
    public boolean b;
    public ka c;
    public ra d;
    public String e;

    public na(String str, boolean z, ka kaVar, ra raVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = kaVar;
        this.d = raVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return k71.k.b(this.a, naVar.a) && this.b == naVar.b && k71.k.b(this.c, naVar.c) && k71.k.b(this.d, naVar.d) && k71.k.b(this.e, naVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        ka kaVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((e + (kaVar == null ? 0 : kaVar.hashCode())) * 31)) * 31);
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
