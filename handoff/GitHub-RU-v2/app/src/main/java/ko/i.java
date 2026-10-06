package ko;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public String a;
    public String b;
    public String c;
    public String d;

    public i(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return x.i.k(s0.o("Tier(id=", this.a, ", highResolutionBadgeImageUrl=", this.b, ", backgroundColor="), this.c, ", __typename=", this.d, ")");
    }
}
