package lz;

import com.github.rudroid.copilot.h1;
import m10.zd;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public String a;
    public String b;
    public int c;
    public zd d;
    public a e;
    public l0 f;

    public i(String str, String str2, int i, zd zdVar, a aVar, l0 l0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = zdVar;
        this.e = aVar;
        this.f = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && this.c == iVar.c && this.d == iVar.d && k71.k.b(this.e, iVar.e) && k71.k.b(this.f, iVar.f);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31);
        zd zdVar = this.d;
        int hashCode = (b + (zdVar == null ? 0 : zdVar.hashCode())) * 31;
        a aVar = this.e;
        return this.f.hashCode() + ((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnDiscussion(id=", this.a, ", url=", this.b, ", number=");
        o.append(this.c);
        o.append(", discussionStateReason=");
        o.append(this.d);
        o.append(", answer=");
        o.append(this.e);
        o.append(", repository=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
