package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rg {
    public pg a;
    public String b;
    public String c;
    public String d;

    public rg(pg pgVar, String str, String str2, String str3) {
        this.a = pgVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj;
        return k71.k.b(this.a, rgVar.a) && k71.k.b(this.b, rgVar.b) && k71.k.b(this.c, rgVar.c) && k71.k.b(this.d, rgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(owner=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
