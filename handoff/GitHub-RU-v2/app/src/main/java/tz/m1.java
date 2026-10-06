package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final v e;

    public m1(String str, String str2, String str3, String str4, v vVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && k71.k.b(this.b, m1Var.b) && k71.k.b(this.c, m1Var.c) && k71.k.b(this.d, m1Var.d) && k71.k.b(this.e, m1Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnProjectV2ItemFieldSingleSelectValue(id=", this.a, ", name=", this.b, ", nameHTML=");
        f1.e.x(o, this.c, ", optionId=", this.d, ", field=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
