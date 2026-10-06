package uw0;

import aa.v0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements v0 {
    public q a;
    public String b;
    public String c;

    public o(q qVar, String str, String str2) {
        this.a = qVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c);
    }

    public final int hashCode() {
        q qVar = this.a;
        return this.c.hashCode() + h1.i((qVar == null ? 0 : qVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(list=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
