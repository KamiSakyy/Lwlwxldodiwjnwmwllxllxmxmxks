package n8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import k71.k;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public final k71.e f29653a;

    /* renamed from: b, reason: collision with root package name */
    public final r8.b f29654b;

    public d(k71.e eVar, r8.b bVar) {
        this.f29653a = eVar;
        this.f29654b = bVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        k.g(obj, "obj");
        k.g(method, "method");
        boolean b10 = k.b(method.getName(), "accept");
        r8.b bVar = this.f29654b;
        if (b10 && objArr != null && objArr.length == 1) {
            Object obj2 = objArr[0];
            k71.e eVar = this.f29653a;
            if (eVar.d(obj2)) {
                k.e(obj2, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
                bVar.k(obj2);
                return a0.a;
            }
            throw new ClassCastException("Value cannot be cast to " + eVar.b());
        }
        if (k.b(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return Boolean.valueOf(obj == objArr[0]);
        }
        if (k.b(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
            return Integer.valueOf(bVar.hashCode());
        }
        if (k.b(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
            return bVar.toString();
        }
        throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
