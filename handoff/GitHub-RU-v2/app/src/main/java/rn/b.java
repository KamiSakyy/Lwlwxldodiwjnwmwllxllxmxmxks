package rn;

import g91.f;
import go0.z;
import java.io.IOException;
import k71.k;
import q81.a0;
import q81.h0;
import y71.m1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends com.google.common.util.concurrent.a {
    public static final a Companion = new a();
    public Object a;

    public b(z zVar) {
        this.a = zVar;
    }

    public final void G(f fVar, int i, String str) {
        k.g(fVar, "webSocket");
        k.g(str, "reason");
        k.g("onClosed: " + i + " " + str, "message");
        ((z) this.a).u();
    }

    public final void H(h0 h0Var, int i, String str) {
        k.g("onClosing: " + i + " " + str, "message");
    }

    public final void I(f fVar, Exception exc, a0 a0Var) {
        String str;
        f fVar2;
        k.g(fVar, "webSocket");
        k.g("onFailure: " + (a0Var != null ? a0Var.t : null) + " throwable: " + exc, "message");
        boolean z = exc instanceof IOException;
        Object obj = this.a;
        if (!z) {
            m1 q = ((z) obj).q();
            if (a0Var == null || (str = a0Var.t) == null) {
                str = "failure without message";
            }
            q.m(str);
            return;
        }
        z zVar = (z) obj;
        switch (zVar.r) {
            case 0:
                fVar2 = zVar.A;
                break;
            case 1:
                fVar2 = zVar.A;
                break;
            case 2:
                fVar2 = zVar.A;
                break;
            default:
                fVar2 = zVar.A;
                break;
        }
        if (fVar2 != null) {
            fVar2.b("", 1000);
        }
        ((z) obj).u();
        ((z) obj).q().m("APOLLO_ALIVE_SERVICE_IO");
    }

    public final void J(h0 h0Var, h91.kShadow kVar) {
        k.g("onMessage bytes (skipping because not supported for now) " + kVar, "message");
    }

    public final void K(h0 h0Var, String str) {
        k.g("onMessage on " + h0Var.hashCode() + " String " + str, "message");
        ((z) this.a).q().m(str);
    }

    public final void L(h0 h0Var, a0 a0Var) {
        String str = a0Var.t;
        k.g("onOpen: " + str, "message");
        ((z) this.a).q().m(str);
    }
}
