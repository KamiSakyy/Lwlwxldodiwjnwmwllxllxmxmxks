package xn;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 {
    public String a;
    public String b;
    public String c;
    public Object d;
    public Set e;

    public y1(String str, String str2, String str3, List list, Set set) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.a.equals(y1Var.a) && this.b.equals(y1Var.b) && k71.k.b(this.c, y1Var.c) && this.d.equals(y1Var.d) && this.e.equals(y1Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return this.e.hashCode() + com.github.rudroid.copilot.h1.h((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ElicitationRequestInfo(requestId=", this.a, ", toolCallId=", this.b, ", message=");
        o.append(this.c);
        o.append(", fields=");
        o.append(this.d);
        o.append(", requiredFields=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
