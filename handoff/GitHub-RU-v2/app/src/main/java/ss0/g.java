package ss0;

import a0.s0;
import aa.h0;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements h0 {
    public String a;
    public e b;
    public Integer c;
    public boolean d;
    public boolean e;
    public int f;
    public f g;
    public String h;

    public g(String str, e eVar, Integer num, boolean z, boolean z2, int i, f fVar, String str2) {
        this.a = str;
        this.b = eVar;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = fVar;
        this.h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f && k71.k.b(this.g, gVar.g) && k71.k.b(this.h, gVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        int b = s0.b(this.f, x.i.e(x.i.e((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        f fVar = this.g;
        return this.h.hashCode() + ((b + (fVar != null ? fVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeQueueEntryFragment(id=");
        sb.append(this.a);
        sb.append(", enqueuer=");
        sb.append(this.b);
        sb.append(", estimatedTimeToMerge=");
        sb.append(this.c);
        sb.append(", jump=");
        sb.append(this.d);
        sb.append(", solo=");
        m0.y(sb, this.e, ", position=", this.f, ", pullRequest=");
        sb.append(this.g);
        sb.append(", __typename=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
