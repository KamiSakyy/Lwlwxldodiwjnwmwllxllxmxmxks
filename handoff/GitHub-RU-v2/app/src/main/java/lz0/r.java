package lz0;

import com.github.rudroid.copilot.h1;
import pz0.sj;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r {
    public final int a;
    public final String b;
    public final boolean c;
    public final sj d;

    public r(int i, String str, boolean z, sj sjVar) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = sjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.a == rVar.a && k71.k.b(this.b, rVar.b) && this.c == rVar.c && this.d == rVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e(h1.i(Integer.hashCode(this.a) * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "ActiveAuthRequest(id=", ", payload=", this.b, ", challengeRequired=");
        n.append(this.c);
        n.append(", type=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
