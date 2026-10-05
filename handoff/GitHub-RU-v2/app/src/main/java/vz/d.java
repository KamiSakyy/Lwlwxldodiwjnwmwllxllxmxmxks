package vz;

import a0.s0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public final String a;
    public final String b;
    public final xz.v c;

    public d(String str, String str2, xz.v vVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public static d a(d dVar, String str, xz.v vVar, int i) {
        String str2 = dVar.a;
        if ((i & 2) != 0) {
            str = dVar.b;
        }
        k71.k.g(str2, "__typename");
        return new d(str2, str, vVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && k71.k.b(this.b, dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node1(__typename=", this.a, ", viewGroupId=", this.b, ", projectV2GroupRootFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
