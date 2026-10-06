package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ac {
    public final String a;
    public final ar0.p0 b;

    public ac(String str, ar0.p0 p0Var) {
        this.a = str;
        this.b = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return k71.k.b(this.a, acVar.a) && k71.k.b(this.b, acVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnDiscussion(__typename=" + this.a + ", discussionFragment=" + this.b + ")";
    }
}
