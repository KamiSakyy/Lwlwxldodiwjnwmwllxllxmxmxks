package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nr {
    public final String a;
    public final mr b;
    public final String c;

    public nr(String str, mr mrVar, String str2) {
        this.a = str;
        this.b = mrVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr)) {
            return false;
        }
        nr nrVar = (nr) obj;
        return k71.k.b(this.a, nrVar.a) && k71.k.b(this.b, nrVar.b) && k71.k.b(this.c, nrVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mr mrVar = this.b;
        return this.c.hashCode() + ((hashCode + (mrVar == null ? 0 : mrVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
