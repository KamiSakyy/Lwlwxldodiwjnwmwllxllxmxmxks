package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v8 {
    public String a;
    public t8 b;
    public s8 c;

    public v8(String str, t8 t8Var, s8 s8Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = t8Var;
        this.c = s8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return k71.k.b(this.a, v8Var.a) && k71.k.b(this.b, v8Var.b) && k71.k.b(this.c, v8Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        t8 t8Var = this.b;
        int hashCode2 = (hashCode + (t8Var == null ? 0 : t8Var.hashCode())) * 31;
        s8 s8Var = this.c;
        return hashCode2 + (s8Var != null ? s8Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequestedByActor(__typename=" + this.a + ", onUser=" + this.b + ", onBot=" + this.c + ")";
    }
}
