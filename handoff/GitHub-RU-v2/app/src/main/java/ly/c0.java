package ly;

import dw.k7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 {
    public String a;
    public k7 b;

    public c0(String str, k7 k7Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = k7Var;
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
        k7 k7Var = this.b;
        return hashCode + (k7Var == null ? 0 : k7Var.hashCode());
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", userListMetadataForRepositoryFragment=" + this.b + ")";
    }
}
