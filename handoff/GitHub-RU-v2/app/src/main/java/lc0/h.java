package lc0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public final j a;
    public final String b;
    public final String c;
    public final String d;

    public h(j jVar, String str, String str2, String str3) {
        this.a = jVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        j jVar = this.a;
        return this.d.hashCode() + h1.i(h1.i((jVar == null ? 0 : jVar.hashCode()) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tier1(unlockingModel=");
        sb.append(this.a);
        sb.append(", localizedUnlockingExplanation=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
