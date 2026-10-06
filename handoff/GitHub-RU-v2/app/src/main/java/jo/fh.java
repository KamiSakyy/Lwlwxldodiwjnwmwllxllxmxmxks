package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fh {
    public final String a;
    public final ch b;
    public final String c;

    public fh(String str, ch chVar, String str2) {
        this.a = str;
        this.b = chVar;
        this.c = str2;
    }

    public static fh a(fh fhVar, ch chVar) {
        String str = fhVar.a;
        String str2 = fhVar.c;
        fhVar.getClass();
        return new fh(str, chVar, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh)) {
            return false;
        }
        fh fhVar = (fh) obj;
        return k71.k.b(this.a, fhVar.a) && k71.k.b(this.b, fhVar.b) && k71.k.b(this.c, fhVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ch chVar = this.b;
        return this.c.hashCode() + ((hashCode + (chVar == null ? 0 : chVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
