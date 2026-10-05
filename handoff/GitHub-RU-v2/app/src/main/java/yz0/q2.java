package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q2 implements q3 {
    public final String a;
    public final long b;

    public q2(String str) {
        k71.k.g(str, "commentId");
        this.a = str;
        this.b = 355298461;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2) && k71.k.b(this.a, ((q2) obj).a);
    }

    @Override // yz0.q3
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("MarkAsAnswer(commentId=", this.a, ")");
    }

    public q2(Object... a) {
    }
}
