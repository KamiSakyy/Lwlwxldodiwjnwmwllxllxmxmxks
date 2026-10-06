package fa1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class p extends f {
    public Executor a;

    public p(Executor executor) {
        this.a = executor;
    }

    @Override // fa1.f
    public final g a(Type type, Annotation[] annotationArr) {
        if (x0.h(type) != e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new e51.a(x0.g(0, (ParameterizedType) type), x0.l(annotationArr, s0.class) ? null : this.a, false, 3);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
