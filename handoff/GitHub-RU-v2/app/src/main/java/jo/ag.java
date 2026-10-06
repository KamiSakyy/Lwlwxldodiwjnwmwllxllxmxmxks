package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ag {
    public String a;
    public zf b;
    public String c;

    public ag(String str, zf zfVar, String str2) {
        this.a = str;
        this.b = zfVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag)) {
            return false;
        }
        ag agVar = (ag) obj;
        return k71.k.b(this.a, agVar.a) && k71.k.b(this.b, agVar.b) && k71.k.b(this.c, agVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        zf zfVar = this.b;
        return this.c.hashCode() + ((hashCode + (zfVar == null ? 0 : zfVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", repoObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
