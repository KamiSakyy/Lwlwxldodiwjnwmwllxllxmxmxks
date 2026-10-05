package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f4 {
    public final String a;
    public final String b;
    public final String c;
    public final Object d;
    public final boolean e;

    public f4(String str, String str2, String str3, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj;
        return this.a.equals(f4Var.a) && this.b.equals(f4Var.b) && k71.k.b(this.c, f4Var.c) && this.d.equals(f4Var.d) && this.e == f4Var.e;
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return Boolean.hashCode(this.e) + com.github.rudroid.copilot.h1.h((i + (str == null ? 0 : str.hashCode())) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserInputRequestInfo(requestId=", this.a, ", toolCallId=", this.b, ", question=");
        o.append(this.c);
        o.append(", choices=");
        o.append(this.d);
        o.append(", allowFreeform=");
        return jo.f4.s(o, this.e, ")");
    }
}
