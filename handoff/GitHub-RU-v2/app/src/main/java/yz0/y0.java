package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 {
    public final String a;
    public final String b;
    public final Integer c;

    public y0(Integer num, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b) && k71.k.b(this.c, y0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CreateIssueResponse(id=", this.a, ", url=", this.b, ", number=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
