package a71;

import java.io.Serializable;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements h, Serializable {
    public static final i r = new i();

    @Override // a71.h
    public final h A(h hVar) {
        k.g(hVar, "context");
        return hVar;
    }

    @Override // a71.h
    public final h b0(g gVar) {
        k.g(gVar, "key");
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // a71.h
    public final f w0(g gVar) {
        k.g(gVar, "key");
        return null;
    }

    @Override // a71.h
    public final Object x0(j71.e eVar, Object obj) {
        return obj;
    }
}
