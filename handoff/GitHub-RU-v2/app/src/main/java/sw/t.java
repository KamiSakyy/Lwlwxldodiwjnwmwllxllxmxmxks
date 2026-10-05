package sw;

import com.github.rudroid.copilot.h1;
import java.util.ArrayList;
import m10.s60;
import m10.y60;
import m10.y70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t implements aa.h0 {
    public final s60 a;
    public final y60 b;
    public final String c;
    public final String d;
    public final String e;
    public final s f;
    public final y70 g;
    public final ArrayList h;
    public final String i;

    public t(s60 s60Var, y60 y60Var, String str, String str2, String str3, s sVar, y70 y70Var, ArrayList arrayList, String str4) {
        this.a = s60Var;
        this.b = y60Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = sVar;
        this.g = y70Var;
        this.h = arrayList;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a == tVar.a && this.b == tVar.b && this.c.equals(tVar.c) && this.d.equals(tVar.d) && this.e.equals(tVar.e) && k71.k.b(this.f, tVar.f) && this.g == tVar.g && this.h.equals(tVar.h) && this.i.equals(tVar.i);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), this.e, 31);
        s sVar = this.f;
        return this.i.hashCode() + no.a.b(this.h, (this.g.hashCode() + ((i + (sVar == null ? 0 : sVar.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortcutFragment(color=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        f1.e.x(sb, this.c, ", name=", this.d, ", query=");
        sb.append(this.e);
        sb.append(", scopingRepository=");
        sb.append(this.f);
        sb.append(", searchType=");
        sb.append(this.g);
        sb.append(", queryTerms=");
        sb.append(this.h);
        sb.append(", __typename=");
        return h1.p(sb, this.i, ")");
    }
}
