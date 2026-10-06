package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i1 {
    public final String a;
    public final Double b;
    public final s c;

    public i1(String str, Double d, s sVar) {
        this.a = str;
        this.b = d;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return k71.k.b(this.a, i1Var.a) && k71.k.b(this.b, i1Var.b) && k71.k.b(this.c, i1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Double d = this.b;
        return this.c.hashCode() + ((hashCode + (d == null ? 0 : d.hashCode())) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldNumberValue(id=" + this.a + ", number=" + this.b + ", field=" + this.c + ")";
    }
}
