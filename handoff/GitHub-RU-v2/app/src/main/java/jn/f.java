package jn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements g {
    public String a;
    public String b;
    public String c;

    public f(String str, String str2, String str3) {
        k.g(str2, "url");
        k.g(str3, "teamLogin");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && k.b(this.c, fVar.c);
    }

    @Override // jn.g
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(s0.o("TeamDiscussionUnlockingModel(localizedUnlockingExplanation=", this.a, ", url=", this.b, ", teamLogin="), this.c, ")");
    }
}
