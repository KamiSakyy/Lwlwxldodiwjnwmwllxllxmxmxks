package fb0;

import com.github.rudroid.copilot.h1;
import hc0.i9;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public String a;
    public String b;
    public int c;
    public i9 d;
    public a e;
    public j0 f;

    public j(String str, String str2, int i, i9 i9Var, a aVar, j0 j0Var) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i9Var;
        this.e = aVar;
        this.f = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && this.c == jVar.c && this.d == jVar.d && k71.k.b(this.e, jVar.e) && k71.k.b(this.f, jVar.f);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31);
        i9 i9Var = this.d;
        int hashCode = (b + (i9Var == null ? 0 : i9Var.hashCode())) * 31;
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
