package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public String a;

    public h0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && k71.k.b(this.a, ((h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
