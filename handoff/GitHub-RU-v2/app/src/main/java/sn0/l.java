package sn0;

import a0.s0;
import aa.v0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements v0 {
    public final String a;
    public final String b;
    public final String c;

    public l(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + h1.i((str == null ? 0 : str.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(s0.o("Data(mobileUpdatesUrl=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
}
