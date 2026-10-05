package ao;

import aa.h0;
import aa.i0;
import aa.m0;
import aa.n0;
import aa.r0;
import aa.s0;
import aa.w0;
import com.github.service.wrapper.b;
import com.github.service.wrapper.j;
import ga.h;
import j71.c;
import j71.e;
import java.util.Set;
import k71.k;
import y71.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements com.github.service.wrapper.a, b, j {
    public final Object c(i0 i0Var, String str) {
        throw new IllegalStateException("readFromCache should never be called on this adapter");
    }

    public final i d(n0 n0Var) {
        throw new IllegalStateException("fetchWithPartialResultErrors should never be called on this adapter");
    }

    public final i e(n0 n0Var, i0 i0Var, String str, c cVar) {
        k.g(str, "id");
        throw new IllegalStateException("mutate should never be called on this adapter");
    }

    public final Object f(s0 s0Var) {
        throw new IllegalStateException("readFromCache should never be called on this adapter");
    }

    public final i g(w0 w0Var, h hVar, boolean z, Set set, Set set2, e eVar, c cVar) {
        k.g(w0Var, "query");
        k.g(hVar, "fetchPolicy");
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        k.g(eVar, "addFailureMetaData");
        throw new IllegalStateException("query should never be called on this adapter");
    }

    public final Object h(String str, Set set, a71.c cVar) {
        throw new IllegalStateException("deleteFromCache should never be called on this adapter");
    }

    public final i i(w0 w0Var, h hVar, boolean z, Set set, Set set2, e eVar, c cVar) {
        k.g(w0Var, "query");
        k.g(hVar, "fetchPolicy");
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        k.g(eVar, "addFailureMetaData");
        throw new IllegalStateException("observeWithPartialResultErrors should never be called on this adapter");
    }

    public final Object j(s0 s0Var, r0 r0Var, a71.c cVar) {
        throw new IllegalStateException("storeInCache should never be called on this adapter");
    }

    public final i k(n0 n0Var, m0 m0Var) {
        k.g(n0Var, "mutation");
        throw new IllegalStateException("mutate should never be called on this adapter");
    }

    public final i l(w0 w0Var, h hVar, boolean z, Set set, Set set2, com.github.rudroid.utilities.ui.emojipicker.e eVar) {
        k.g(w0Var, "query");
        k.g(hVar, "fetchPolicy");
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        throw new IllegalStateException("query should never be called on this adapter");
    }

    public final i m(w0 w0Var, h hVar, boolean z, Set set, Set set2, com.github.rudroid.utilities.ui.emojipicker.e eVar) {
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        throw new IllegalStateException("query should never be called on this adapter");
    }

    public final Object p(i0 i0Var, h0 h0Var, String str, a71.c cVar) {
        throw new IllegalStateException("storeInCache should never be called on this adapter");
    }
}
