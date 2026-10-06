package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ny implements aaShadow.m0 {
    public final oy a;

    public ny(oy oyVar) {
        this.a = oyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ny) && k71.k.b(this.a, ((ny) obj).a);
    }

    public final int hashCode() {
        oy oyVar = this.a;
        if (oyVar == null) {
            return 0;
        }
        return oyVar.hashCode();
    }

    public final String toString() {
        return "Data(replaceAssigneesForAssignable=" + this.a + ")";
    }
}
