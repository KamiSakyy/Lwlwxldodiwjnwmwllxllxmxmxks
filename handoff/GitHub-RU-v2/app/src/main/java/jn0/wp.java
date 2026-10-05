package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wp {
    public final String a;
    public final wq0.a b;

    public wp(String str, wq0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        return k71.k.b(this.a, wpVar.a) && k71.k.b(this.b, wpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine1(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
