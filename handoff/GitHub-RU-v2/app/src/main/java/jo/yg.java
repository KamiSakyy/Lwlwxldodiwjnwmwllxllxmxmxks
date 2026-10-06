package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yg {
    public String a;
    public tg b;
    public String c;

    public yg(String str, tg tgVar, String str2) {
        this.a = str;
        this.b = tgVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg)) {
            return false;
        }
        yg ygVar = (yg) obj;
        return k71.k.b(this.a, ygVar.a) && k71.k.b(this.b, ygVar.b) && k71.k.b(this.c, ygVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tg tgVar = this.b;
        return this.c.hashCode() + ((hashCode + (tgVar == null ? 0 : tgVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", gitObject=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
