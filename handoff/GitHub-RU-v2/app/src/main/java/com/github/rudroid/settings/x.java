package com.github.rudroid.settings;

import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x extends androidx.fragment.app.h0 {
    public final androidx.fragment.app.a0 a(ClassLoader classLoader, String str) {
        k71.k.g(classLoader, "classLoader");
        k71.k.g(str, "className");
        if (str.equals(BottomOptionsSheetFragment.class.getName())) {
            k71.k.g((Object) null, "actions");
            new BottomOptionsSheetFragment();
            throw null;
        }
        try {
            androidx.fragment.app.a0 a0Var = (androidx.fragment.app.a0) androidx.fragment.app.h0.c(classLoader, str).getConstructor(null).newInstance(null);
            k71.k.f(a0Var, "instantiate(...)");
            return a0Var;
        } catch (IllegalAccessException e) {
            throw new Fragment.InstantiationException(f1.e.z("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.InstantiationException(f1.e.z("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.InstantiationException(f1.e.z("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.InstantiationException(f1.e.z("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
