package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vo implements aaShadow.v0 {
    public yo a;

    public vo(yo yoVar) {
        this.a = yoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo) && k71.k.b(this.a, ((vo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
