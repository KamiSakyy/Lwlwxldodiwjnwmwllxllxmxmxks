package com.github.rudroid.activities.util;

import android.content.Context;
import android.content.Intent;
import com.github.rudroid.activities.s3;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class e<I, O> extends y9.a {

    /* renamed from: e, reason: collision with root package name */
    public c f5920e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(14);
        k71.k.g(cVar, "activityAccountHolder");
        this.f5920e = cVar;
    }

    public abstract Intent R(Context context, Object obj);

    @Override // y9.a
    public final Intent l(Context context, Object obj) {
        return s3.a(R(context, obj), this.f5920e.d());
    }
}
