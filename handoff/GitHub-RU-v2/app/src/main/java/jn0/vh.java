package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vh {
    public final String a;
    public final String b;
    public final kt0.q c;

    public vh(String str, String str2, kt0.q qVar) {
        this.a = str;
        this.b = str2;
        this.c = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh)) {
            return false;
        }
        vh vhVar = (vh) obj;
        return k71.k.b(this.a, vhVar.a) && k71.k.b(this.b, vhVar.b) && k71.k.b(this.c, vhVar.c);
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
