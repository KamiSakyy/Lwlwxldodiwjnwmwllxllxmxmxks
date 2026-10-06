package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements aa.v0 {
    public n a;
    public m b;
    public String c;
    public String d;

    public l(n nVar, m mVar, String str, String str2) {
        this.a = nVar;
        this.b = mVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c) && k71.k.b(this.d, lVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m mVar = this.b;
        return this.d.hashCode() + h1.i((hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(viewer=");
        sb.append(this.a);
        sb.append(", repository=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
