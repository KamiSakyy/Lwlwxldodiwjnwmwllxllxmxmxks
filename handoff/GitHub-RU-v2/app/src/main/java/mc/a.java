package mc;

import androidx.lifecycle.k1;
import androidx.lifecycle.o1;
import java.util.Map;
import k71.k;
import t6.c;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f29202a;

    /* renamed from: b, reason: collision with root package name */
    public final o1 f29203b;

    public a(Map map, o1 o1Var) {
        k.g(o1Var, "superFactory");
        this.f29202a = map;
        this.f29203b = o1Var;
    }

    @Override // androidx.lifecycle.o1
    public final k1 a(Class cls) {
        k.g(cls, "modelClass");
        Object obj = this.f29202a.get(cls);
        Class cls2 = obj instanceof Class ? (Class) obj : null;
        if (cls2 != null) {
            cls = cls2;
        }
        return this.f29203b.a(cls);
    }

    @Override // androidx.lifecycle.o1
    public final k1 c(Class cls, c cVar) {
        k.g(cls, "modelClass");
        k.g(cVar, "extras");
        Object obj = this.f29202a.get(cls);
        Class cls2 = obj instanceof Class ? (Class) obj : null;
        if (cls2 != null) {
            cls = cls2;
        }
        return this.f29203b.c(cls, cVar);
    }
}
