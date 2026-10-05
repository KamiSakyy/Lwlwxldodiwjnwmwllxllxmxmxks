package ck0;

import com.github.rudroid.copilot.h1;
import gn0.jt;
import gn0.pt;
import gn0.pu;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v implements aa.h0 {
    public final jt a;
    public final pt b;
    public final String c;
    public final String d;
    public final String e;
    public final u f;
    public final pu g;
    public final ArrayList h;
    public final String i;

    public v(jt jtVar, pt ptVar, String str, String str2, String str3, u uVar, pu puVar, ArrayList arrayList, String str4) {
        this.a = jtVar;
        this.b = ptVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = uVar;
        this.g = puVar;
        this.h = arrayList;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.a == vVar.a && this.b == vVar.b && this.c.equals(vVar.c) && this.d.equals(vVar.d) && this.e.equals(vVar.e) && k71.k.b(this.f, vVar.f) && this.g == vVar.g && this.h.equals(vVar.h) && this.i.equals(vVar.i);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), this.d, 31), this.e, 31);
        u uVar = this.f;
        return this.i.hashCode() + no.a.b(this.h, (this.g.hashCode() + ((i + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31, 31);
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
