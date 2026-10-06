package i01;

import a0.s0;
import com.github.rudroid.m0;
import jo.f4;
import k71.k;
import x.i;
import yz0.j3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public com.github.service.models.response.a b;
    public Integer c;
    public boolean d;
    public boolean e;
    public int f;
    public j3 g;

    public b(String str, com.github.service.models.response.a aVar, Integer num, boolean z, boolean z2, int i, j3 j3Var) {
        this.a = str;
        this.b = aVar;
        this.c = num;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = j3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && k.b(this.g, bVar.g);
    }

    public final int hashCode() {
        int b = f4.b(this.b, this.a.hashCode() * 31, 31);
        Integer num = this.c;
        int b2 = s0.b(this.f, i.e(i.e((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e), 31);
        j3 j3Var = this.g;
        return b2 + (j3Var != null ? j3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeQueueEntry(id=");
        sb.append(this.a);
        sb.append(", enqueuer=");
        sb.append(this.b);
        sb.append(", estimatedSecondsToMerge=");
        sb.append(this.c);
        sb.append(", hasJumpedQueue=");
        sb.append(this.d);
        sb.append(", isSolo=");
        m0.y(sb, this.e, ", position=", this.f, ", pullRequest=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
