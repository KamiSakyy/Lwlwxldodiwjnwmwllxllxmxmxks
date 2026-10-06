package fb0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y {
    public String a;
    public String b;
    public String c;

    public y(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b) && k71.k.b(this.c, yVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return h1.p(a0.s0.o("OnUser(login=", this.a, ", userName=", this.b, ", id="), this.c, ")");
    }
    public static Object Q(Object p1) { return null; }
}
