package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w2 {
    public final String a;

    public w2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && k71.k.b(this.a, ((w2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Feature(title=", this.a, ")");
    }
}
