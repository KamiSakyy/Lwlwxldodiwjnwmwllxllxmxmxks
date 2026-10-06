package a81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class v implements a71.f {
    public final Object r;
    public final ThreadLocal s;
    public final w t;

    public v(Object obj, ThreadLocal threadLocal) {
        this.r = obj;
        this.s = threadLocal;
        this.t = new w(threadLocal);
    }

    public final a71.h A(a71.h hVar) {
        return k21.f.y(this, hVar);
    }

    public final void a(Object obj) {
        this.s.set(obj);
    }

    public final Object b(a71.h hVar) {
        ThreadLocal threadLocal = this.s;
        Object obj = threadLocal.get();
        threadLocal.set(this.r);
        return obj;
    }

    public final a71.h b0(a71.g gVar) {
        return this.t.equals(gVar) ? a71.i.r : this;
    }

    public final a71.g getKey() {
        return this.t;
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.r + ", threadLocal = " + this.s + ')';
    }

    public final a71.f w0(a71.g gVar) {
        if (this.t.equals(gVar)) {
            return this;
        }
        return null;
    }

    public final Object x0(j71.e eVar, Object obj) {
        return eVar.s(obj, this);
    }
}
