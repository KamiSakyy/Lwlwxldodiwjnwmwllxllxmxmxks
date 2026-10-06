package xn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v3 implements y3 {
    public long a;
    public String b;
    public String c;
    public ArrayList d;

    public v3(long j, String str, String str2, ArrayList arrayList) {
        k71.k.g(str, "eventType");
        k71.k.g(str2, "eventContent");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = arrayList;
    }

    @Override // xn.y3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3)) {
            return false;
        }
        v3 v3Var = (v3) obj;
        return this.a == v3Var.a && k71.k.b(this.b, v3Var.b) && k71.k.b(this.c, v3Var.c) && this.d.equals(v3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "Unknown(userDatabaseId=" + this.a + ", eventType=" + this.b + ", eventContent=" + this.c + ", eventIdentifiers=" + this.d + ")";
    }
}
