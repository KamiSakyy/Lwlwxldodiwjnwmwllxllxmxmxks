package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ s0(int i, String str, String str2, String str3, String str4) {
        this(r3, r4, r5, r6, r7, r7);
        String str5 = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) != 0 ? "" : str2;
        String str7 = (i & 4) != 0 ? "" : str3;
        String str8 = (i & 8) != 0 ? "" : str4;
        x61.r rVar = x61.r.r;
    }

    public static s0 a(s0 s0Var, String str, String str2, List list, int i) {
        if ((i & 1) != 0) {
            str = s0Var.a;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = s0Var.b;
        }
        String str4 = str2;
        String str5 = s0Var.c;
        String str6 = s0Var.d;
        if ((i & 16) != 0) {
            list = s0Var.e;
        }
        List list2 = list;
        List list3 = s0Var.f;
        s0Var.getClass();
        k71.k.g(str3, "id");
        k71.k.g(str4, "name");
        k71.k.g(str5, "updatedAt");
        k71.k.g(str6, "createdAt");
        k71.k.g(list2, "messages");
        k71.k.g(list3, "currentReferences");
        return new s0(str3, str4, str5, str6, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b) && k71.k.b(this.c, s0Var.c) && k71.k.b(this.d, s0Var.d) && k71.k.b(this.e, s0Var.e) && k71.k.b(this.f, s0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1.e.c(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ChatThread(id=", this.a, ", name=", this.b, ", updatedAt=");
        f1.e.x(o, this.c, ", createdAt=", this.d, ", messages=");
        o.append(this.e);
        o.append(", currentReferences=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }

    public s0(String str, String str2, String str3, String str4, List list, List list2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(str3, "updatedAt");
        k71.k.g(str4, "createdAt");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
    }
}
