package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pg {
    public final String a;
    public final ng b;
    public final String c;

    public pg(String str, ng ngVar, String str2) {
        this.a = str;
        this.b = ngVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg)) {
            return false;
        }
        pg pgVar = (pg) obj;
        return k71.k.b(this.a, pgVar.a) && k71.k.b(this.b, pgVar.b) && k71.k.b(this.c, pgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ng ngVar = this.b;
        return this.c.hashCode() + ((hashCode + (ngVar == null ? 0 : ngVar.hashCode())) * 31);
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
