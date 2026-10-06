package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ec {
    public final String a;
    public final boolean b;
    public final bc c;
    public final ic d;
    public final String e;

    public ec(String str, boolean z, bc bcVar, ic icVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = bcVar;
        this.d = icVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return k71.k.b(this.a, ecVar.a) && this.b == ecVar.b && k71.k.b(this.c, ecVar.c) && k71.k.b(this.d, ecVar.d) && k71.k.b(this.e, ecVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        bc bcVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((e + (bcVar == null ? 0 : bcVar.hashCode())) * 31)) * 31);
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
