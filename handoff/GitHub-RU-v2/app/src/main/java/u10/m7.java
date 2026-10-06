package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m7 {
    public String a;
    public i7 b;

    public m7(String str, i7 i7Var) {
        this.a = str;
        this.b = i7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return k71.k.b(this.a, m7Var.a) && k71.k.b(this.b, m7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        i7 i7Var = this.b;
        return hashCode + (i7Var == null ? 0 : i7Var.hashCode());
    }

    public final String toString() {
        return "DeleteDiscussionComment(__typename=" + this.a + ", comment=" + this.b + ")";
    }
}
