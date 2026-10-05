package fa1;

import androidx.lifecycle.l1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r0 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ l1 c;

    public r0(l1 l1Var, Class cls) {
        this.c = l1Var;
        this.b = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r1 = fa1.s.b(r10, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        ((java.util.concurrent.ConcurrentHashMap) r10.r).put(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0075, code lost:
    
        r9 = (fa1.s) r2;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        s sVar;
        Class cls = this.b;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.a;
        }
        Object[] objArr2 = objArr;
        b bVar = k0.b;
        if (bVar.f(method)) {
            return bVar.e(method, cls, obj, objArr2);
        }
        l1 l1Var = this.c;
        while (true) {
            Object obj2 = ((ConcurrentHashMap) l1Var.r).get(method);
            if (!(obj2 instanceof s)) {
                if (obj2 == null) {
                    Object obj3 = new Object();
                    synchronized (obj3) {
                        try {
                            obj2 = ((ConcurrentHashMap) l1Var.r).putIfAbsent(method, obj3);
                            if (obj2 == null) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    ((ConcurrentHashMap) l1Var.r).remove(method);
                                    throw th;
                                }
                            }
                        } finally {
                        }
                    }
                }
                synchronized (obj2) {
                    try {
                        Object obj4 = ((ConcurrentHashMap) l1Var.r).get(method);
                        if (obj4 != null) {
                            break;
                        }
                    } finally {
                    }
                }
                break;
            }
            sVar = (s) obj2;
            break;
        }
        s sVar2 = sVar;
        return sVar2.a(new z(sVar2.a, obj, objArr2, sVar2.b, sVar2.c), objArr2);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l1<T1,T2,T3,T4> {
        public l1() {
        }
    }
}
