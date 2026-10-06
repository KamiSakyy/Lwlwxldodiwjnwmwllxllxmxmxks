package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yh implements aaShadow.m0 {
    public zh a;

    public yh(zh zhVar) {
        this.a = zhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh) && k71.k.b(this.a, ((yh) obj).a);
    }

    public final int hashCode() {
        zh zhVar = this.a;
        if (zhVar == null) {
            return 0;
        }
        return zhVar.hashCode();
    }

    public final String toString() {
        return "Data(followUser=" + this.a + ")";
    }
}
