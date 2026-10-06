package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s20 {
    public String a;

    public s20(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s20) && k71.k.b(this.a, ((s20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnNode(id=", this.a, ")");
    }
}
