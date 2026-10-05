package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l60 {
    public final String a;

    public l60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l60) && k71.k.b(this.a, ((l60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
