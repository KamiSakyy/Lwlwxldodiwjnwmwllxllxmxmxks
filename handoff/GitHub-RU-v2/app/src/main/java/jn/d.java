package jn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements g {
    public final String a;
    public final String b;
    public final String c;

    public d(String str, String str2, String str3) {
        k.g(str, "localizedUnlockingExplanation");
        k.g(str2, "url");
        k.g(str3, "repositoryNameWithOwner");
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
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c);
    }

    @Override // jn.g
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(s0.o("RepositoryUnlockingModel(localizedUnlockingExplanation=", this.a, ", url=", this.b, ", repositoryNameWithOwner="), this.c, ")");
    }
}
