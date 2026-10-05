package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l6 implements PrivilegedExceptionAction {
    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g<T1,T2,T3,T4> {
        public g() {
        }
    }
}
