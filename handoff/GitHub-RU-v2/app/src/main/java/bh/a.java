package bh;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public int a;
    public int b;
    public String c;
    public String d;

    public a(int i, int i2, String str, String str2) {
        k.g(str, "type");
        k.g(str2, "description");
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && k.b(this.c, aVar.c) && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i(s0.b(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31);
    }

    public final String toString() {
        return i.k(i.m(this.a, this.b, "CodeBlockVulnerability(startOffset=", ", endOffset=", ", type="), this.c, ", description=", this.d, ")");
    }
    public static Object c(Object p1, Object p2) { return null; }
}
