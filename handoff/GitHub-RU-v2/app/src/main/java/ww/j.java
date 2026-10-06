package ww;

import a0.s0;
import com.github.rudroid.copilot.h1;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public wi a;
    public String b;
    public String c;
    public int d;
    public yi e;

    public j(wi wiVar, String str, String str2, int i, yi yiVar) {
        this.a = wiVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = yiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && this.d == jVar.d && this.e == jVar.e;
    }

    public final int hashCode() {
        int b = s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
        yi yiVar = this.e;
        return b + (yiVar == null ? 0 : yiVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnIssue(issueState=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", url=");
        s0.w(this.d, this.c, ", number=", ", stateReason=", sb);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
