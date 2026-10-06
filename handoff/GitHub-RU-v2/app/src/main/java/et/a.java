package et;

import a0.s0;
import aa.h0;
import ar.c;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements h0 {
    public String a;
    public String b;
    public String c;
    public c d;
    public pv.c e;
    public pu.a f;
    public ur.a g;
    public ju.a h;

    public a(String str, String str2, String str3, c cVar, pv.c cVar2, pu.a aVar, ur.a aVar2, ju.a aVar3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cVar;
        this.e = cVar2;
        this.f = aVar;
        this.g = aVar2;
        this.h = aVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && k.b(this.c, aVar.c) && k.b(this.d, aVar.d) && k.b(this.e, aVar.e) && k.b(this.f, aVar.f) && k.b(this.g, aVar.g) && k.b(this.h, aVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("IssueCommentFields(__typename=", this.a, ", url=", this.b, ", id=");
        o.append(this.c);
        o.append(", commentFragment=");
        o.append(this.d);
        o.append(", reactionFragment=");
        o.append(this.e);
        o.append(", orgBlockableFragment=");
        o.append(this.f);
        o.append(", deletableFields=");
        o.append(this.g);
        o.append(", minimizableCommentFragment=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
