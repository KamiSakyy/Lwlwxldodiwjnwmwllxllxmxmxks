package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tm {
    public final String a;
    public final qm b;
    public final String c;

    public tm(String str, qm qmVar, String str2) {
        this.a = str;
        this.b = qmVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm)) {
            return false;
        }
        tm tmVar = (tm) obj;
        return k71.k.b(this.a, tmVar.a) && k71.k.b(this.b, tmVar.b) && k71.k.b(this.c, tmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qm qmVar = this.b;
        return this.c.hashCode() + ((hashCode + (qmVar == null ? 0 : qmVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ref(id=");
        sb.append(this.a);
        sb.append(", compare=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
