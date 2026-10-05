package com.github.rudroid.activities.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.github.rudroid.activities.m0;
import java.io.Serializable;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f5923a;

    public h(String str) {
        this.f5923a = str;
    }

    public final Object a(Activity activity, r71.e eVar) {
        k71.k.g(activity, "thisRef");
        k71.k.g(eVar, "property");
        Bundle extras = activity.getIntent().getExtras();
        Object obj = extras != null ? extras.get(this.f5923a) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(m0 m0Var, r71.e eVar, String str) {
        k71.k.g(eVar, "property");
        Intent intent = m0Var.getIntent();
        k71.k.d(intent);
        String str2 = this.f5923a;
        if (str != 0) {
            k71.k.f(intent.putExtra(str2, str), "putExtra(...)");
            return;
        }
        if (str instanceof Parcelable) {
            k71.k.f(intent.putExtra(str2, (Parcelable) str), "putExtra(...)");
        } else if (str != 0) {
            k71.k.f(intent.putExtra(str2, (Serializable) str), "putExtra(...)");
        } else if (str != 0) {
            throw new IllegalStateException("unsupported type of field ".concat(str2));
        }
    }
}
