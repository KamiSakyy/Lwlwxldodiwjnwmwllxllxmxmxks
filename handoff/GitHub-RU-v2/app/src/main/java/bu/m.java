package bu;

import aa.h0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements h0 {
    public String a;
    public l b;
    public k c;
    public Integer d;
    public String e;

    public m(String str, l lVar, k kVar, Integer num, String str2) {
        this.a = str;
        this.b = lVar;
        this.c = kVar;
        this.d = num;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d) && k71.k.b(this.e, mVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l lVar = this.b;
        int hashCode2 = (hashCode + (lVar == null ? 0 : Integer.hashCode(lVar.a))) * 31;
        k kVar = this.c;
        int hashCode3 = (hashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeQueueFragment(id=");
        sb.append(this.a);
        sb.append(", entries=");
        sb.append(this.b);
        sb.append(", configuration=");
        sb.append(this.c);
        sb.append(", nextEntryEstimatedTimeToMerge=");
        sb.append(this.d);
        sb.append(", __typename=");
        return h1.p(sb, this.e, ")");
    }
}
