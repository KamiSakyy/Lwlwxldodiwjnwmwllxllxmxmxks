package yx0;

import a0.s0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x {
    public String a;
    public String b;
    public ay0.f c;

    public x(String str, String str2, ay0.f fVar) {
        this.a = str;
        this.b = str2;
        this.c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node1(__typename=", this.a, ", viewGroupId=", this.b, ", projectV2GroupDataFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
