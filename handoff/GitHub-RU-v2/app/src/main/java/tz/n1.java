package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 {
    public final String a;
    public final String b;
    public final t c;

    public n1(String str, String str2, t tVar) {
        this.a = str;
        this.b = str2;
        this.c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj;
        return k71.k.b(this.a, n1Var.a) && k71.k.b(this.b, n1Var.b) && k71.k.b(this.c, n1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnProjectV2ItemFieldTextValue(id=", this.a, ", text=", this.b, ", field=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
