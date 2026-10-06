package xt;

import a0.s0;
import com.github.rudroid.copilot.h1;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public String a;
    public String b;
    public int c;
    public String d;
    public wi e;
    public yi f;
    public j g;
    public e h;

    public g(String str, String str2, int i, String str3, wi wiVar, yi yiVar, j jVar, e eVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = wiVar;
        this.f = yiVar;
        this.g = jVar;
        this.h = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && k71.k.b(this.b, gVar.b) && this.c == gVar.c && k71.k.b(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && k71.k.b(this.g, gVar.g) && k71.k.b(this.h, gVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + h1.i(s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31)) * 31;
        yi yiVar = this.f;
        int hashCode2 = (this.g.hashCode() + ((hashCode + (yiVar == null ? 0 : yiVar.hashCode())) * 31)) * 31;
        e eVar = this.h;
        return hashCode2 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnIssue(__typename=", this.a, ", id=", this.b, ", number=");
        x.i.r(this.c, ", title=", this.d, ", issueState=", o);
        o.append(this.e);
        o.append(", stateReason=");
        o.append(this.f);
        o.append(", repository=");
        o.append(this.g);
        o.append(", issueType=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
