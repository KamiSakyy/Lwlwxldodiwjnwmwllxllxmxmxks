package eh0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import gn0.hn;
import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public String b;
    public int c;
    public String d;
    public hn e;
    public boolean f;
    public boolean g;

    public d(int i, hn hnVar, String str, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = hnVar;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && this.c == dVar.c && k.b(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + x.i.e((this.e.hashCode() + h1.i(s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", number=");
        x.i.r(this.c, ", title=", this.d, ", pullRequestState=", o);
        o.append(this.e);
        o.append(", isInMergeQueue=");
        o.append(this.f);
        o.append(", isDraft=");
        return f4.s(o, this.g, ")");
    }
}
