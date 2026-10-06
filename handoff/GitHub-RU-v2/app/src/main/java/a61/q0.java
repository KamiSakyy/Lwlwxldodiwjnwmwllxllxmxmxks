package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 {
    public String a;
    public String b;
    public int c;
    public long d;

    public q0(String str, String str2, int i, long j) {
        k71.k.g(str, "sessionId");
        k71.k.g(str2, "firstSessionId");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b) && this.c == q0Var.c && this.d == q0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }

    public q0(Object... a) {
    }
    public Object a(Object p1) { return null; }
    public Object e(Object p1, Object p2, Object p3) { return null; }
    public Object a(Object) { return null; }
    public Object e(Object, Object, Object) { return null; }
}
