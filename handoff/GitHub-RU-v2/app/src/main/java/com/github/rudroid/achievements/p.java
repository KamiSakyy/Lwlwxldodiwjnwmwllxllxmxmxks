package com.github.rudroid.achievements;

import com.github.rudroid.utilities.w0;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class p<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f4463r;

    public p(k kVar) {
        this.f4463r = kVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final Object c(Object obj, a71.c cVar) {
        jn.i iVar = (jn.i) obj;
        y1 y1Var = this.f4463r.A;
        if (iVar.b.isEmpty()) {
            w0.l(y1Var, iVar);
        } else {
            w0.p(y1Var, iVar);
        }
        return a0.a;
    }
}
