package gy0;

import aa.v0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements v0 {
    public v a;
    public String b;
    public String c;

    public q(v vVar, String str, String str2) {
        this.a = vVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c);
    }

    public final int hashCode() {
        v vVar = this.a;
        return this.c.hashCode() + h1.i((vVar == null ? 0 : vVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repositoryOwner=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
