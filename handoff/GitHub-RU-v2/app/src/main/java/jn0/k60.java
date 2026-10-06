package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k60 {
    public String a;

    public k60(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k60) && k71.k.b(this.a, ((k60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode1(id=", this.a, ")");
    }
}
