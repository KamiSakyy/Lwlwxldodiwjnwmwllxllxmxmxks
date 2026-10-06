package uw0;

import uu0.o6;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public String a;
    public o6 b;

    public c0(String str, o6 o6Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = o6Var;
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
        o6 o6Var = this.b;
        return hashCode + (o6Var == null ? 0 : o6Var.hashCode());
    }

    public final String toString() {
        return "Item(__typename=" + this.a + ", userListMetadataForRepositoryFragment=" + this.b + ")";
    }
}
