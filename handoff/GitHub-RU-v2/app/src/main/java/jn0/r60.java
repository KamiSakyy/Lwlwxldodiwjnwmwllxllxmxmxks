package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r60 {
    public String a;
    public l60 b;

    public r60(String str, l60 l60Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = l60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r60)) {
            return false;
        }
        r60 r60Var = (r60) obj;
        return k71.k.b(this.a, r60Var.a) && k71.k.b(this.b, r60Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l60 l60Var = this.b;
        return hashCode + (l60Var == null ? 0 : l60Var.a.hashCode());
    }

    public final String toString() {
        return "TimelineItem(__typename=" + this.a + ", onNode=" + this.b + ")";
    }
}
