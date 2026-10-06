package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class si {
    public String a;
    public String b;
    public tu.s c;

    public si(String str, String str2, tu.s sVar) {
        this.a = str;
        this.b = str2;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si)) {
            return false;
        }
        si siVar = (si) obj;
        return k71.k.b(this.a, siVar.a) && k71.k.b(this.b, siVar.b) && k71.k.b(this.c, siVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnOrganization(__typename=", this.a, ", id=", this.b, ", organizationListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
