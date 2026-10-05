package c10;

import aa.v0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements v0 {
    public final l a;
    public final m b;
    public final String c;
    public final String d;

    public e(l lVar, m mVar, String str, String str2) {
        this.a = lVar;
        this.b = mVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c) && k71.k.b(this.d, eVar.d);
    }

    public final int hashCode() {
        l lVar = this.a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        m mVar = this.b;
        return this.d.hashCode() + h1.i((hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", resource=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
