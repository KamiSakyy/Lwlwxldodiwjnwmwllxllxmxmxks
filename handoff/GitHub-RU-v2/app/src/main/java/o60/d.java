package o60;

import a0.s0;
import com.github.rudroid.copilot.h1;
import hc0.fm;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final fm e;
    public final boolean f;

    public d(int i, fm fmVar, String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = fmVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && this.c == dVar.c && k.b(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + h1.i(s0.b(this.c, h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", number=");
        x.i.r(this.c, ", title=", this.d, ", pullRequestState=", o);
        o.append(this.e);
        o.append(", isDraft=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
