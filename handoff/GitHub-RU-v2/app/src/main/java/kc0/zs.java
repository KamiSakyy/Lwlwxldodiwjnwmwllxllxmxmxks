package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zs {
    public List a;
    public String b;

    public zs(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs)) {
            return false;
        }
        zs zsVar = (zs) obj;
        return k71.k.b(this.a, zsVar.a) && k71.k.b(this.b, zsVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return this.b.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "OnTree(entries=" + this.a + ", id=" + this.b + ")";
    }
}
