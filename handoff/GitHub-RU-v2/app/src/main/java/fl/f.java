package fl;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public static final e Companion = new e();
    public final g a;
    public final Object b;
    public final b c;

    public f(g gVar, Object obj, b bVar) {
        k.g(gVar, "status");
        this.a = gVar;
        this.b = obj;
        this.c = bVar;
    }

    public static f a(f fVar, Object obj) {
        g gVar = fVar.a;
        b bVar = fVar.c;
        fVar.getClass();
        k.g(gVar, "status");
        return new f(gVar, obj, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && k.b(this.b, fVar.b) && k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "ResultModel(status=" + this.a + ", data=" + this.b + ", executionError=" + this.c + ")";
    }
}
