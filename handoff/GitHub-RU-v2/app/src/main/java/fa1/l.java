package fa1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* loaded from: /home/user/work/p/classes5.dex */
public final class l extends f {
    @Override // fa1.f
    public final g a(Type type, Annotation[] annotationArr) {
        if (x0.h(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type g = x0.g(0, (ParameterizedType) type);
        if (x0.h(g) != q0.class) {
            return new j(0, g);
        }
        if (!(g instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new j(1, x0.g(0, (ParameterizedType) g));
    }
}
