package com.github.rudroid.activities.util;

import android.app.Activity;

/* loaded from: /home/user/work/p/classes.dex */
public final class g<T> extends h<T> {

    /* renamed from: b, reason: collision with root package name */
    public j71.a f5922b;

    public g(String str, j71.a aVar) {
        super(str);
        this.f5922b = aVar;
    }

    public final Object c(Activity activity, r71.e eVar) {
        k71.k.g(activity, "thisRef");
        k71.k.g(eVar, "property");
        Object a10 = a(activity, eVar);
        return a10 == null ? this.f5922b.a() : a10;
    }

    public /* synthetic */ g(String str) {
        this(str, f.f5921r);
    }
}
