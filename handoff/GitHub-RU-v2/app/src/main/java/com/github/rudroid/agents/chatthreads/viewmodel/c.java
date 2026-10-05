package com.github.rudroid.agents.chatthreads.viewmodel;

import com.github.rudroid.utilities.w0;
import java.util.List;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class c<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f6718r;

    public c(m mVar) {
        this.f6718r = mVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        List list = (List) obj;
        y1 y1Var = this.f6718r.f6741x;
        if (list.isEmpty()) {
            w0.k(y1Var);
        } else {
            w0.p(y1Var, list);
        }
        return a0.a;
    }
}
