package bv0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public a(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.k(s0.o("OnTeam(__typename=", this.a, ", id=", this.b, ", name="), this.c, ", teamAvatar=", this.d, ")");
    }
    public Object O(Object p1) { return null; }
}
