package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 {
    public final String a;
    public final d0 b;
    public final String c;
    public final String d;

    public e0(String str, d0 d0Var, String str2, String str3) {
        this.a = str;
        this.b = d0Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && k71.k.b(this.c, e0Var.c) && k71.k.b(this.d, e0Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node1(title=");
        sb.append(this.a);
        sb.append(", items=");
        sb.append(this.b);
        sb.append(", viewGroupId=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
