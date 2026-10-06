package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;

    public z0(c1 c1Var, String str, boolean z) {

        Object d = null;
        this.e = c1Var;
        c21.uShadow.d(str);
        this.d = str;
        this.a = z;
    }

    public x6.j a() {
        x6.e eVar = (x6.l0) this.d;
        if (eVar == null) {
            x6.f0 f0Var = x6.l0.Companion;
            Object obj = this.e;
            f0Var.getClass();
            eVar = obj instanceof Integer ? x6.l0.b : obj instanceof int[] ? x6.l0.d : obj instanceof Long ? x6.l0.f : obj instanceof long[] ? x6.l0.g : obj instanceof Float ? x6.l0.i : obj instanceof float[] ? x6.l0.j : obj instanceof Boolean ? x6.l0.l : obj instanceof boolean[] ? x6.l0.m : ((obj instanceof String) || obj == null) ? x6.l0.o : null;
            if (eVar == null) {
                if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                    eVar = x6.l0.p;
                } else {
                    k71.k.d(obj);
                    if (obj.getClass().isArray()) {
                        Class<?> componentType = obj.getClass().getComponentType();
                        k71.k.d(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            Class<?> componentType2 = obj.getClass().getComponentType();
                            k71.k.e(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                            eVar = new x6.h0(componentType2);
                        }
                    }
                    if (obj.getClass().isArray()) {
                        Class<?> componentType3 = obj.getClass().getComponentType();
                        k71.k.d(componentType3);
                        if (Serializable.class.isAssignableFrom(componentType3)) {
                            Class<?> componentType4 = obj.getClass().getComponentType();
                            k71.k.e(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                            eVar = new x6.j0(componentType4);
                        }
                    }
                    if (obj instanceof Parcelable) {
                        eVar = new x6.i0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        eVar = new x6.g0(obj.getClass());
                    } else {
                        if (!(obj instanceof Serializable)) {
                            throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
                        }
                        eVar = new x6.k0(obj.getClass());
                    }
                }
            }
        }
        return new x6.j(eVar, this.a, this.e, this.b, this.c);
    }

    public boolean b() {
        if (!this.b) {
            this.b = true;
            c1 c1Var = (c1) this.e;
            this.c = c1Var.D().getBoolean((String) this.d, this.a);
        }
        return this.c;
    }

    public void c(boolean z) {
        SharedPreferences.Editor edit = ((c1) this.e).D().edit();
        edit.putBoolean((String) this.d, z);
        edit.apply();
        this.c = z;
    }
}
