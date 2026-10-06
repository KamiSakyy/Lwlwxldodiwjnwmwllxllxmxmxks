package er;

import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public String a;
    public da0 b;
    public String c;

    public w(String str, String str2, da0 da0Var) {
        this.a = str;
        this.b = da0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && this.b == wVar.b && k71.k.b(this.c, wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
    public Object e(Object p1) { return null; }
}
