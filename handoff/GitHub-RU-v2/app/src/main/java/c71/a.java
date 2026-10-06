package c71;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k71.k;
import sy.y;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a implements a71.c, d, Serializable {
    public a71.c r;

    public a(a71.c cVar) {
        this.r = cVar;
    }

    @Override // c71.d
    public d g() {
        a71.c cVar = this.r;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Override // a71.c
    public final void i(Object obj) {
        a71.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            a71.c cVar2 = aVar.r;
            k.d(cVar2);
            try {
                obj = aVar.v(obj);
                if (obj == b71.a.r) {
                    return;
                }
            } catch (Throwable th) {
                obj = y.d(th);
            }
            aVar.w();
            if (!(cVar2 instanceof a)) {
                cVar2.i(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public a71.c r(a71.c cVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object u = u();
        if (u == null) {
            u = getClass().getName();
        }
        sb.append(u);
        return sb.toString();
    }

    public StackTraceElement u() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? eVar.l()[i] : -1;
        f fVar = g.b;
        f fVar2 = g.a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = fVar.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i2);
    }

    public abstract Object v(Object obj);

    public void w() {
    }
}
