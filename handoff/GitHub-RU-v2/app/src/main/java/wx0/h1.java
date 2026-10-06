package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 {
    public final String a;
    public final Double b;
    public final r c;

    public h1(String str, Double d, r rVar) {
        this.a = str;
        this.b = d;
        this.c = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return k71.k.b(this.a, h1Var.a) && k71.k.b(this.b, h1Var.b) && k71.k.b(this.c, h1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        return this.c.hashCode() + ((hashCode + (d == null ? 0 : d.hashCode())) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldNumberValue(id=" + this.a + ", number=" + this.b + ", field=" + this.c + ")";
    }
    public static final Object i = null;
}
