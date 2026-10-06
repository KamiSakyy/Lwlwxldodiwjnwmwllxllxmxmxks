package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class my implements aaShadow.v0 {
    public oy a;

    public my(oy oyVar) {
        this.a = oyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof my) && k71.k.b(this.a, ((my) obj).a);
    }

    public final int hashCode() {
        oy oyVar = this.a;
        if (oyVar == null) {
            return 0;
        }
        return oyVar.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
