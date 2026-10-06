package jn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements g {
    public String a;
    public String b;
    public String c;

    public e(String str, String str2, String str3) {
        k.g(str2, "url");
        k.g(str3, "userOrOrgLogin");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c);
    }

    @Override // jn.g
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(s0.o("SponsorableUnlockingModel(localizedUnlockingExplanation=", this.a, ", url=", this.b, ", userOrOrgLogin="), this.c, ")");
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
