package wq;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;
    public String b;
    public String c;
    public String d;

    public b(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + h1.i((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        return x.i.k(s0.o("LatestStatus(environmentUrl=", this.a, ", logUrl=", this.b, ", id="), this.c, ", __typename=", this.d, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
