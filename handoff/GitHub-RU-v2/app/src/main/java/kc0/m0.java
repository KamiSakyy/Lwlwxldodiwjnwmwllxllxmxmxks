package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 {
    public String a;
    public String b;
    public yf0.o c;

    public m0(String str, String str2, yf0.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b) && k71.k.b(this.c, m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ReplyTo(__typename=", this.a, ", id=", this.b, ", discussionCommentRepliesFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object b(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object e(Object p1, Object p2, Object p3) { return null; }
    public static Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object g(Object p1, Object p2, Object p3) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object i(Object p1, Object p2, Object p3) { return null; }
    public static Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object n(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
