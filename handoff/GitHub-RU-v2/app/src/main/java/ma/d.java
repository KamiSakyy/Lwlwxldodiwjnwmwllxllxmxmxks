package ma;

import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloWebSocketClosedException;
import q81.h0;
import v71.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends com.google.common.util.concurrent.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f29140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x71.h f29141b;

    public d(r rVar, x71.h hVar) {
        this.f29140a = rVar;
        this.f29141b = hVar;
    }

    public final void G(g91.f fVar, int i, String str) {
        k71.k.g(fVar, "webSocket");
        k71.k.g(str, "reason");
        this.f29141b.e((Throwable) null);
    }

    public final void H(h0 h0Var, int i, String str) {
        this.f29140a.X(a0.a);
        this.f29141b.n(new ApolloWebSocketClosedException("WebSocket Closed code='" + i + "' reason='" + str + '\'', null), false);
    }

    public final void I(g91.f fVar, Exception exc, q81.a0 a0Var) {
        k71.k.g(fVar, "webSocket");
        this.f29140a.X(a0.a);
        this.f29141b.n(new ApolloNetworkException(exc, "Web socket communication error"), false);
    }

    public final void J(h0 h0Var, h91.k kVar) {
        this.f29141b.j(kVar.r());
    }

    public final void K(h0 h0Var, String str) {
        this.f29141b.j(str);
    }

    public final void L(h0 h0Var, q81.a0 a0Var) {
        this.f29140a.X(a0.a);
    }
}
