package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements aa.m0 {
    public f a;

    public h(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && k71.k.b(this.a, ((h) obj).a);
    }

    public final int hashCode() {
        f fVar = this.a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "Data(clearProjectV2ItemFieldValue=" + this.a + ")";
    }
}
