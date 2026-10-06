package jn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements g {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public c(int i, String str, String str2, String str3) {
        k.g(str, "localizedUnlockingExplanation");
        k.g(str2, "url");
        k.g(str3, "repositoryNameWithOwner");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && this.d == cVar.d;
    }

    @Override // jn.g
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("IssueOrPrUnlockingModel(localizedUnlockingExplanation=", this.a, ", url=", this.b, ", repositoryNameWithOwner=");
        o.append(this.c);
        o.append(", number=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
