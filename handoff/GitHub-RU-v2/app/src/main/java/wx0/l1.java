package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l1 {
    public String a;
    public String b;
    public String c;
    public String d;
    public u e;

    public l1(String str, String str2, String str3, String str4, u uVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b) && k71.k.b(this.c, l1Var.c) && k71.k.b(this.d, l1Var.d) && k71.k.b(this.e, l1Var.e);
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
