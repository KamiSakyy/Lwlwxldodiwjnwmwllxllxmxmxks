package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vr implements aaShadow.m0 {
    public wr a;

    public vr(wr wrVar) {
        this.a = wrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr) && k71.k.b(this.a, ((vr) obj).a);
    }

    public final int hashCode() {
        wr wrVar = this.a;
        if (wrVar == null) {
            return 0;
        }
        return wrVar.hashCode();
    }

    public final String toString() {
        return "Data(removeStar=" + this.a + ")";
    }
}
