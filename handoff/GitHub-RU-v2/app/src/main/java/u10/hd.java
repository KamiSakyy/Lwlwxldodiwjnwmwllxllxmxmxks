package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hd {
    public final String a;
    public final fd b;
    public final String c;

    public hd(String str, fd fdVar, String str2) {
        this.a = str;
        this.b = fdVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd)) {
            return false;
        }
        hd hdVar = (hd) obj;
        return k71.k.b(this.a, hdVar.a) && k71.k.b(this.b, hdVar.b) && k71.k.b(this.c, hdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        fd fdVar = this.b;
        return this.c.hashCode() + ((hashCode + (fdVar == null ? 0 : fdVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", object=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
