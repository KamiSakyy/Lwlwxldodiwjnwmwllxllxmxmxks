package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fv {
    public String a;
    public cv b;
    public String c;

    public fv(String str, cv cvVar, String str2) {
        this.a = str;
        this.b = cvVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv)) {
            return false;
        }
        fv fvVar = (fv) obj;
        return k71.k.b(this.a, fvVar.a) && k71.k.b(this.b, fvVar.b) && k71.k.b(this.c, fvVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cv cvVar = this.b;
        return this.c.hashCode() + ((hashCode + (cvVar == null ? 0 : cvVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", labels=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
