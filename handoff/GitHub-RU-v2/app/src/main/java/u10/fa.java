package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fa {
    public String a;
    public boolean b;
    public ca c;
    public ja d;
    public String e;

    public fa(String str, boolean z, ca caVar, ja jaVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = caVar;
        this.d = jaVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        return k71.k.b(this.a, faVar.a) && this.b == faVar.b && k71.k.b(this.c, faVar.c) && k71.k.b(this.d, faVar.d) && k71.k.b(this.e, faVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        ca caVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((e + (caVar == null ? 0 : caVar.hashCode())) * 31)) * 31);
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
