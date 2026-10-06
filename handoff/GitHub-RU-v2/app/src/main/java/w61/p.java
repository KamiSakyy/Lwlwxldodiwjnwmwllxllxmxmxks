package w61;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements h, Serializable {
    public j71.a r;
    public volatile Object s;
    public final Object t;

    public p(j71.a aVar) {
        k71.k.g(aVar, "initializer");
        this.r = aVar;
        this.s = x.a;
        this.t = this;
    }

    @Override // w61.h
    public final Object getValue() {
        Object obj;
        Object obj2 = this.s;
        x xVar = x.a;
        if (obj2 != xVar) {
            return obj2;
        }
        synchronized (this.t) {
            obj = this.s;
            if (obj == xVar) {
                j71.a aVar = this.r;
                k71.k.d(aVar);
                obj = aVar.a();
                this.s = obj;
                this.r = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.s != x.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }






















    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e {
        public e() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f {
        public f() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l {
        public l() {
        }
    }
}
