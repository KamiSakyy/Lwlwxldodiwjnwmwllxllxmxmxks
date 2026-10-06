package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t9 {
    public Object a;
    public String b;

    public t9(String str, String str2) {
        k71.k.g(str, "contents");
        k71.k.g(str2, "path");
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return false;
        }
        t9 t9Var = (t9) obj;
        return k71.k.b(this.a, t9Var.a) && k71.k.b(this.b, t9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileAddition(contents=" + this.a + ", path=" + this.b + ")";
    }
}
