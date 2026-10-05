package com.github.rudroid.actions.checklog;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import java.util.ArrayList;

@c71.e(c = "com.github.rudroid.actions.checklog.CheckLogViewModel$copySelectionInClipboard$1$1", f = "CheckLogViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class y extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4909v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ClipboardManager f4910w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Application f4911x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ArrayList arrayList, ClipboardManager clipboardManager, Application application, a71.c cVar) {
        super(2, cVar);
        this.f4909v = arrayList;
        this.f4910w = clipboardManager;
        this.f4911x = application;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new y(this.f4909v, this.f4910w, this.f4911x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        y r10 = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.f4910w.setPrimaryClip(ClipData.newPlainText(this.f4911x.getString(2131951798), x61.m.c0(this.f4909v, "\n", (String) null, (String) null, 0, new t(1), 30)));
        return w61.a0.a;
    }
}
