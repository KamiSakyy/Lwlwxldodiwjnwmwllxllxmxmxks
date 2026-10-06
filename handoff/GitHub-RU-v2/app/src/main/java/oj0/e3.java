package oj0;

import gn0.dl;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e3 {
    public String a;
    public String b;
    public dl c;
    public String d;

    public e3(String str, String str2, dl dlVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = dlVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return false;
        }
        e3 e3Var = (e3) obj;
        return k71.k.b(this.a, e3Var.a) && k71.k.b(this.b, e3Var.b) && this.c == e3Var.c && k71.k.b(this.d, e3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Project(id=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
