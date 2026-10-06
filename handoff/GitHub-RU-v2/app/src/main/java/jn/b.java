package jn;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements g {
    public String a;
    public String b;
    public String c;
    public int d;

    public b(int i, String str, String str2, String str3) {
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
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && this.d == bVar.d;
    }

    @Override // jn.g
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionUnlockingModel(localizedUnlockingExplanation=", this.a, ", url=", this.b, ", repositoryNameWithOwner=");
        o.append(this.c);
        o.append(", number=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
