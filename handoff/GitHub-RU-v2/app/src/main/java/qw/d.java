package qw;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public String b;
    public String c;

    public d(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(s0.o("ResolvedBy(login=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
