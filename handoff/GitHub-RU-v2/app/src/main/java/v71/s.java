package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public class s {
    public Object a;
    public j b;
    public j71.f c;
    public Object d;
    public Throwable e;

    public s(Object obj, j jVar, j71.f fVar, Object obj2, Throwable th) {
        this.a = obj;
        this.b = jVar;
        this.c = fVar;
        this.d = obj2;
        this.e = th;
    }

    public static s a(s sVar, j jVar, Throwable th, int i) {
        Object obj = sVar.a;
        if ((i & 2) != 0) {
            jVar = sVar.b;
        }
        j jVar2 = jVar;
        j71.f fVar = sVar.c;
        Object obj2 = sVar.d;
        if ((i & 16) != 0) {
            th = sVar.e;
        }
        return new s(obj, jVar2, fVar, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c) && k71.k.b(this.d, sVar.d) && k71.k.b(this.e, sVar.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        j71.f fVar = this.c;
        int hashCode3 = (hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ s(Object obj, j jVar, j71.f fVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : jVar, (i & 4) != 0 ? null : fVar, (Object) null, (i & 16) != 0 ? null : th);
    }
}
