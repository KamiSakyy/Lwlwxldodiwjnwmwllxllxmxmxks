package ra0;

import w80.v3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public final String a;
    public final v3 b;

    public c0(String str, v3 v3Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        v3 v3Var = this.b;
        return hashCode + (v3Var == null ? 0 : v3Var.hashCode());
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", userListMetadataForRepositoryFragment=" + this.b + ")";
    }
}
