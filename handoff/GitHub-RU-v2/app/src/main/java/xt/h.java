package xt;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public String a;
    public String b;
    public int c;
    public String d;
    public b00 e;
    public boolean f;
    public boolean g;

    public h(int i, String str, String str2, String str3, b00 b00Var, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = b00Var;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b) && this.c == hVar.c && k71.k.b(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && this.g == hVar.g;
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
