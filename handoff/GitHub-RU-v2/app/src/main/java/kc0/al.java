package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class al implements aa.v0 {
    public final fl a;

    public al(fl flVar) {
        this.a = flVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al) && k71.k.b(this.a, ((al) obj).a);
    }

    public final int hashCode() {
        fl flVar = this.a;
        if (flVar == null) {
            return 0;
        }
        return flVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
