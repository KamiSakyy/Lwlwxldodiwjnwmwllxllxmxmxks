package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class o0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, m0 m0Var, long j, Object obj, Object obj2) {
        while (!n0.a(unsafe, m0Var, j, obj, obj2)) {
            if (unsafe.getObject(m0Var, j) != obj) {
                return false;
            }
        }
        return true;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class Unsafe {
        public Unsafe() {
        }
    }
}
