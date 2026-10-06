package ss0;

import pz0.zs;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public zs a;

    public k(zs zsVar) {
        this.a = zsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.a == ((k) obj).a;
    }

    public final int hashCode() {
        zs zsVar = this.a;
        if (zsVar == null) {
            return 0;
        }
        return zsVar.hashCode();
    }

    public final String toString() {
        return "Configuration(mergeMethod=" + this.a + ")";
    }
}
