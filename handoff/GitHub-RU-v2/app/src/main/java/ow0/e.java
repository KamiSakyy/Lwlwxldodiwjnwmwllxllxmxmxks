package ow0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final String b;
    public final is0.e c;

    public e(String str, String str2, is0.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", linkedIssues=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
