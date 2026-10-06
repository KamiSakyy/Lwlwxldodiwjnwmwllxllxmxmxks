package vz;

import aa.v0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements v0 {
    public m a;
    public String b;
    public String c;

    public j(m mVar, String str, String str2) {
        this.a = mVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c);
    }

    public final int hashCode() {
        m mVar = this.a;
        return this.c.hashCode() + h1.i((mVar == null ? 0 : mVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
