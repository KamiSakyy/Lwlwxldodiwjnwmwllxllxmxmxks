package iy0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 implements aa.h0 {
    public String a;
    public String b;
    public d0 c;

    public e0(String str, String str2, d0 d0Var) {
        this.a = str;
        this.b = str2;
        this.c = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && k71.k.b(this.c, e0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2RelatedProjectsIssue(__typename=", this.a, ", id=", this.b, ", projectsV2=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
