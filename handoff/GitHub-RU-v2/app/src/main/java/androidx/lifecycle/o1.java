package androidx.lifecycle;

/* loaded from: /home/user/work/p/classes.dex */
public interface o1 {
    default k1 a(Class cls) {
        k71.k.g(cls, "modelClass");
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default k1 b(k71.e eVar, t6.d dVar) {
        return c(v8.l0.x(eVar), dVar);
    }

    default k1 c(Class cls, t6.c cVar) {
        k71.k.g(cls, "modelClass");
        k71.k.g(cVar, "extras");
        return a(cls);
    }
}
