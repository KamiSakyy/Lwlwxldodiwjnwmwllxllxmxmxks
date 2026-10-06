package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u7 {
    public final String a;
    public final i b;

    public u7(String str, i iVar) {
        this.a = str;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u7)) {
            return false;
        }
        u7 u7Var = (u7) obj;
        return k71.k.b(this.a, u7Var.a) && k71.k.b(this.b, u7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Positioning(__typename=" + this.a + ", commentPositionFragment=" + this.b + ")";
    }
}
