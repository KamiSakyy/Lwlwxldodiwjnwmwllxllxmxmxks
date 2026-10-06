package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v7 implements q3 {
    public String a;
    public long b;

    public v7(String str) {
        k71.k.g(str, "commentId");
        this.a = str;
        this.b = -2041391690;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7) && k71.k.b(this.a, ((v7) obj).a);
    }

    @Override // yz0.q3
    public final long getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("UnmarkAsAnswer(commentId=", this.a, ")");
    }
}
