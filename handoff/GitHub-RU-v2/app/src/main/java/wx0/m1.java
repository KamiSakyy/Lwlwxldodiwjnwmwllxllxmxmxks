package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 {
    public final String a;
    public final String b;
    public final s c;

    public m1(String str, String str2, s sVar) {
        this.a = str;
        this.b = str2;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && k71.k.b(this.b, m1Var.b) && k71.k.b(this.c, m1Var.c);
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
