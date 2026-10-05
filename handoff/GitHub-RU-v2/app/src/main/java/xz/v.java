package xz;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v implements aa.h0 {
    public final String a;
    public final String b;
    public final u c;
    public final f d;

    public v(String str, String str2, u uVar, f fVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = uVar;
        this.d = fVar;
    }

    public static v a(v vVar, String str, u uVar, f fVar, int i) {
        String str2 = vVar.a;
        if ((i & 2) != 0) {
            str = vVar.b;
        }
        if ((i & 4) != 0) {
            uVar = vVar.c;
        }
        if ((i & 8) != 0) {
            fVar = vVar.d;
        }
        vVar.getClass();
        k71.k.g(str2, "__typename");
        return new v(str2, str, uVar, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && k71.k.b(this.c, vVar.c) && k71.k.b(this.d, vVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ProjectV2GroupRootFragment(__typename=", this.a, ", viewGroupId=", this.b, ", items=");
        o.append(this.c);
        o.append(", projectV2GroupDataFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
